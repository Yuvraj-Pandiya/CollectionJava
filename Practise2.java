import java.util.*;
public class Practise2
{
	public static void main(String[]args)
	{
		String s="my name is ram is ram";
		String s1[]=s.split(" ");
		HashSet hs=new HashSet();
		LinkedHashSet lhs=new LinkedHashSet();
		for(String temp:s1)
		{
			hs.add(temp);
			lhs.add(temp);
		}
		System.out.println(hs);
		System.out.println(lhs);
	}
}