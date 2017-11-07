package manzalini.marco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public String helloWorld() {
        return "HELLO!";
    }

}
