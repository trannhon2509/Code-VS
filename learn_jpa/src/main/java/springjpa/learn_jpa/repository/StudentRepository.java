package springjpa.learn_jpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springjpa.learn_jpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{
    
}
