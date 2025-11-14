package ss8_mvc.repository;

import ss8_mvc.entity.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] studentList = new Student[10];
    static {
        studentList[0] = new Student(1,"chánh","KT");
        studentList[1] = new Student(2,"Long","KT");
        studentList[2] = new Student(3,"Vinh","KT");
    }

    @Override
    public Student[] findAll() {
        // đọc file/ lấy dữ liệu từ DB
        return studentList;
    }


    @Override
    public void add(Student student) {
        // ghi file/ lưu vào DB
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]==null){
                studentList[i] = student;
                break;
            }
        }
    }
}
