import java.util.Scanner;

//import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {




            Scanner scanner = new Scanner(System.in);
            boolean bobTalk = true;

            do {
                System.out.println("What do you want to know?");
                String ca = scanner.nextLine();

                if (ca.isEmpty()){
                    System.out.println("Fine. Be that way!");
                } else if (ca.endsWith("?")) {
                    System.out.println("Sure");
                } else if (ca.endsWith("!")){
                    System.out.println("Whoa, chill out!");
                } else if (ca.equals("bye")){
                    System.out.println("later!");
                    bobTalk = false;
                } else {
                    System.out.println("Whatever");
                }

            } while (bobTalk);


    }

}

