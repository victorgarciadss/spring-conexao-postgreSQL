package spring.jpa.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
    List<User> findByNameContaining(String name);

    User findByUserName(String username);

    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> filterByName(@Param("name") String name);
}
