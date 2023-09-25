package BT.bt4;

public class Fanto {
    private int speed;
    private boolean onOff ;
    private double radius;
    private String color;
    public static final int SLOW = 1;
    public static   final int MEDIUM = 2;
    public static final int FAST =3;

    public Fanto() {
    }

    public Fanto (int speed, boolean onOff, double radius, String color){
        this.speed = speed;
        this.onOff = onOff;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        String result;
      if(onOff ){
          result="tốc độ = "+  speed + "\n màu săc = " + color + "\n bán kính = " + radius +" \nfan is ON";
      }else {
          result = " màu săc = " + color + "\n bán kính = " + radius + "\nfan is Off";
      }
      return result;
    }


}
