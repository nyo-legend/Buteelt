package Lab1;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Functionality 1: Addition
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        int sum = add(list);
        System.out.println("Sum of elements: " + sum);

        // Functionality 2: Subtraction
        int difference = subtract(list);
        System.out.println("Difference of elements: " + difference);

        // Functionality 3: Multiplication
        int product = multiply(list);
        System.out.println("Product of elements: " + product);

        // Functionality 4: Division
        double quotient = divide(list);
        System.out.println("Quotient of elements: " + quotient);

        // Functionality 5: Finding the Greater of Two Numbers
        int greater = findGreater(list);
        System.out.println("Greater of two numbers: " + greater);

        // Functionality 6: Display the Linked List
        displayList(list);
    }

    // Functionality 1: Addition
    public static int add(LinkedList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }

    // Functionality 2: Subtraction
    public static int subtract(LinkedList<Integer> list) {
        int difference = 0;
        for (int num : list) {
            difference -= num;
        }
        return difference;
    }

    // Functionality 3: Multiplication
    public static int multiply(LinkedList<Integer> list) {
        int product = 1;
        for (int num : list) {
            product *= num;
        }
        return product;
    }

    // Functionality 4: Division
    public static double divide(LinkedList<Integer> list) {
        double quotient = 1.0;
        for (int num : list) {
            quotient /= num;
        }
        return quotient;
    }

    // Functionality 5: Finding the Greater of Two Numbers
    public static int findGreater(LinkedList<Integer> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("List should have at least two elements");
        }
        int num1 = list.get(0);
        int num2 = list.get(1);
        return Math.max(num1, num2);
    }

    // Functionality 6: Display the Linked List
    public static void displayList(LinkedList<Integer> list) {
        System.out.println("Linked List elements: " + list);
    }
}
