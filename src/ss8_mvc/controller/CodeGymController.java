package ss8_mvc.controller;

import ss8_mvc.entity.Student;
import ss8_mvc.service.IStudentService;
import ss8_mvc.service.StudentService;
import ss8_mvc.view.StudentView;

import java.util.Scanner;

public class CodeGymController {
    public static void displayMenu() {
        final int STUDENT = 1;
        final int INSTRUCTOR = 2;
        final int OTHER = 3;
        Scanner scanner = new Scanner(System.in);
        boolean isNotExit = true;
        while (isNotExit) {
            System.out.println("---------Quản lý chung---------" +
                    "\n 1.Quản lý sinh viên" +
                    "\n 2.Quản lý giáo vin" +
                    "\n 3.Quản lý cái gì...." +
                    "\n 4.Kết thúc chương trình");
            System.out.println("------ Chọn chức năng-------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case STUDENT:
                    // quản lý sinh viên
                    StudentController.displayMenu();
                    break;
                case INSTRUCTOR:
                    // quản lý giáo viên
                   InstructorController.displayMenu();
                    break;
                    // quản lý thứ khác
                case OTHER:
                    break;
                default:
                    isNotExit = false;
            }
        }
    }
}
