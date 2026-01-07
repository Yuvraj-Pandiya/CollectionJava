// import java.util.LinkedList;
import java.util.*;
class LinkedListDemo
{
	public static void main(String []args)
	{
		// Constructor 1
		// Creates empty linked list object
		LinkedList l1=new LinkedList();
		System.out.println(l1);// [] 
		
		// Constructor 2
		// Creates an equivalent LinkedList Object for given Collection
		LinkedList l2=new LinkedList(l1);
		System.out.println(l2);// [] 
		
		/* Note: here capacity such type constructor not available because it works 
		internally on the basis of Doubly linked list it means concept is same exact
		like node creation at runtime or as per our use and connect the linking.
		  Note2: LinkedList is implementation class for List interface for 
		  queue and stack purpose we can use linkedlist the only thing it gives
		  as a benefit is it contain retrieval so we can access through traversal.
		*/
		// All the method which we have learn in ArrayList which are implemented from 
		// collection and list interface are also available in LinkedList.
		
		// Some other methods we have to learn:-
		
		//Methods:-
		
		l1.add(12);
		l1.add(13);
		l1.add(14);
		System.out.println(l1);
		
		// 1. void addFirst(Object o) (implemented from Deque interface in LinkedList)
		
		l1.addFirst("First");//Adds element at the head / starting
		System.out.println(l1);
		
		// 2. void addLast(Object o) (implemented from Deque interface in LinkedList)
		l1.addLast("Last");
		System.out.println(l1);
		
		
		// 3. Object getFirst() (implemented from Deque interface in LinkedList)
		System.out.println(l1.getFirst());
		
		// 4. Object getLast() (implemented from Deque interface in LinkedList)
		System.out.println(l1.getLast());
		
		
		// 5. Object removeFirst() (implemented from Deque interface in LinkedList)
		System.out.println(l1.removeFirst());
		System.out.println(l1);
		
		// 6. Object removeLast() (implemented from Deque interface in LinkedList)
		System.out.println(l1.removeLast());
		System.out.println(l1);
		
 	}
}