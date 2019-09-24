package vn.ladudu.studentweb;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> getAll();
    Optional<Student> getById(Long id);
    boolean create(Student student);
    boolean edit(Student student);
    boolean delete(Long id);
}
