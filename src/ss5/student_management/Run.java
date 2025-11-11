package ss5.student_management;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
           displayMenu();
    }

    public static void displayMenu() {
        StudentService studentService = new StudentService();
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
                    "\n 4.Kết thúc chương trình");
            System.out.println("------ Chọn chức năng-------------");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    // CHỨC NĂNG HIỂN THỊ
                    System.out.println("Danh sách");
                    Student[] studentList = studentService.getAll();
                    for (int i = 0; i < studentList.length ; i++) {
                        if (studentList[i]!=null){
                            System.out.println(i+1 + "." + studentList[i]);
                        }else {
                            break;
                        }
                    }
                    break;
                case ADD:
                    System.out.println("---Thêm mới---");
                    System.out.println("-Nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("-Nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("-Nhập địa chỉ");
                    String address= scanner.nextLine();
                    Student student = new Student(id,name,address);
                    studentService.add(student);
                    break;
                case DELETE:
                    System.out.println("Xoá");

                    break;
                default:
                    isNotExit = false;
            }
        }
    }
}
