class Node
	{
		int val;
		Node next;
		public Node(int val)
			{
				this.val=val;
			}
	}
class LinkedList
	{
		Node head;
		Node tail;
		int length;
		public LinkedList(int val)
			{
				Node newnode = new Node(val);
				System.out.println("LinkedList with first value is created with first value.");
				head = newnode;
				tail = newnode;
				length = 1;
			}
		public void append(int val)
			{
				Node newnode = new Node(val);
				if(length == 0)
					{
						head = newnode;
						tail = newnode;
					}
				else
					{
						tail.next = newnode;
						tail = newnode;
					}
				length++;
			}
		public void removeLast()
			{
				if(length==0)
					{
						System.out.println("LinkedList is empty");
						return;
					}
				
				Node temp = head;
				Node pre = head;
				while(temp.next!=null)
					{
						pre = temp;
						temp = temp.next;
					}
				tail = pre;
				tail.next = null;
				length--;
				if(length == 0)
					{
						head = null;
						tail = null;
					}
				System.out.println(temp.val + " is removed.");
			}
		public void prepend(int val)
			{
				Node newnode = new Node(val);
				if(length==0)
					{
						head=newnode;
						tail=newnode;
						return;
					}
				newnode.next = head;
				head=newnode;
				length++;
			}
		public void removeFirst()
			{
				if(length==0)
					{
						System.out.println("Can't be removed");
						return;
					}
				Node temp = head;
				head = head.next;
				temp.next=null;
				length--;
				if(length==0)
				{
					tail=null;
				}
			}
		public void get(int index)
			{
				if(index>=length)
					{
						System.out.println("Index is out of range");
						return;
					}
				Node temp = head;
				while(index>0)
					{
						temp=temp.next;
						index--;
					}
				System.out.println("The value at index "+index+" is "+temp.val);
			}
		public void printList()
			{
				if(length==0)
					{
						System.out.println("List is empty");
					}
				else
					{
						Node temp = head;
						while(temp!=null)
							{
								System.out.print(temp.val+" ");
								temp=temp.next;
							}
					}
			}
	}
class DataStructure
	{
		public static void main(String args[])
			{
				LinkedList list1 = new LinkedList(25);
				list1.append(200);
				list1.printList();
				System.out.println();
				list1.removeLast();
				list1.prepend(19);
				System.out.println("19 is added");
				list1.prepend(18);	
				System.out.println("18 is added.");
				list1.printList();
				System.out.println();
				list1.removeFirst();
				System.out.println("First element is removed.");
				list1.printList();
				System.out.println();
				list1.get(1);
				System.out.println(list1.length); 
			}
	}