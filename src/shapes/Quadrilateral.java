package shapes;

abstract class Quadrilateral extends Shape {

    protected double length;
    protected double width;


//    constructor

    public Quadrilateral(double width,double length){
        this.width = width;
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);




}