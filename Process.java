
import java.util.ArrayList;
import java.util.Scanner;

public class Process {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Enter Data");
            System.out.println("2. Display Data");
            System.out.println("3. Find Second Maximum Value");
            System.out.println("4. Delete Odd Numbers");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    numbers.clear();
                    NumberExercise.EnterData(numbers);
                    break;
                case 2:
                    NumberExercise.DisplayData(numbers);
                    break;
                case 3:
                    try {
                        int secondMax = NumberExercise.findMax2(numbers);
                        System.out.println("The second largest value is: " + secondMax);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    NumberExercise.deleteOddNumber(numbers);
                    System.out.println("Odd numbers have been deleted.");
                    break;
                case 5:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Please choose again.");
            }
        }
    }
}