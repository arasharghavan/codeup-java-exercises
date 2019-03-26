package shapes;

public class Circle {

private double radius;

// creat a new Circle with radius property
        public Circle(double radius) {
            this.radius = radius;
        }

        public double getArea(){
            return Math.PI * (radius * radius);
        }

        public double getCircumference(){
            return 2 * Math.PI * radius;
        }

        public void setRadius(double radius1){
            this.radius = radius1;
        }



}
