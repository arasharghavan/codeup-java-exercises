import java.util.Arrays;

public class ArraysExercises {




    public static void main(String[] args) {

//        int[] numbers = {1,2,3,4,5};
//        //   System.out.println(Arrays.toString(person));
//          String[] person = {"z","b","c"};
////        prints out everything in array
//        for (int x : numbers){
//            //      System.out.print(x + " ");
//        }
//
//        //  System.out.println();
//
////        filling up an array
//        Arrays.fill(numbers,100);
//        for (int x : numbers){
//            //      System.out.print(x + " ");
//        }
////        check to see if Arrays are equal
//        if (Arrays.equals(numbers,numbers)){
//            //     System.out.println("yes");
//        } else {
//            //    System.out.println("no");
//        }
//
////        copy a new array from existing
//
//        int[] number1 = Arrays.copyOf(numbers,10);
//
////        sorting
//        Arrays.sort(person);
//        // System.out.println(Arrays.toString(person));
//
////        int[][] d2 = new int[3][3];
////        int[][] D2 = {{1,2,3,4,5},{6,7,8,9}};
////        d2[1][3] = 5;


        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("arash");
        people[1] = new Person("babak");
        people[2] = new Person("sudi");

        Person p1 = new Person("new name");


        for (Person x : people){
            System.out.println(x.getInfo());
        }

        System.out.println(Arrays.toString(Person.addPerson(people,p1)));







    }






}

