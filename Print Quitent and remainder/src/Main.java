import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number you want quitent or remainder: ");
        System.out.println("Enter Num1: ");
        int a = scanner.nextInt();
        System.out.println("Enter Num2: ");
        int b = scanner.nextInt();
//        int a = 25, b = 4;
        int rem = a % b;
        int quitent = a / b;
        System.out.println("Quitent is: " + quitent);
        System.out.println("Remainder is: " + rem);

    }
}