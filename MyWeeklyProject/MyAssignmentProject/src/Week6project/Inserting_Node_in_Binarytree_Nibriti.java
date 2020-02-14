package Week6project;


public class Inserting_Node_in_Binarytree_Nibriti 
{
    public static void main(String[] args)
    {
        Node n = new Node(5);
        n.inserting(4);
        n.inserting(6);
        n.inOrder();
    }
}

class Node
{
    Node left, right;
    int data;

    public Node(int data)
    {
        this.data = data;
    }
    public void inOrder()
    {
        if (left != null)
        {
            left.inOrder();
        }
        System.out.println(data);
        if (right != null)
        {
            right.inOrder();
        }
    }

    public void inserting(int value)
    {
        if (value <= data )
        {
            if (left == null)
            {
                left = new Node(value);
            }
            else
            {
                left.inserting(value);
            }
        }
        else
        {
            if (right == null)
            {
                right = new Node(value);
            }
            else
            {
                right.inserting(value);
            }
        }
    }

    

}
