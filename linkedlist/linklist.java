import java.util.*;
public class linklist
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    linklist()
    {
        head = null;
    }
    public void insertbegin(int val)
    {
        Node newnode = new Node(val);
        if(head==null)
        {
          head = newnode;
        }
        else
        {
          Node temp = head;
          newnode.next = temp;
        }
    }

    public void insertend(int val)
    {
        Node newnode = new Node(val);
        if(head==null)
        {
          newnode = head;
        }
        else
        {
            while(!=null)
            {
                System.out.print(head.data+" ");
                head = head.next;
            }
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        linklist list = new linklist();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int val  = sc.nextInt();
            list.insertbegin(val);
        }
        list.display();
    }
} 