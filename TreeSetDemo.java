import java.util.TreeSet;
public class TreeSetDemo
{
	public static void main(String []args)
	{
		//Points:
		/*
		1.UnderLying D.S is Balanced Tree;
		2.Duplicate Objects Are Not Allowed
		3.Insertion Order NOt Preserved
		4.Heterogeneous Object are not Allowed otherwise we will get 
		runtime exception saying ClassCastException
		5.Null insertion possible only once
		6.It implements Serializable,Cloneable but not RandomAccess
		7. All objects will be inserted based on some sorting order it 
		may be defauklt natural sorting order or customized sorting order.
		*/
		
		TreeSet t=new TreeSet();
		t.add(100);
		t.add(11);
		t.add(30);
		t.add(50);
		System.out.println(t);
	}
}