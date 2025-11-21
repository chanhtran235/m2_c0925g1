package ss8_mvc.repository;

import ss8_mvc.entity.Student;

import java.util.List;

public interface IStudentRepository {

    List<Student> findAll();
    void add(Student student);
    boolean deleteById(int id);
    Student findById(int id);

}
