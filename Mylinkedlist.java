package Creations;

public class Mylinkedlist<A> {
		
		Node head;
		
		public void add(int pos,A data)
		{
			Node toadd = new Node(data);
			if(isEmpty())
			{
				head=toadd;
			}
			else 	
			{
				Node temp = head;
				Node temp1=temp.prev;
				for(int i=0;i<=pos;i++)
				{
					temp1=temp;
					temp=temp.next;
				}
				toadd.next=temp;
				toadd.prev=temp1;
				temp1.next=toadd;
		
			}
		}
		
		public void add(A data)
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
			System.out.println();
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
		public int size()
		{
			Node temp=head;
			int s=0;
			while(temp!=null)
			{
				temp=temp.next;
				s++;
			}
			return s;
		}
		public boolean isEmpty()
		{
			return (head==null);
		}
		
		public A get(int pos)
		{
			Node temp=head;
			for(int i=0;i<pos;i++)
			{
				temp=temp.next;
			}
			return temp.data;
		}
		
		public void set(int pos,A val)
		{
			Node temp=head;
			for(int i=0;i<pos;i++)
			{
				temp=temp.next;
			}
			temp.data=val;
		}
		
		public void remove(int pos)
		{
			Node temp=head;
			Node temp1=temp.prev;
			for(int i=0;i<pos;i++)
			{
				temp1=temp;
				temp=temp.next;
			}
			temp1.next=temp.next;
		}
		
		public void removeall(A val)
		{
			Node temp=head;
			Node temp1=temp.prev;
			while(temp!=null)
			{
				if(temp.data.equals(val))
				{
					temp1.next=temp.next;
					temp=temp1.next;
					continue;
				}
				else
				{
					temp1=temp;
					temp=temp.next;
				}
			}
		}
		public void clear()
		{
			head.next=null;
			head.prev=null;		
		}
		public boolean contains(A val)
		{
			Node temp=head;
			while(temp!=null)
			{
				if(temp.data.equals(val))
					return true;
				temp=temp.next;
			}
			return false;
		}
		class Node
		{
			A data;
			Node next;
			Node prev;
			
			Node(A data)
			{
				this.data=data;
				this.next=null;
				this.prev=null;
			}
		}

	}



