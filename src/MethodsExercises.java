import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {


//        System.out.println(Addition(3,4));
//        System.out.println(Subtraction(3,4));
//        System.out.println(Multiplication(3,4));
//        System.out.println(Division(9,2));
//        System.out.println(modulus(5,3));

//        getInteger(1,10);
//        factorial();



    }

//    Basic Arithmetic

    public static int Addition(int first, int second){

        return first+second;
    }

    public static int Subtraction(int first, int second){

        return first - second;
    }

    public static int Multiplication(int first, int second){

        return first * second;
    }

    public static double Division(double first, double second){

        return first / second;
    }

    public static double modulus(double first, double second){
        return first % second;
    }


//    Create a method that validates that user input is in a certain range

    public static void getInteger(int min, int max){

        int num;
        do {
            System.out.println("Enter a number between "+ min +  " and " + max +": ");
             num = new Scanner(System.in).nextInt();

        } while (num < min || num > max);
        System.out.println("your number is in the range!");
    }


//    Calculate the factorial of a number.

    public static void factorial(){

        String loop;
        int num;
        do {
            System.out.println("enter an integer from 1 to 10");

            num = new Scanner(System.in).nextInt();

                long r = 1;
                for (long i = 1; i <= num; i++) {
                    r *= i;
                }

                System.out.println(r);
                System.out.println("Would you like to continue? (y,n)");
                loop = new Scanner(System.in).next();
            }

            while (loop.equals("y")) ;
    }

//    Create an application that simulates dice rolling.

    public static void dice(){



    }

    


}
