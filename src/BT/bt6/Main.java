package BT.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee [] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].inputDta(sc);
            employees[i].calSalary();

//            System.out.printf("Name: %s\n ,Age: %d \n, %d \n", employees[i].getNameEmployeeName(), employees[i].getAge(),employees[i].getSalary());
            employees[i].display();
        }
    }
}
