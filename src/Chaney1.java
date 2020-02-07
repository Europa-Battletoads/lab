import java.util.Scanner;

public class Chaney1 {
    public static void main(String[] args) {
        //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number + " numbers : ");
        //printing Fibonacci series upto number
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println("\n\nFactorial: " + factorial(5));

        String word = "HelloWorld";
        System.out.printf("\noriginal String : %s,\nreversed String %s %n", word, reverse(word));


    }



    public static int fibonacci( int number){
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number

    }

    // factorial
    public static int factorial(int number){
        int result = 1;
        while(number != 0){
            result = result*number;
            number--;
        }
        return result;
    }

    // reverse string
    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }



}
