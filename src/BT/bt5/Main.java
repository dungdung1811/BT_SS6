package BT.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student[] students = new Student[100];
        students[0] = new Student(1, "dung", "hanoi", "0123456", 30, false);
        students[1] = new Student(2, "tien", "hanoi", "01235667", 20, true);

    int choise;
    do{
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhap vao lua chon cua ban");
        System.out.println("1:in ra");
        System.out.println("2: xoa");
        System.out.println("3: them");
        System.out.println("4: edit");

        choise= sc.nextInt();

        switch (choise){
            case 1:
                // duyet qua mang students neu nhu phan tu maf khac null thi se hien thi du lieu;
                for (Student student: students) {
                    if (student != null){
                    student.displays();
                    }else {
                        break;
                    }

                }
                break;
            case 2:
                System.out.println("nhap vao id sinh vien muon xoa");
                int iddDelete = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < students.length; i++) {
                    if(students[i].getStudentId() == iddDelete){
                        students[i] = null;
                        break;

                    }

                }
                break;
            case 3:
                System.out.println("theem sinh vien");
                System.out.println("nhap vao vi tri muon them");
                int addIndex = sc.nextInt();
                sc.nextLine();
                if (addIndex >= 0 && addIndex<students.length){
                    Student newStudent = new Student();
                    newStudent.inputDta(sc);
                    students[addIndex] = newStudent;
                    newStudent.displays();
                } else {
                    System.out.println("vị trí không hợp lệ");
                }
            break;
            case 4:
                System.out.println("sửa thông tin sinh viên");
                System.out.println("nhập vào id sinh viên muốn sửa");
                int editIndex = sc.nextInt();
                sc.nextLine();
                    boolean studentFound = false;
                    for (int i = 0; i < students.length; i++){
                        if(students[i] != null &&  students[i].getStudentId() == editIndex ){
                            students[i].displays();
                            students[i].updateData(sc);
                            studentFound = true;
                            break;


                        }

                    }
                    if (!studentFound){
                        System.out.println("khong tìm thấy sinh có id" + editIndex
                        );
                    }

        }

    }

    while(choise !=5);
    }

}
