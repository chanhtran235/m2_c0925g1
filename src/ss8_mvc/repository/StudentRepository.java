package ss8_mvc.repository;

import ss8_mvc.entity.Student;
import ss8_mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final String STUTDEN_FILE ="src/ss8_mvc/data/student.csv";


    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSVToStringList(STUTDEN_FILE);
        String[] array = null;
        for (int i = 0; i <stringList.size() ; i++) {
           array = stringList.get(i).split(",");
           Student student = new Student(Integer.parseInt(array[0]),array[1],array[2],array[3]);
           studentList.add(student);
        }
        return studentList;
    }


    @Override
    public void add(Student student) {
        // ghi file/ lưu vào DB
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        ReadAndWriteFile.write(STUTDEN_FILE,stringList,true);
    }

    @Override
    public boolean deleteById(int id) {
        List<Student> studentList = findAll();
        boolean isDeleteSuccess = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id){
                studentList.remove(i);
                isDeleteSuccess = true;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < studentList.size() ; i++) {
            stringList.add(studentList.get(i).getInfoToCSV());
        }
        ReadAndWriteFile.write(STUTDEN_FILE,stringList,false);

        return isDeleteSuccess;
    }

    @Override
    public Student findById(int id) {
        List<Student> studentList = findAll();
        for (int i = 0; i <studentList.size() ; i++) {
            if (studentList.get(i).getId()==id){
                return studentList.get(i);
            }
        }
        return null;
    }

}
