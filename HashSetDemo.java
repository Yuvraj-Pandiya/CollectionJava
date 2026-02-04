import java.util.HashSet;
import java.util.ArrayList;
class HashSetDemo
{
	public static void main(String[]args)
	{
		/* Properties and its info.
		The Underlineds D.S for HashSet is hashtable.
		Duplicate objects are not allowed 
		Insertion order is not preserved but based on hashcode of object.
		Null insertion is possible but only once.
		Heterogeneous object allowed
		Implements Serializable,Cloneable but not RandomAccess
		Frequent , Common , Best Choice in Searching 
		(No.1 Search algo Hashing) O(1)
		
		*/
		
		//Constructors:
		
		// 1. HashSet h1=new HashSet();
		/* DefaultInitialCapacity -> 16
		   DefaultFillRatio (Load Factor) -> 0.75 
		   (meaning: Itna fill hone par naya create karo taki wait nhi 
		   karna padhe 100% complete hone ke baad)*/
		HashSet h1=new HashSet();
		System.out.println(h1); //O/p:- []
		
		// 2. HashSet h2=new HashSet(int initialCapacity);
		/* Creates an empty hashset object with specified initial capacity
		 and default fill ratio 0.75*/
		 HashSet h2=new HashSet(24);
		 System.out.println(h2);
		 
		 // 3. HashSet h2=new HashSet(int initialCapacity,float FillRatio);
		/* Creates an empty hashset object with specified initial capacity
		 and specified fill ratio 
		 If we pass wrong means in place of load factor negative value then
		 we will get IllegalArgumentException:Illegal Load Factor : -1.0
		 For Load Factor:-
		 Lower values → less chance of collisions but more memory usage.
		 Higher values → more compact but higher chance of collisions.
		 */
		 HashSet h3=new HashSet(4,2.0f);
		 /*
		 Initial capacity = 4 buckets.
		 Threshold = 4 × 2.0 = 8.
		 You can insert up to 8 elements before resizing happens.
		 But since there are only 4 buckets, collisions will pile
		 up in those buckets → performance suffers.
		 
		 Resizing HAppend when size > capacity * loadfactor
         by factor of new capacity => old capacity * 2 ;	 
		 */
		 System.out.println(h3);
		 
		 /*
		 HashSet h4= new HashSet(Collection c1);
		 Creates an equivalent HashSet for the given Collection.
		 This constructor meant for interconversion b/w Collection
		 Objects;
		 */
		 HashSet h4= new HashSet(h2);
		 System.out.println(h4);
		 
		 /*
		 Note: FillRatio/LoadFactor-- After filling how much ratio a new HashSet 
		 Object will be created, this ratio is called l.f or f.r;
		 */
		 
		 h1.add("C");
		 h1.add("B");
		 h1.add("Z");
		 h1.add(null);
		 h1.add("D");
		 h1.add(10);
		 System.out.println(h1.add("Z")); // Return false becoz 
		 // add from Collection and return boolean duplicate cant
		 //be inserted in HashSet i.e why false returning
		 System.out.println(h1);
		 
		 
		 // Duplicates got removed from arraylist while converting to HashSet
		 ArrayList l1=new ArrayList();
		 l1.add(12);
		 l1.add(2);
		 l1.add(42);
		 l1.add("Ram");
		 l1.add("Ram");
		 l1.add(2);
		 l1.add(6);
		 l1.add(98);
		 l1.add(null);
		 l1.add(null);
		 HashSet h5=new HashSet(l1);
		 System.out.println(l1);
		 System.out.println(h5);
		 
		 /*5. Constructor 
		 java.util.HashSet(int ,float,boolean);
		 We can not use this constructor hashset internally uses this 
		 constructor.
		 */
		 
		 //boolean contains(Object) method 
		 System.out.println(h5.contains(2));
		 System.out.println(h5.contains(200));
		 
		 //boolean remove(Object) Collection remove method
		 System.out.println(h5.remove(2));
		 System.out.println(h5.remove(200));
		 
		 //int size()
		 System.out.println(h5.size());
		 
		 // System.out.println(h5.capacity()); //Error
		 
		 //void clear()
		 System.out.println(h5);
		 h5.clear();
		 System.out.println(h5);
		 
		 //boolean isEmpty()
		 System.out.println(h5.isEmpty());
		 h5.add(34);
		 h5.add(3);
		 h5.add(7);
		 h5.add("dadda");
		 System.out.println(h1.isEmpty());
		 System.out.println(h5.isEmpty());
		 
		 //Next Topic is RabinKarpAlgorithm..HashSet 
		 // (hashCode,equals,toString)
	}
} 