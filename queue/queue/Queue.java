import java.util.*;
class Queue{
  private int a[] = new int[10];
  private int front = -1;
  private int rear =  -1;
   private int count = 0;
  
  public void enqueue(int data)
  {
    if(rear == 9)
    {
      System.out.printf("Queue is full");
    }
    else
    {
      if(front == -1)front = 0;
      a[++rear] = data;
      System.out.printf("%d",a[rear]);
      count++;
    }
  }
  
  public void dequeue()
  {
    if(front > rear || front == -1)
    {
      System.out.printf("Queue is empty");
    }
    else
    {
     front++;
     count--;
     if(front > rear)
     {
       front  = rear = -1;
     }
    }
  }
  public int getcount()
  {
      return count;
  }
  
  public static void main(String[] args)
  {
    Queue q = new Queue();
    Scanner sc = new Scanner(System.in);
    
    
    while(true){
      
      int num = sc.nextInt();
    
    switch(num)
    {
      case 1:
        int data = sc.nextInt();
        q.enqueue(data);
        
        break;
      case 2:
        q.dequeue();
        break;
      case 5:
        System.out.printf("Number element stored inside queue: %d",q.getcount());
        break;
      
    }
    }
}
}
