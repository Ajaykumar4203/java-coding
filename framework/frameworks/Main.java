import java.util.LinkedList;
import java.util.*;

import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
         int vaL;
        while(true)
        {
             int val = sc.nextInt();
            if(val==-1) break;
            queue.add(val);
        }
        System.out.println("Queue elements:");
        for (int item : queue) {
            System.out.print(item+ " ");
        }
        System.out.println();
        int n = sc.nextInt();
        
        queue.remove(n);
        System.out.println(queue);
    }
}