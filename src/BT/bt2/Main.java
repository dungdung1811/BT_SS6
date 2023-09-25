package BT.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(2, 3, 5);
            double delta = quadraticEquation.getDiscriminant();

    //nếu delta < 0 thì phương trình vô nghiệm
        if (delta < 0){
            System.out.println("pt vo No");
//            nếu delta = 0 thì phương trình có nghiệm kép

        } else if (delta == 0) {
            System.out.println("pt co No kép: " + quadraticEquation.getRoot3());

        }
//        nếu delta > 0 thì phương trình có 2 nghiệm phân biệt
else {
            System.out.println("pt có 2 No pb: ");
            System.out.println("Nghiem thu nhat: "+ quadraticEquation.getRoot1());
            System.out.println("Nghiem thu hai: "+ quadraticEquation.getRoot2());

    }

    }

}