package ss8_mvc.view;

import ss8_mvc.entity.Student;
import ss8_mvc.validation.StudentValidate;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayStudentList(List<Student> studentList){
        System.out.println("------------Danh sách--------");
        for (int i = 0; i < studentList.size() ; i++) {
            System.out.println(studentList.get(i));
        }
    }
    public static Student inputDataForStudent(){
        System.out.println("---Thêm mới---");
        System.out.println("-Nhập id");
        int id = Integer.parseInt(scanner.nextLine());

        String name ="";
        do {
            System.out.println("-Nhập tên");
            name = scanner.nextLine();
        }while (!StudentValidate.checkName(name));

        System.out.println("-Nhập địa chỉ");
        String address= scanner.nextLine();
        System.out.println("-Nhập tên lớp ");
        String className= scanner.nextLine();
        Student student = new Student(id,name,address,className);
        return student;
    }
    public static int inputId(String mess){
        System.out.println(mess);
        return Integer.parseInt(scanner.nextLine());
    }
}
