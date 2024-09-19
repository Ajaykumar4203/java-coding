import java.util.ArrayList;
import java.util.Scanner;

public class CompareUserInputLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("Enter the number of colors for the first list:");
        int numColors1 = scanner.nextInt();

        for (int i = 0; i < numColors1; i++) {
            System.out.println("Enter color " + (i + 1) + " for the first list:");
            String color = scanner.nextLine();
            list1.add(color);
        }
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Enter the number of colors for the second list:");
        int numColors2 = scanner.nextInt();

        for (int i = 0; i < numColors2; i++) {
            System.out.println("Enter color " + (i + 1) + " for the second list:");
            String color = scanner.nextLine();
            list2.add(color);
        }

        if (list1.equals(list2)) {
            System.out.println("The two lists are equal.");
        } else {
            System.out.println("The two lists are not equal.");
        }

    }
}
