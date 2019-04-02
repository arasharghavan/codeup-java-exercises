package grades;



import java.util.ArrayList;
import java.util.List;



public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (Integer x:grades){
            total += x;
        }

        return total / grades.size();
    }



//    for test :

//    public static void main(String[] args) {
//        Student a = new Student("arash");
//        a.addGrade(100);
//        a.addGrade(91);
//
//        System.out.println(a.getGradeAverage());
//    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", grades=" + getGradeAverage() +
//                '}';
//    }
}
