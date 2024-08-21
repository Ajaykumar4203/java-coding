import java.util.*;

interface Motor {
    void run();
}

class Operation {
    float s;

    Operation(float cap) {
        s = cap * 0.05f;
    }
}

class Consume implements Motor {
    @Override
    public void run() {
        System.out.println("Washing Machine is consuming electricity.");
    }
}

class Consume1 implements Motor {
    @Override
    public void run() {
        System.out.println("Washing machine is a good machine.");
    }
}

class Consume2 extends Operation implements Motor {

    Consume2(float cap) {
        super(cap);
    }

    @Override
    public void run() {
        System.out.println("Washing machine consuming electricity: " + s + " kWh");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the washing machine: ");
        float cap = sc.nextFloat();

        Motor obj = new Consume();
        Motor obj1 = new Consume1();
        Motor obj2 = new Consume2(cap);

        obj.run();
        obj1.run();
        obj2.run();

        sc.close();
    }
}
