package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

////    protected properties 5
//    protected double length;
//    protected double width;
//
////    constructor need to mach the class name no joke 4
//    public Rectangle(double length1,double width1){
//        this.length = length1;
//        this.width = width1;
//    }
////6
//    public double getArea(){
//        return length * width;
//    }
////7
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//
////defult constructor had to created becuse of squer class
//    public Rectangle(){}

    public Rectangle(double width,double length){
        super(width,length);
    }

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }


}