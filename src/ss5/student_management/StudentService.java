package ss5.student_management;

public class StudentService {
    private static Student[] studentList = new Student[10];
    static {
        studentList[0] = new Student(1,"chánh","KT");
        studentList[1] = new Student(2,"Long","KT");
        studentList[2] = new Student(3,"Vinh","KT");
    }
    // cá method CRDU
    public Student[] getAll(){
        return studentList;
    }

    public void add(Student student) {
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]==null){
                studentList[i] = student;
                break;
            }
        }
    }
}
