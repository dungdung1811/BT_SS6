package BT.bt2;

public class QuadraticEquation {
    private double a;
    private  double b;
    private  double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double delta =  b*b -4*a*c;
        return delta;
    }
    public  double getRoot1 (){
        double x1 = (-b+Math.sqrt(b*2 -4*a*c))/(2*a);
        return x1;
    }
    public double getRoot2 (){
        double x2 = (-b-Math.sqrt(b*2 -4*a*c))/(2*a);
        return x2;
    }
    public  double getRoot3 (){
        double x3 = (-b/(2*a));
        return x3;
    }
}
