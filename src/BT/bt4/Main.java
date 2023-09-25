package BT.bt4;

import static BT.bt4.Fanto.FAST;
import static BT.bt4.Fanto.MEDIUM;

public class Main {
    public static void main(String[] args) {
        Fanto fan1 = new Fanto(FAST,true,2,"yellow");
        Fanto fan2 = new Fanto(MEDIUM,false,5,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
