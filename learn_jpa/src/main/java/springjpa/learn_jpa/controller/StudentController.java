package springjpa.learn_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springjpa.learn_jpa.model.Student;
import springjpa.learn_jpa.repository.StudentRepository;

@RestController
@RequestMapping("/admin")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    
    @GetMapping("/students")
    public ResponseEntity<?> getEntity(){
        List<Student> student = studentRepository.findAll();
        return ResponseEntity.ok(student);
    }
    
                                                                    
}
