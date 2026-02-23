//MenuDrivenProgram For LinkedList
/*
Operations Performed on linkedlist:-
1.Insertion 
a) at beginning
b) at end
c) after the given value
d) at specific value
2.Deletion 
a) at beginning
b) at end
c) of given value
d) at specific value
*/
import java.util.*;
class Practise5
{
	public static void main(String[]args)
	{
		
		LinkedList l = new LinkedList();
		// For taking input
		int x;
		//For input values in list
		int value;
		//For index
		int index;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("[Press 0] --Exit Program--");
			System.out.println("[Press 1] --Insertion at Beginning--");
			System.out.println("[Press 2] --Insertion at Ending--");
			System.out.println("[Press 3] --Insertion after the given value--");
			System.out.println("[Press 4] --Insertion at specific position--");
			System.out.println("[Press 5] --Deletion at Beginning--");
			System.out.println("[Press 6] --Deletion at Ending--");
			System.out.println("[Press 7] --Deletion at Specific Position--");
			System.out.println("[Press 8] --Deletion of particular value--");
			System.out.println("[Press 9] --Search a particular value--");
			System.out.println("--Enter the Operation number you want to Peform:-");
			x=sc.nextInt();
			switch(x)
			{
				case 0:
				System.out.println("Program Exited");
			    break;
			    case 1:
				System.out.println("Enter the value to insert:");
				value=sc.nextInt();
				l.addFirst(value);
				break;
				case 2:
				System.out.println("Enter the value to insert:");
				value=sc.nextInt();
				l.addLast(value);
				break;
				case 3:
				System.out.println("Enter the value after which you want to insert:");
				value=sc.nextInt();
				index=l.indexOf(value);
				if(index!=-1)
				{
					System.out.println("Enter VAlue you want to insert:");
					l.add(index+1,sc.nextInt());
				}
				else
				{
					System.out.println("Element Does not exist");
				}
				break;
				case 4:
				System.out.println("Enter the position to insert:");
				index=sc.nextInt();
				if(index<=-1 || index>l.size())
				{
					System.out.println("Invalid index");
				}
				else 
				{
					System.out.println("Enter value to insert:");
					value=sc.nextInt();
					l.add(index,value);
					System.out.println("Inserted Successfully");
				}
				break;
				
				case 5:
				System.out.println("Deletion at beginning");
				if(!l.isEmpty())
					l.removeFirst();
				else
				    System.out.println("List is Empty");
				break;
				
				case 6:
				System.out.println("Deletion at ending");
				if(!l.isEmpty())
					l.removeLast();
				else
				    System.out.println("List is Empty");
				break;
				
				case 7:
				System.out.println("Enter the index you want to perofrm deletion:");
				index=sc.nextInt();
				if(index<=-1 || index>l.size())
				{
					System.out.println("Invalid index");
				}
				else
				{
					l.remove(index);
					System.out.println("element removed");
				}
				break;
				
				case 8:
				System.out.println("Enter the value u want to delete:");
				Integer z=sc.nextInt();
				l.remove(z);
				break;
					
				case 9:
				System.out.println("Enter the value u want to search:");
				value=sc.nextInt();
				int result=l.indexOf(value);
				if(result!=-1)
				{
					System.out.println("Element found at index:" + result);	
				}
				else
				{
					System.out.println("Element Not found" );	
				}
				break;
			}
			System.out.println(l);
			System.out.println("\n\n\n\n");
			
		}while(x!=0);
	}
}