package ss8_mvc.view;

import ss8_mvc.entity.Student;

import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayStudentList(Student[] studentList){
        System.out.println("------------Danh sách--------");
        for (int i = 0; i < studentList.length ; i++) {
            if (studentList[i]!=null){
                System.out.println(i+1 + "." + studentList[i]);
            }else {
                break;
            }
        }
    }
    public static Student inputDataForStudent(){
        System.out.println("---Thêm mới---");
        System.out.println("-Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("-Nhập tên");
        String name = scanner.nextLine();
        System.out.println("-Nhập địa chỉ");
        String address= scanner.nextLine();
        Student student = new Student(id,name,address);
        return student;
    }
}
