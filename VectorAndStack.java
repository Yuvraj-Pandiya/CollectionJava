import java.util.Vector;
import java.util.Stack;
class VectorAndStack
{
	//Working of Vector
	public static void vector()
	{
		//Constructors Of Vector 
		/*
		extends AbstractList and implements java.util.List,
		java.util.RandomAccess, java.io.Serializable , java.lang.Cloneable
		*/
		
		Vector v1=new Vector();
		/* Initial Size is 10
		When it reaches its max Capacity then a new Vector object is
		Created with new Capacity= currentCapacity*2
		*/
		System.out.println(v1); // []
		
		Vector v2=new Vector(14);
		// Vector v2=new Vector(int intitialCapacity);
		/* Initial Size is now 14
		When it reaches its max Capacity then a new Vector object is
		Created with new Capacity= currentCapacity*2
		*/
		System.out.println(v2); // []
		
		
		Vector v3=new Vector(12,5);
		// Vector v2=new Vector(int intitialCapacity,int incrementalCapacity);
		/* Initial Size is now 12 and then -> 17 -> 22 -> 27 and so on 
		When it reaches its max Capacity then a new Vector object is
		Created with new Capacity= currentCapacity+given value
		*/
		System.out.println(v3); // []
		
		
		Vector v4=new Vector(v1);
		// Vector v2=new Vector(Collection c);
		/*
		Gives Equivalent Vector object for the given Collection
		*/
		System.out.println(v4); // []
		
		//Vector Specific Methods 
		/* Note : It has its own method also because it is legacy class
		and it also have Collection methods and List methods (Both 
		Interfaces) Means this Vector class is ReEngineered or Remodified
		*/
		
		// To add an Object
		// boolean add(Object o) -> From Collection  
		// void add(int index,Object o) -> From List
		// void addElement(Object o) --> In Vector
		
		//To remove Objects 
		// boolean remove(Object o) -> From Collection
		// boolean removeElement(Object o) -> From vector
		// void removeElementAt(int index) -> From vector
		// T remove(int index) --> from list
		// void clear() --> Collection
		// void removeAllElements() --> vector
		
		// To get Objects
		// Object get(int index) --> List
		// Object elementAt(int index) --> Vector
		// Object firstElement() --> Vector
		// Object lastElement() --> Vector
		
		// Other Methods 
		// int size()
		// int capacity()
		// Enumeration elements()
		
		
		// Ex1 Why capacity method not in ArrayList and all reason ?
		System.out.println(v1.capacity());
		System.out.println(v2.capacity());
		System.out.println(v3.capacity());
		System.out.println(v4.capacity());
		
		for(int i=1;i<=10;i++)
		{
			v1.addElement(i);
		}
		System.out.println(v1.capacity());
		v1.addElement("A");
		System.out.println(v1.capacity());
		System.out.println(v1);
		
	}
	
	//Working of Stack
	public static void stack()
	{
		/*Lagbhag Sari Property Same he 
		Child class of Vector 
		Specifically Designed class for Last in First Out Order (LIFO)
		*/
		
		//Constructors 
		
		Stack s1=new Stack();
		System.out.println(s1); //[]
		
		//Stack Specific Methods 
		
		// 1. E push(E) to insert object into stack of type E
		// 2. E pop() to remove and return top of the stack
		// 3. E peek() without removal return top of the stack
		// 4. boolean empty() returns true if stack is empty
		// 5. int search(Object o) returns offset if the element is available 
		//                         Otherwise returns -1
		
		/* Ex for understanding 
		suppose stack has we pushed first a,b,c in order then its index
		will be a-0 ,b-1 ,c-2 but the offset will be a-3,b-2,c-1
		*/
	}
	
	public static void main(String[]args)
	{
		vector();
		stack();
	}
}