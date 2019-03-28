package movies;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

       // Movie[] movies = MoviesArray.findAll();



int userInput;
        do {


            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");


            Scanner input = new Scanner(System.in);
            userInput = input.nextInt();


             if (userInput == 1){
                for (Movie x: MoviesArray.findAll() ){
                    System.out.println("Name => " + x.getName() + " | Category =>  " + x.getCategory());
                }
            } else if (userInput == 2){
                for (Movie x: MoviesArray.findAll()){
                    if (x.getCategory().equalsIgnoreCase("animated")){
                        System.out.println(x.getName());
                    }
                }
            } else if (userInput == 3){
                for (Movie x: MoviesArray.findAll()){
                    if (x.getCategory().equalsIgnoreCase("drama")){
                        System.out.println(x.getName());
                    }
                }
            } else if (userInput == 4){
                for (Movie x: MoviesArray.findAll()){
                    if (x.getCategory().equalsIgnoreCase("horror")){
                        System.out.println(x.getName());
                    }
                }
            } else if (userInput == 5){
                for (Movie x: MoviesArray.findAll()){
                    if (x.getCategory().equalsIgnoreCase("scifi")){
                        System.out.println(x.getName());
                    }
                }
            }

        }  while (userInput != 0);
    }

}
