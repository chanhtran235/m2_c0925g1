package ss8_mvc.repository;

import ss8_mvc.entity.Student;

public interface IStudentRepository {

    Student[] findAll();
    void add(Student student);
}
