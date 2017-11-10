package manzalini.marco;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final UserRepository userRepository;

    public SampleController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public String helloWorld() {
        return "HELLO!";
    }

    @GetMapping("/{id}")
    public User get(@PathVariable int id) {
        return userRepository.findOne(id);
    }

    @PostMapping
    public User addRandom() {
        User user = new User();
        user.setName(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

}
