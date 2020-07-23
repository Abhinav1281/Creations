package Creations;



public class Mystack <A>
{
	class node
	{
		A data;
		node prev;
		node next;
		
		node(A data)
		{
			this.data=data;
			prev=null;
		}
		node()
		{
			prev=null;
			next=null;
		}
	}
	
	node head = new node();
	
	public void push(A data)
	{
		node temp= new node(data);
		if(head==null)
		{
			head=temp;
			return;			
		}
		temp.next=head;
		head=temp;
	}
	
	public A pull()
	{
		if(head==null)
		{
			System.out.println("NO DATA");
			return null;
		}
		A val=head.data;
		head=head.next;
		return val;
	}
	
	public A peek()
	{
		if(head==null)
		{
			System.out.println("NO DATA");
			return null;
		}
		return head.data;
	}
}
