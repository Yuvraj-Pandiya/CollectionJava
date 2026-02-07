import java.util.LinkedHashSet;
import java.util.*;
public class LinkedHashSetDemo
{
	public static void main(String[]args)
	{
		LinkedHashSet h1=new LinkedHashSet();
		
		//1.Insertion Order IS Preserved  , No Dupplicate Allowed
		h1.add(1);
		h1.add(13);
		h1.add(15);
		h1.add(15);
		h1.add(35);
		System.out.println(h1);//O/p:-[1, 13, 15, 35]
		
		//2.Heterogeneous and  Null Insertion Possible
		h1.add("abc");
		h1.add("abc");
		h1.add(null);
		h1.add(null);
		System.out.println(h1);//O/p:-[1, 13, 15, 35, abc, null]
		
		
		//Constructors Types:- 
		/* 1. public java.util.LinkedHashSet()
		2. public java.util.LinkedHashSet(int )
		3. public java.util.LinkedHashSet(int , float)
		4. public java.util.LinkedHashSet(java.util.Collection<? extends E>) */
		
		ArrayList al=new ArrayList();
		al.add(23);
		al.add(2324);
		al.add(434);
		al.add(434);
		al.add(4);
		al.add(4);
		al.add(69);
		al.add(69);
		LinkedHashSet h2=new LinkedHashSet(al);
		HashSet h3=new HashSet(al);
		System.out.println(h2);
		System.out.println(h3);
		
		// LinkedHashSet h4=new LinkedHashSet(-20)	;
		//Exception : IllegalArgumentException
		// LinkedHashSet h5=new LinkedHashSet(20,0.4);
		//Error : incompatible types: possible lossy conversion from double to float
		LinkedHashSet h6=new LinkedHashSet(20,0.4f);
		// Error Solved
		LinkedHashSet h7=new LinkedHashSet(20,-0.4f);
		//Exception : IllegalArgumentException
	}
}