package BT.bt6;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String nameEmployeeName;
    private int age;
    private boolean sex;
    private int rate;
    private long salary;

    public Employee() {
    }

    public Employee(String employeeId, String nameEmployeeName, int age, boolean sex, int rate, long salary) {
        this.employeeId = employeeId;
        this.nameEmployeeName = nameEmployeeName;
        this.age = age;
        this.sex = sex;
        this.rate = rate;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getNameEmployeeName() {
        return nameEmployeeName;
    }

    public void setNameEmployeeName(String nameEmployeeName) {
        this.nameEmployeeName = nameEmployeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(String employeeId, String nameEmployeeName, int age, boolean sex, int rate) {
        this.employeeId = employeeId;
        this.nameEmployeeName = nameEmployeeName;
        this.age = age;
        this.sex = sex;
        this.rate = rate;
    }

    public void inputDta (Scanner scanner){
        System.out.print("Enter ID: ");
        this.employeeId = scanner.nextLine();
        System.out.print("Enter Name ");
        this.nameEmployeeName = scanner.nextLine();
        System.out.print("Enter Age: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter rate Salary: ");
        this.rate = Integer.parseInt(scanner.nextLine());
    }
    public void display (){
        System.out.printf("ID = %s \nName = %s \nAge = %d\nSalary = %d\n",this.employeeId,this.nameEmployeeName,this.age,this.salary);
    }
    public long calSalary (){
        return  this.rate * 1300000;
    }
}
