package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//this one is the class name    this one is the constractor's name
//        Rectangle box1 = new Rectangle(4,5);
//
//        System.out.println("The are is: " + box1.getArea());
//        System.out.println("the Perimeter is: " + box1.getPerimeter());


        //Rectangle box2 = new Square(5);

//        System.out.println("The are is: " + box2.getArea());
//        System.out.println("the Perimeter is: " + box2.getPerimeter());







        Measurable object;
        object = new Square(7);
        System.out.println(object.getArea());
        System.out.println(object.getPerimeter());

        object = new Rectangle(5,4);
        System.out.println(object.getPerimeter());
        System.out.println(object.getArea());

        CircleTest circle = new CircleTest(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());


    }

}
