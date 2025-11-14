package ss8_mvc.entity;

public class Student extends Person {
    private String className;
    public static String school;

    static {
        school = "BK";
    }

    public Student() {

    }
    public Student(int id, String name, String address) {
        super(id, name, address);
    }

    public Student(int id, String name, String address,String className) {
        super(id, name, address);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        return this.getId()==student.getId();
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                ", className='" + this.getClassName() + '\'' +
                '}';
    }
}
