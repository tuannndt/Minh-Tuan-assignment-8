import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberExercise {

    public static ArrayList<Integer> EnterData(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            } else {
                System.out.println("Invalid input, please enter an integer or 'done' to finish.");
            }
        }
        return numbers;
    }

    public static void DisplayData(ArrayList<Integer> numbers) {
        System.out.println("Array contents: " + numbers);
    }

    public static int findMax2(ArrayList<Integer> numbers) {
        if (numbers.size() < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        
        if (max2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second maximum value");
        }
        
        return max2;
    }
    
    public static void deleteOddNumber(ArrayList<Integer> numbers) {
        numbers.removeIf(num -> num % 2 != 0);
    }
}
