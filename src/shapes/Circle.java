package shapes;

public class Circle {

private double radius;

// creat a new Circle with radius property
        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea(){
            return 3.14 * (radius * radius);
        }

        public double getCircumference(){
            return 2 * 3.14 * radius;
        }

        public void setRadius(double radius1){
            this.radius = radius1;
        }



}
