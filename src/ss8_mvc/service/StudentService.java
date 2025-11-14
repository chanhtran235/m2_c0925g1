package ss8_mvc.service;

import ss8_mvc.entity.Student;
import ss8_mvc.repository.IStudentRepository;
import ss8_mvc.repository.StudentRepository;

public class StudentService implements IStudentService {

    // cá method CRDU
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        // kiểm tra xem dữ student có hợp lệ hay không
        // + ok => gọi repository để thêm mới
     studentRepository.add(student);
    }
}
