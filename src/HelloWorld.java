//Import Scanner Utility
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int myFavoriteNumber = 42;
        System.out.println(myFavoriteNumber);
        String myString = "3.14159";
        System.out.println(myString);
        float myNumber = 3.14f;
        System.out.println(myNumber);
        int x = 5;
        System.out.println(++x);
        System.out.println(x);
// Using the scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }
}
