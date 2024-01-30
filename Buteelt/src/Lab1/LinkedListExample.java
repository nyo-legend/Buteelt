package Lab1;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Functionality 1: Addition
        LinkedList<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(35);
        int sum = add(list);
        System.out.println("Нийлбэр: " + sum);

        // Functionality 2: Subtraction
        int difference = subtract(list);
        System.out.println("Minus: " + difference);

        // Functionality 3: Multiplication
        int product = multiply(list);
        System.out.println("Үржигдэхүүн: " + product);

        // Functionality 4: Division
        double quotient = divide(list);
        System.out.println("Хуваах: " + quotient);

        // Functionality 5: Finding the Greater of Two Numbers
        int greater = findGreater(list);
        System.out.println("Аль нь их вэ: " + greater);

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
        // Initialize the difference with the first element
        int difference = list.isEmpty() ? 0 : list.get(0);

        // Subtract the remaining elements
        for (int i = 1; i < list.size(); i++) {
            difference -= list.get(i);
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
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List should not be empty for division");
        }

        double quotient = list.get(0);

        // Avoid division by zero
        if (quotient == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Divide the remaining elements
        for (int i = 1; i < list.size(); i++) {
            // Avoid division by zero
            if (list.get(i) == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            quotient /= list.get(i);
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
        System.out.println("Оруулсан элемент: " + list); //Алдаа шалгах
    }
}
