package spring.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import spring.jpa.model.User;
import spring.jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public void run(String... args) throws Exception {

        List<User> users = userRepository.findByNameContaining("Victor");

        for (User u : users) {
            System.out.println(u);
        }
    }
    
}
