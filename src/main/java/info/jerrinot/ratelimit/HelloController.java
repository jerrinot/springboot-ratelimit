package info.jerrinot.ratelimit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = "application/json")
    public String all() {
        return """
                {
                  answer: 42,
                  foo: 42
                }
                """;
    }
}
