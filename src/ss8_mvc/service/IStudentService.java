package ss8_mvc.service;

import ss8_mvc.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    void add(Student student);
    boolean deleteById(int id);
}
