package shapes;

public class CircleApp {

    public static void main(String[] args) {

        Circle Object = new Circle(4);
//        set radios chaged it to 5
        Object.setRadius(5);
        System.out.println(Object.getArea());
        System.out.println(Object.getCircumference());

    }

}
