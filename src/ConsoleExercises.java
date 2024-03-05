//Import Scanner Utility
import java.util.Scanner;

public class ConsoleExercises {
    public static void  main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);
//      Scanner utility practice
        Scanner scanner = new Scanner(System.in);
//        Prompt the user to enter an integer and output that integer
//        System.out.print("Enter an interger: ");
//        int number = scanner.nextInt();
//        System.out.println("You entered: " + number);

//        Prompt the user to enter 3 words and
        System.out.print("Enter three words separated by spaces: ");
        String threeWords = scanner.nextLine();
        String[] words = threeWords.split(" ");

        if(words.length == 3){
            System.out.println("Word 1: " + words[0]);
            System.out.println("Word 2: " + words[1]);
            System.out.println("Word 3: " + words[2]);
        }
// Get and output a full sentence from a user
        System.out.print("Enter a complete sentence: ");
        String fullsentence = scanner.nextLine();
        System.out.println("You entered: " + fullsentence);

//        Prompt the user to enter the length of the room they are in
        System.out.print("Enter the length of the room you are in:");
        String lengthInput = scanner.nextLine();
        double length = Double.parseDouble(lengthInput);

//      Prompt the user to enter the width of the room they are in
        System.out.print("Enter the width of the room you are in:  ");
        String widthInput = scanner.nextLine();
        double width = Double.parseDouble(widthInput);

//      Calculate area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

//        Display the results
        System.out.println("Area of the classroom:  " + area);
        System.out.println("Perimeter of the classroom:  " + perimeter);
    }
}
