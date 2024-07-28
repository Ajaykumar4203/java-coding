import java.util.Scanner;
class array
{
    int s [] = new int [9];
    int top;
    
    array(){
        top = -1;
    }
    void push(int val){
        if(top ==9){
            System.out.println("full");
        }
        s[++top] = val;
    }
    int pop(){
        if(top>=0){
            return s[top--];
        }
        return -1;
    }
    void peak(){
        System.out.println("Peak = "+s[top]);
    }
    void display(){
        for(int i =0;i<top+1;i++){
            System.out.print(s[i]+ " ");
        }
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();  
        array a1 = new array();
        a1.display();
        System.out.println();
        a1.pop();
        a1.pop();
        a1.display();
        
        a1.peak();
    }
}