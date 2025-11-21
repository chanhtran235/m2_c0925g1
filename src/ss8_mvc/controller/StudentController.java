package ss8_mvc.controller;

import ss8_mvc.entity.Student;
import ss8_mvc.service.IStudentService;
import ss8_mvc.service.StudentService;
import ss8_mvc.view.StudentView;

import java.util.List;
import java.util.Scanner;

public class StudentController {

    public static void displayMenu() {
        IStudentService studentService = new StudentService();
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        Scanner scanner = new Scanner(System.in);
        boolean isNotExit = true;
        while (isNotExit) {
            System.out.println("---------Quản lý sinh viên---------" +
                    "\n 1.Danh sách" +
                    "\n 2.Thêm" +
                    "\n 3.Xoa" +
                    "\n 4.Quay lại menu chính");
            System.out.println("------ Chọn chức năng-------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    // CHỨC NĂNG HIỂN THỊ
                    List<Student> studentList = studentService.findAll();
                    StudentView.displayStudentList(studentList);
                    break;
                case ADD:
                    Student student = StudentView.inputDataForStudent();
                    studentService.add(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case DELETE:
                    System.out.println("Xoá");
                    System.out.println("Nhập id cần xoá");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean isDeleteSuccess = studentService.deleteById(deleteId);
                    if (isDeleteSuccess){
                        System.out.println("Xoá thành công");
                    }else {
                        System.out.println("Id không tồn tại");
                    }

                    break;
                default:
                    isNotExit = false;
            }
        }
    }
}
