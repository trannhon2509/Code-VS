package springjpa.learn_jpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import springjpa.learn_jpa.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
