
package Week5project;

public class Deleting_Duplicate_Node_Nibriti {

	public static void main(String[] args) {
		
        DoublyLinkLinkedList listedValues = new DoublyLinkLinkedList();
        listedValues.AddAtLast(3);
        listedValues.AddAtLast(11);
        listedValues.AddAtLast(3);
        listedValues.AddAtLast(5);
        listedValues.AddAtLast(1);
        listedValues.AddAtLast(5);
        listedValues.AddAtLast(3);
        listedValues.AddAtLast(4);
        listedValues.AddAtLast(11);
        listedValues.AddAtLast(6);
        listedValues.display();
        System.out.println();
        System.out.println(listedValues.getLength());
        listedValues.DeleteDuplicate();
        System.out.println();
        listedValues.display();

	}
}

	class DoublyLinkLinkedList
	{
	    private Node head;
	    private Node tail;
	    private int size;
	    public class Node
	    {
	        int data;
	        Node previous;
	        Node next;
	
	        Node(int data, Node next, Node previous)
	        {
	            this.data = data;
	            this.next = next;
	            this.previous = previous;
	        }
	    }
	
	    public void display()
	    {
	        if (head == null)
	        {
	            System.out.println("The list doesn't have any values");
	        }
	        else
	        {
	            Node temp = head;
	            while (temp.next != null)
	            {
	                System.out.print(temp.data + " -> ");
	                temp = temp.next;
	            }
	            System.out.print(temp.data);
	        }
	   }
	    public void DeletingNode(int value)
	    {
	        if (head == null)
	        {
	            System.out.println("The list doesn't have any value.");
	        }
	        else
	        {
	            Node temp = head;
	            while (temp.next != null)
	            {
	                if (temp.data == value)
	                {
	                    temp.next.previous = temp.previous;
	                    temp.previous.next = temp.next;
	                    return;
	                }
	                temp = temp.next;
	            }
	        }
	        System.out.println("The node has been deleted");
	    }
	    public void DeleteDuplicate()
	    {
	        int[] duplicate = new int[size];
	        int counter = 0;
	        if (head == null)
	        {
	            System.out.println("The list doesn't have duplicate values");
	        }
	        else
	        {
	            Node temp = head;
	            while (temp != null)
	            {
	                if (contains(duplicate, temp.data))
	                {
	                    if (temp.next == null)
	                    {
	                        temp.previous.next = null;
	                        tail = temp.previous;
	                    }
	                    else
	                    {
	                        temp.next.previous = temp.previous;
	                        temp.previous.next = temp.next;
	                    }
	                }
	                else
	                {
	                    duplicate[counter] = temp.data;
	                    counter++;
	                }
	                temp = temp.next;
	            }
	        }
	    }
	    public void AddAtLast(int value)
	    {
	        if (head == null)
	        {
	            Node node1 = new Node(value, null, null);
	            head = tail = node1;
	            size++;
	        }
	        else
	        {
	            Node node1 = new Node(value, null, tail);
	            tail.next = node1;
	            tail = node1;
	            size++;
	        }
	    }
	    
	    public int getLength()
	    {
	        return size;
	    }
	    public boolean contains(int[] arr, int value)
	    {
	        for (int i = 0; i < arr.length ; i++)
	        {
	            if (value == arr[i])
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	}
	
	
	
