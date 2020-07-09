package Creations;

public class Mylinkedlist {
		
		Node head;
		
		public void add(int pos,int data)
		{
			Node toadd = new Node(data);
			if(isEmpty())
			{
				head=toadd;
			}
			else 	
			{
				Node temp = head;
				temp=head;
				for(int i=0;i<pos;i++)
				{
					temp=temp.next;
				}
				temp.next=toadd;
		
			}
		}
		
		public void add(int data)
		{
			Node toadd = new Node(data);
			if(isEmpty())
			{
				head=toadd;
			}
			else 	
			{
				Node temp = head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=toadd;
			}	
		}
		
		public void print()
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
		public boolean isEmpty()
		{
			return (head==null);
		}
		
		static class Node
		{
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
				this.next=null;
			}
		}

	}



