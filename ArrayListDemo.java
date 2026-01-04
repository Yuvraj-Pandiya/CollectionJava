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
	}
}