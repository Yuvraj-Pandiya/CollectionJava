import java.util.*;
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
}