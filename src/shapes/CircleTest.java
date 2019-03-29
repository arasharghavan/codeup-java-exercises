package shapes;

public class CircleTest extends Shape implements Measurable{

    protected double r;
    double pi = 3.14;

   CircleTest(double radios){
       this.r = radios;
   }

   public double getPerimeter(){
        return 2*pi*r;
    }
     public double getArea(){
        return pi * r*r;
    }

}
