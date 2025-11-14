package ss8_mvc.controller;

import ss8_mvc.entity.Student;
import ss8_mvc.service.IStudentService;
import ss8_mvc.service.StudentService;
import ss8_mvc.view.StudentView;

import java.util.Scanner;

public class InstructorController {
    public static void displayMenu() {
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        Scanner scanner = new Scanner(System.in);
        boolean isNotExit = true;
        while (isNotExit) {
            System.out.println("---------Quản lý giáo viên---------" +
                    "\n 1.Danh sách" +
                    "\n 2.Thêm" +
                    "\n 3.Xoa" +
                    "\n 4.Quay lại menu chính");
            System.out.println("------ Chọn chức năng-------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    System.out.println("---- Chức năng danh sách đang mở rộng-----------");

                    break;
                case ADD:
                    System.out.println("---- chức năng thêm mới đang mở rộng-----------");

                    break;
                case DELETE:
                    System.out.println("---- chức năng xoá đang mở rộng-----------");


                    break;
                default:
                    isNotExit = false;
            }
        }
    }
}
