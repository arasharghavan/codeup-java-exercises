package grades;
import java.util.HashMap;
import java.util.Map;




public class GradesApplication {
    public static void main(String[] args) {

        Map<String,Student> students = new HashMap<>();

        Student arash = new Student("arash");
        arash.addGrade(100);
        arash.addGrade(90);
        arash.addGrade(95);

        Student sudi = new Student("sudi");
        sudi.addGrade(100);
        sudi.addGrade(30);
        sudi.addGrade(85);

        Student babak = new Student("babak");
        babak.addGrade(99);
        babak.addGrade(10);
        babak.addGrade(45);

        students.put("gitArash",arash);
        students.put("gitSudi",sudi);
        students.put("gitBabak",babak);


        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students:");
















        for (String x: students.keySet()){
            System.out.print("|" + x);
        }

        System.out.println();
        System.out.println(students.containsKey("pizza"));

        System.out.println("Would you like to see another student?");



      String input = "sudi";

       for (String x:students.keySet()){

           String val = students.get(x).toString();
           if (input.equals(x)){
               System.out.println(val + x);
           }
       }


    }

}
