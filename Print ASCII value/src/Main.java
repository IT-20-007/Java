import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        int ascii = 'a' + key;
        System.out.println((char)ascii);
    }
}