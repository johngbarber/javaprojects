public class ControlFlowExercises {
    public static void main(String[] args){
//        while loop starting at i = 5 and printing i while i<=15
        int i = 5;
        while(i <= 15){
            System.out.println("I is " + i);
            i ++;
        }
//      Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        int j = 0;
        do{
            System.out.println(j);
            j += 2;
        } while( j <= 100);
        int k = 100;
        do{
            System.out.println(k);
            k -= 5;
        } while( k >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        int l = 2;
        do{
            System.out.println(l);
            l = (int) Math.pow(l,2);
        } while(l < 1000000);

//        FizzBuzz
        for(int m =1; m<=100; m++){
            if(m % 3 == 0 && m % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (m % 3 == 0) {
                System.out.println("Fizz");
            } else if (m % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(m);
            }
        }

    }
}
