import java.util.TreeSet;
class Employee implements Comparable
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
		return "id="+id+"  name="+name;
	}
	// Case1: JIs order me insert kara us order me hi op ayega 
	/* public int compareTo(Object o)
	{
		return 1;  // Means +ve Value ko return kar rha he
 	} */
	//[id=101  name=aaa, id=102 name=bbb, id=103 name=ccc]


	// Case2: Jis order me insert kara us reverse me  op ayega 
    /* public int compareTo(Object o)
	{
		return -1; //Means -ve value ko return kar rha he
		//It can be any -ve number 
	}  */
	// [id=103  name=ccc, id=102  name=bbb, id=101  name=aaa]
	
	
	// Case3:  
    /* public int compareTo(Object o)
	{
		return 0; 
	}  */
	//Do same values/elements ka difference zero hota he means
	// duplicate value, & TreeSet me hum duplicate value add nhi kar
	// skte hai isisliye sirf first element hi add hoga.
	// [id=101  name=aaa]
	
	
	// Case4:  
    /* public int compareTo(Object o)
	{
		return id-o.id; 
	}  */
	//1. Error: Object class does not have id variable compile time checks
	
	
	// Case5:  
    /* public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		return id-e.id; 
	} */
	// id ke corresponding data sorted order me akar display hoga
	// [id=101  name=aaa, id=102  name=bbb, id=103  name=ccc]
	
	// Case6:  
    /* public int compareTo(Object o)
	{
		Employee e=(Employee)o;
		return e.id-id; 
	} */
	// id ke corresponding data sorted descending order me akar display hoga
	// [id=103  name=ccc, id=102  name=bbb, id=101  name=aaa]


}
class Practise4
{
	public static void main(String []args)
	{
		TreeSet t1=new TreeSet();
		t1.add(new Employee(101,"aaa"));
		t1.add(new Employee(102,"bbb"));
		t1.add(new Employee(103,"ccc"));
		System.out.println(t1);
	}
}