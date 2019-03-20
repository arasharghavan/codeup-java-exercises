import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately: %.2f",pi);
//        System.out.println();
//1

//        System.out.println("enter a integer: ");
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("This is the int: " + num);

//2

//        System.out.println("enter 3 words:");
//        String first = new Scanner(System.in).next();
//        System.out.println("Ok next!");
//        String second = new Scanner(System.in).next();
//        System.out.println("Ok next!");
//        String third = new  Scanner(System.in).next();
//
//        System.out.format("You entered : %s and %s and %s",first,second,third);

//3

//        System.out.println("enter a sentence: ");
//        String sentence = new Scanner(System.in).next();
//        System.out.println("this is your sentence: " + sentence);
//4

//        System.out.println("enter a sentence: ");
//        String sentence4 = new Scanner(System.in).nextLine();
//        System.out.println("this is your sentence: " + sentence4);

//Calculate the perimeter and area of Codeup's classrooms

        System.out.println("What is the length?");
        String lengthS = new Scanner(System.in).nextLine();
        System.out.println("What is the width?");
        String widthS = new Scanner(System.in).nextLine();

        double length = Double.parseDouble(lengthS);
        double width = Double.parseDouble(widthS);

        System.out.println("Area is: " + length * width);
        System.out.println("perimeter is: " + 2*(length + width));



        //scanner.nextLine(); for jumping to the next line when there are more than one scanner(System.in)



    }
}
