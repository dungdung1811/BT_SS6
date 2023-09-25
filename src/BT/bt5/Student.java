package BT.bt5;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private String address;
    private String phoneNumber;
    private int age;
    private boolean gender = false;


    // contructer

    public Student() {
    }

    public Student(int studentId, String studentName, String address, String phoneNumber, int age, boolean gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
    }
    /// các method:
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    // phương thức l
    public void inputDta (Scanner sc){
        System.out.println("ID");
        studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Name");
        studentName = sc.nextLine();
        System.out.println("address");
        address = sc.nextLine();
        System.out.println("phoneNumber");
        phoneNumber = sc.nextLine();
        System.out.println("age");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("gender");
        gender = Boolean.parseBoolean(sc.nextLine());
    }

    public void displays(){

        String formattedString = String.format("ID:%s\n Name:%s \n Địa chỉ: %s \n Phone:%s \n Tuổi:%d \n Giới tính:%s", studentId, studentName, address, phoneNumber, age, gender ? "Nam" : "Nữ");
        System.out.println(formattedString);

    }
    public void updateData(Scanner sc) {
        System.out.println("Chọn thông tin bạn muốn cập nhật:");
        System.out.println("1: Tên");
        System.out.println("2: Địa chỉ");
        System.out.println("3: Số điện thoại");
        System.out.println("4: Tuổi");
        System.out.println("5: Giới tính");

        int choice = sc.nextInt();
        sc.nextLine(); // Đọc dấu xuống dòng thừa

        switch (choice) {
            case 1:
                System.out.println("Nhập tên mới:");
                studentName = sc.nextLine();
                break;
            case 2:
                System.out.println("Nhập địa chỉ mới:");
                address = sc.nextLine();
                break;
            case 3:
                System.out.println("Nhập số điện thoại mới:");
                phoneNumber = sc.nextLine();
                break;
            case 4:
                System.out.println("Nhập tuổi mới:");
                age = sc.nextInt();
                break;
            case 5:
                System.out.println("Nhập giới tính mới (true hoặc false):");
                gender = sc.nextBoolean();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }


}
