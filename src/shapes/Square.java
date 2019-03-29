package shapes;

//public  class Square extends Rectangle{

public class Square extends Rectangle{

//    protected double side;
//
//
////    constructor"1"
//    public Square(double side1){
////       to use the parent methods
////        3
//        super(side1,side1);
////        2
//        this.side = side1;
//    }
//
//
////    becuse we are over riding the method on rectangle it need to be exact same name
//    public double getArea(){
////        we need cast it ti in becuse its double
//        return (int) Math.pow(side,2);
//    }
//
////    becuse we are over riding the method on rectangle it need to be exact same name
//    public double getPerimeter(){
//        return 4 * side;
//    }

    protected double side;

    public Square(double side){
        super(side,side);
        this.side = side;
    }

    public void setLength(double side){
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    public double getArea(){
        return Math.pow(side,2);
    }

    public double getPerimeter(){
        return 4 * side;
    }




}
