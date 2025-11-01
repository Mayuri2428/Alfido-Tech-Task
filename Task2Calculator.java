import java.util.Scanner;

public class Task2Calculator6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            if (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Invalid input.\n");
                continue;
            }

            int choice = sc.nextInt();
            if (choice == 5) break;

            System.out.print("Enter first number: ");
            if (!sc.hasNextDouble()) {
                sc.next();
                System.out.println("Invalid number.\n");
                continue;
            }
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            if (!sc.hasNextDouble()) {
                sc.next();
                System.out.println("Invalid number.\n");
                continue;
            }
            double b = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b) + "\n");
                    break;
                case 2:
                    System.out.println("Result: " + (a - b) + "\n");
                    break;
                case 3:
                    System.out.println("Result: " + (a * b) + "\n");
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error: Division by zero\n");
                    } else {
                        System.out.println("Result: " + (a / b) + "\n");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }
        }
        sc.close();
    }
}