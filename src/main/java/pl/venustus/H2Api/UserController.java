package pl.venustus.H2Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/api/users")
    public Iterable<User> getUsers() {
        User user = new User();
        user.setEmail("m@2.pl");
        user.setName("Mi");
        userRepository.save(user);

        User user1 = new User();
        user1.setEmail("md@2.pl");
        user1.setName("Mai");
        userRepository.save(user1);

        return userRepository.findAll();
    }
}
