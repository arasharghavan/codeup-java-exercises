import java.util.Scanner;

//import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args){

        System.out.print(("سلام"));
        System.out.print((" به دنیا "));
//        math
        double sum = 5. / 3;
        System.out.println(sum);
//        string
        String hello = "Hello this is a string";
        Character character = 'h';

        System.out.println(hello);
        System.out.println(character);

//        Exercises

        int myFavoriteNumber = 740;
        System.out.println(myFavoriteNumber);

        String myString = "من استرینگ هستم";
        System.out.println(myString);

        String myString1 = "3.14159";
        System.out.println(myString1);

        long myNumber = 123L;
        System.out.println(myNumber);

        float myNumber1 = 3.41F;
        float myNumber12 =(float) 3.41;
        System.out.println(myNumber1);
        System.out.println(myNumber12);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y= 5;
        System.out.println(++y);
        System.out.println(y);

        int a = 4;
        a += 5;
        System.out.println(a);

        int b = 3;
        int c = 4;
        c *= b;
        System.out.println(c);

        int e = 10;
        int f = 2;
        f -= (e / f);
        System.out.println(f);

//        -------------------------------
//        int number = 740;
//        String last = "Arghavan";
//        String name = "Arash";
        //System.out.format("hello, %s %s %s nice to see you!", name, last, number);

//        -----------------------------------

        System.out.print("Enter username:");
        String UserName = new Scanner(System.in).nextLine();
        System.out.println("User name is : " + UserName);
        System.out.format("User name is : %s\n %s",UserName,UserName);

//        \n => for new line


    }

}


