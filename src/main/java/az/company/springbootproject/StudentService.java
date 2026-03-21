package az.company.springbootproject;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll(){
        return repo.findAll();
    }
    public Student addStudent(Student student){
        return repo.save(student);
    }
    public List<Student>searchStudents(String query){
        return repo.findAll().stream()
                .filter(s-> s.getFirstName().toLowerCase().contains(query.toLowerCase())
                || s.getLastName().toLowerCase().contains(query.toLowerCase())
                || s.getStudentNumber().toLowerCase().contains(query.toLowerCase())
                || s.getId().toString().contains(query))
                .toList();

    }
}
