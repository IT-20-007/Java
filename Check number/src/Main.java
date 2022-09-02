import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter any number: ");
//        int num = scanner.nextInt();
//        if(num>0){
//            System.out.print(num + " is a positive number");
//        }
//        else{
//            System.out.print(num + " is a negative number");
//        }
        char num = 'a';
//        System.out.println("Enter the alphabet: ");
//        String alphabet = scanner.next();
        if(num>='a' && num<='z' || num>= 'A' && num<='Z'){
            System.out.println("The num is alphabet");
        }
        else{
            System.out.println("The num is not an alphabet");
        }


    }
}