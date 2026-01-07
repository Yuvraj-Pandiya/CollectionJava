//Implementation Class of List (Interface)
// import java.util.ArrayList;
import java.util.*;
class ArrayListDemo
{
	public static void main(String[] arg)
	{
		// Constructor 1
		ArrayList al1=new ArrayList(); // Present in util package 
		/* Creates a new ArrayList Object (Empty) with Default Initial Capacity of 10.
		   When it reaches it MaxCapacity then a new ArrayList Object will be created
		   According to Formula new Capacity=(currentCapacity * 3/2)+1 i.e 10,16,25...
		*/
		System.out.println(al1); //Output:- [] 
		
		//Constructor 2
		ArrayList al2=new ArrayList(1000);
		/* Problem (If there we have requirement of Fixed size as, we know intially 
		how many elements will come then using the first constructor is not a good 
		choice because its overhead and lengthy(Internal Working should be clear 
		first) process when it reaches its Limit.)
		We can Pass argument/Parameter in Constructor as int initialCapacity
		It creates an Empty ArrayList Object with specified initial Capacity.
		*/
		System.out.println(al2); //Output:- []
		System.out.println(al2.size()); // O/p:- 0 
		//because Capacity → how many elements it can hold
		//Size → how many elements it currently has
		//ArrayList capacity cannot be accessed directly; only size is available.
		//Capacity is an internal detail of the implementation.(However by reflection possible)
        
		//Constructor 3
		ArrayList al3=new ArrayList(al2);
		/*Here the third one is , we can pass any Collection it Creates equivalent 
		ArrayList Object for the Given Collection.
		*/
		System.out.println(al3); //Output:- []
		
		/*Above we are getting a [] brackets whenever we are passing object in S.o.pln
      	the reason behind this is whenever we print any object in sopln toString()
		method of object class would be called and it will give output in form of 
		class_name@hexadecimalnumber but this was overrided and its definition is 
		changed that's why we are getting this output further we will see ouput's
		so its more clear what's the format of output is..
		*/
		
		// Methods and Working
		// 1. boolean add(Object el) (implemented From Collection in ArrayList)
		al1.add("A");
		al1.add(10);
		al1.add("A");
		al1.add(null);
		System.out.println(al1.add(null));
		System.out.println(al1);//[A,10,A,null]
		
		/* 2. i) boolean remove(Object element) (implemented From Collection in ArrayList)
              but works only when we use on Collection object(i.e r.v.) 
              ii) Object remove(int index)	(implemented From List in ArrayList)
              but works only when we use on List object(i.e r.v.)
              Note: Works on ArrayList Object both methods as per paramter (reason overloaded)			  
		*/      
		al1.remove(2);
		System.out.println(al1.remove(2));
		System.out.println(al1);//[A,10,A,null]
		Collection c1=new ArrayList();
		c1.add(12);
		c1.add(123);
		c1.add(124);
		System.out.println(c1.remove(2));
		System.out.println(c1);
		
		/* 3. void add(int index,Object element) (implemented from List in ArrayList 
		                                         becoz of index)
			Takes O(n) Complexity (Because Shifting Takes Place)
		*/
		// al2.add(1,20);
		/*Here Exception occur on the above why because ArrayList size is 0 and we are trying
		to add element on 1 index that's why ArrayIndexOutOfBoundsException occur*/
		al2.add(0,20); //This will run Properly 
		al2.add(12);
		al2.add(15);
		al2.add(18);
		al2.add(3,899);
		System.out.println(al2);
		
		
		/* 4. i) boolean addAll(Collection c) (implemented From Collection in ArrayList)
		Adds all elements at the end
		      ii) boolean addAll(int index,Collection c) (implemented From List in ArrayList)
	    Inserts all elements starting at given index
		*/
		
		System.out.println(al2);
		al2.addAll(al1);
		System.out.println(al1);
		System.out.println(al2);
		
		al2.addAll(4,al1);//If index goes out of bound it will give ArrayIndexOutOfBoundsException 
		System.out.println(al1);
		System.out.println(al2);
		
		/* 5. boolean removeAll(Collection c) (implemented From Collection in ArrayList)
		remove all elements from arraylist 
		Interesting: java 8 
		boolean removeIf(Predicate<? super E> filter);
		Usage list.removeIf(n -> n % 2 == 0); // removes even numbers
		*/
		System.out.println(al1);
		System.out.println(al2);
		al2.removeAll(al1);
		System.out.println(al2);
		
		/* 6. boolean retainAll(Collection c) (implemented from collection in ArrayList)
		Keeps only the elements that are present in the given collection removes everything else
		*/

		al2.addAll(al1);
		System.out.println(al1);
		System.out.println(al2);
		al2.retainAll(al1);
		System.out.println(al2);
		
		/* 7. Object get(int index) (implemented from List in ArrayList)
		*/
		
		// System.out.println(al1.get(8));ArrayIndexOutOfBoundsException
		System.out.println(al1.get(0));
		System.out.println(al1.get(1));
		System.out.println(al1.get(2));
		
		/* 8. Object set(int index,Object new) (implemented from List in ArrayList)
		Replaces, no shifting, size same, return the replaced object
		*/
		
		System.out.println(al1.set(0,"Element1"));
		System.out.println(al1.set(1,"Element2"));
		System.out.println(al1.set(2,"Element3"));
		// System.out.println(al1.set(3,"Element4")); ArrayIndexOutOfBoundsException
		System.out.println(al1);
		
		/* 9. int indexOf(Object element) (implemented from List in ArrayList)
		return index of first occurance of element
		      int lastIndexOf(Object 0) (implemented from List in ArrayList)
		*/
		al1.add("Element4");
		al1.add("Element4");
		al1.add("Element4");
		System.out.println(al1);
		System.out.println(al1.indexOf("Element4"));
		System.out.println(al1.lastIndexOf("Element4"));
		
		/* 10. ListIterator listIterator(); (implemented from list interface in ArrayList)
		It is List-specific (because of index & bidirectional traversal
		ArrayList & LinkedList provide their own optimized versions
		*/
		ListIterator it = al1.listIterator();
		while (it.hasNext())
		{
			Object val= it.next();
			if(val == "Element4") {
				it.set("SetElementUsingIterator");     // replace
				it.add(22);     // insert
			}
		}
		System.out.println(al1);
		
		/* 11. void clear() (implemented from Collection in ArrayList)
		removes all elements from a collection
		*/
		System.out.println(al2);
		al2.clear();
		System.out.println(al2);
		
		/* 12. boolean contains(Object element) (implemented from Collection in ArrayList)
		       boolean containsAll(Collection c) (implemented from Collection in ArrayList)
			   T.C = O(n) uses equals method 
		*/
		al2.add(232);
		al2.add(23);
		al2.add(4222);
		System.out.println(al1.contains("Element2"));
		System.out.println(al1.containsAll(al2));
		
		/* 13. boolean isEmpty() (implemented from Collection in ArrayList)
		       int size() (implemented from Collection in ArrayList)
		*/
		System.out.println(al3.isEmpty());
		System.out.println(al2.size());		
	}
}
/* Where ArrayList Preffered?
Ans:- when there is retrieval operation,
    but when it somes to insertion and deletion somewhere at mid 
	it is not preferred because too much shifting would take place.	
*/