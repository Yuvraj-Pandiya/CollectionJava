import java.util.*;
class Practise
{
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println(al.remove(2));
		System.out.println(al.remove("40"));
		System.out.println(al);
	}
}