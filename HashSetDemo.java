import java.util.HashSet;
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
	}
} 