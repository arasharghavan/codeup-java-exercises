import java.util.Scanner;
//import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args){


//        char symbol = 'خ';
//        System.out.println(Character.getNumericValue(symbol));




//        While

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }



        //Do While

//        int i = 0;
//        do {
//            System.out.println(i);
//            i = i + 2;
//
//        }while (i < 100);
//-------------------------------->
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//
//        }while (i >= -10);
//----------------------------------->
//        long i = 2;
//        do {
//            System.out.println(i);
//            i =  i * i;
//        } while (i < 1000000);


        //for

//        for (long i = 5; i <= 15; i++ ){
//            System.out.println(i);
//        }

//        for (long i = 0; i < 100; i += 2){
//            System.out.println(i);
//        }

//          for (long i = 2; i < 1000000; i *= i){
//              System.out.println(i);
//           }


        //Fizzbuzz

//        for (int num = 0; num <= 100; num++) {
//
//            if (num % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (num % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (num % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(num);
//            }
//        }

        //Display a table of powers

        System.out.println("What number would you like to go up to?");
        long number = new Scanner(System.in).nextInt();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= number; i++){
            long sq = i * i ;
            long cu = sq * i;
            String sp = "|";
            System.out.printf("%-6s %s %-7s %s %s\n",i,sp,sq,sp,cu);
        }






















    }

}
