import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);


    String getString(){
        if (scanner.hasNext());
        return scanner.next();
    }

    boolean yesNo(){
        System.out.println("Do you want to continue?(y/n)");
        String result = scanner.next();
          return (result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes"));
    }


    int num;
    int getInt(int min, int max){
        System.out.println("enter a number!");
        num = scanner.nextInt();
        while ((num < min) || (num > max)){
            System.out.println("enter a number in the range!");
            num = scanner.nextInt();
        }

        return num;
    }

    int getInt(){
        if (scanner.hasNextInt());
        return scanner.nextInt();
    }

    double sum;
    double getDouble(double min, double max){
        System.out.println("enter a decimal number!");
        sum = scanner.nextDouble();
        while (sum < min || sum > max){
            System.out.println("enter a decimal number in the range!");
            sum = scanner.nextDouble();
        } return sum;
    }

    double getDouble(){
        if (scanner.hasNextDouble());
        return scanner.nextDouble();
    }






}
