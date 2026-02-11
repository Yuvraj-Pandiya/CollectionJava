import java.util.TreeSet;
class Practise3
{
	public static void main(String []args)
	{
		/* ex1
		TreeSet s1=new TreeSet();
		s1.add("ram");
		s1.add("sita");
		s1.add("gita");
		s1.add("abhi");
		System.out.println(s1); 
		OP:-[abhi, gita, ram, sita]
		*/
		
		//ex2
		TreeSet s1=new TreeSet();
		s1.add(new StringBuffer("ram"));
		s1.add(new StringBuffer("sita"));
		s1.add(new StringBuffer("gita"));
		s1.add(new StringBuffer("abhi"));
		System.out.println(s1);
	}
}