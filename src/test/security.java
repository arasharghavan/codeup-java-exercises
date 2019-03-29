package test;

public class security {

    public static void main(String[] args) {
        Employee emp1 = new Developer("alex","hr");
        Employee emp2 = new Manager("arash","abc");

        System.out.println(emp1.getDepartment());
    }
}
