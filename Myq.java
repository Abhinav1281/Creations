package Creations;

public class Myq <A> 
{
	class node
	{
		A data;
		node next;
		
		node(A data)
		{
			this.data=data;
			next=null;
		}
		node()
		{
			next=null;
		}
	}
	
	node head = new node();
	node rear= new node();
	
	public void push(A data)
	{
		node temp = new node(data);
		if(head == null)
		{
			head=rear=temp;
			return;
		}
		rear.next=temp;
		rear=rear.next;
		
	}
	
	public A pull()
	{
		if(head==null)
		{
			rear=head;
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
			System.out.println("No data exists");
			return null;
		}
		return head.data;
	}
	
}	

