package BT.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn , và màu sắc");
        System.out.println("1: nhập bán kính");
        double r = sc.nextDouble();
        sc.nextLine();
        System.out.println("2: nhập màu sắc");
        String c = sc.nextLine();
        Circle circle1 = new Circle(r,c);
        System.out.println(circle1);
        System.out.println("Diện tích hình tròn là: " +circle1.getArea());
        System.out.println("Chu vi hình tròn là: " +circle1.getPerimeter());

    }
}
