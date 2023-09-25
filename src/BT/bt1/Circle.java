package BT.bt1;

public class Circle {
    private double radius;
    private String color;


    public Circle(double radius , String color){
        this.radius = radius;
        this.color = color;
    }
    public double getArea (){
        return radius* radius* Math.PI;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getPerimeter (){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
