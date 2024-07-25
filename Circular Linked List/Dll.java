import java.util.*;
public class Dll 
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
  Dll()
  {
    head = null;
  }
  public void insertend(int val)
  {
    Node newnode = new Node(val);
    if (head == null)
    {
      newnode.next = newnode;
      head = newnode;
    }
    else
    {
      newnode.next = head.next;
      head.next = newnode;
      head = newnode;
    }
  }
  public void search(int k)
  {
    int flag = 0;
    Node temp;
    for(temp=head.next;temp.next!=head.next;temp=temp.next)
    {
      if(temp.data==k)
      {
        flag++;
        break;
      }
    }
    if(flag==0)
    {
      System.out.print("Not found");
    }
    else
    {
      System.out.print("Found");
    }
  }
  public void display()
  {
    Node temp = head.next;
    do
    {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    while(temp.next!=head);
  }
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Dll list = new Dll();
    while(true)
    {
      int val = sc.nextInt();
      if(val== -1)
      {
        break;
      }
      list.insertend(val);
    }
    System.out.print("Enter the value k:");
    int k = sc.nextInt();
    list.search(k);
}
}
