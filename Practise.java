/* import java.util.*;
class Practise
{
	public static void main(String[]args)
	{
		HashSet h=new HashSet();
		h.add(new Employee(10,"aaa"));
		h.add(new Employee(10,"aaa"));
		h.add(new Employee(10,"aaa"));
		//Teno Object ka Refernce Alga he isiliye add ho jayege teno.
		System.out.println(h);
		//Befor overriding toString() output:
		// [Employee@30f39991, Employee@452b3a41, Employee@a09ee92]

		
		//Teno alg alg object he isisliye teen bar 10 arha he 
		System.out.println(h); //[10,10,10]
		
		// Step2
		System.out.println(h); //[10,10,10]
		
		//Step3.
		
		System.out.println(h); //[10,10,10]
		// if equals return false then this output
		
		System.out.println(h); //[10]
		// if equals return true then this output
	}
}
class Employee
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	// Step 1 
	public String toString()
	{
			return ""+id;
	}
	
	// Step 2
	public int hashCode()
	{
		return 50;
	}
	
	//Step 3
	public boolean equals(Object o)
	{
		// return false;
		return true;
	}
} */


import java.util.*;
class Practise
{
	public static void main(String[]args)
	{
		HashSet h= new HashSet();
		// // Case1
		// h.add(101);
		// System.out.println(h);
		// h.add(new Employee(101,"aaa"));
		// // Exception : CCE (ClassCastException)
		// System.out.println(h);
		
			// Case2
		// h.add(new Employee(101,"aaa"));
		// System.out.println(h);
		// h.add(101);
		// System.out.println(h);
		
			// Case3
		// h.add(new Employee(101,"aaa"));
		// System.out.println(h);
		// h.add(101);
		// System.out.println(h);
		// h.add(new Employee(101,"aaa"));
		// System.out.println(h);
		
		// Case 4
		// h.add(new Employee(101,"aaa"));
		// System.out.println(h);
		// h.add(101);
		// System.out.println(h);
		// h.add(new Employee(101,"bbb"));
		// System.out.println(h);
		
		// Case 5
		// h.add(new Employee(101,"aaa"));
		// h.add(101);
		// h.add(new Employee(101,"aaa"));
		// h.add(new Employee(101,"bbb"));
		
		// Case 6
		// h.add(new Employee(101,"aaa"));
		// h.add(new Employee(101,"aaa"));
		// h.add(new Employee(101,"bbb"));
		// h.add(101);
		// h.add(new Employee(101,"ddd"));
		// System.out.println(h);
	}
}
class Employee
{
	int id;
	String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
			return "id="+id+"\t name="+name;
	}
	
	public int hashCode()
	{
		System.out.println("HashCode");
		return id;
	}
	
	public boolean equals(Object o)
	{
		System.out.println("Equals");
		Employee e=(Employee)o;
		if(id==e.id && name.equals(e.name))
			return true;
		else
			return false;
	}
}