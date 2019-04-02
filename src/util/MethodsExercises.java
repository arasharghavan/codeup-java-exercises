package util;

import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {


//        System.out.println(Addition(3,4));
//        System.out.println(Subtraction(3,4));
//        System.out.println(Multiplication(3,4));
//        System.out.println(Division(9,2));
//        System.out.println(modulus(5,3));


//         getInteger(1,10);

//        Calculate the factorial of a number:
           //getInteger(1,10);
        processDice();



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

//    public static void getInteger(int min, int max){
//
//        int num;
//        do {
//            System.out.println("Enter a number between "+ min +  " and " + max +": ");
//             num = new Scanner(System.in).nextInt();
//
//        } while (num < min || num > max);
//        System.out.println("your number is in the range!");
//
//    }


//    Calculate the factorial of a number.


    public static int getInteger(int min, int max){

        int num;
        do {
            System.out.println("Enter a number between "+ min +  " and " + max +": ");
            num = new Scanner(System.in).nextInt();

        } while (num < min || num > max);
        System.out.println("your number is in the range!");

//     ******  next line need to uncomment for factorial();  *****
        //factorial(num);
        return num;
    }



    public static void factorial(int input){

        String loop ;
                long output = 1;
                String text ="";
                for (long i = 1; i <= input; i++) {
                    output *= i;
                        text += i + " X ";
                }
                String text2 = text.substring(0,text.length()-2);
                System.out.println(input + "!" + " = " + text2 + " = " + output);

        System.out.println("do you want to continue?(y/n)");
        loop = new Scanner(System.in).nextLine();

                if (loop.equals("y")){
            getInteger(1,10);
        }

    }

    // Exercise 4
    public static int rollDie(int sides) {
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }

    public static String rollDice(int sides) {
        return String.format("%d and %d", rollDie(sides), rollDie(sides));
    }

    public static void processDice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose a number of sides for the dice");
        int sides = getInteger(1, 50);
        do {
            System.out.println("Rolling dice...");
            System.out.println("You rolled " + rollDice(sides));
            System.out.println("Do you wish to roll again [y/n]?");
        } while(sc.next().equals("y"));
    }


}
