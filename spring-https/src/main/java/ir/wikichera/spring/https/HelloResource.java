package ir.wikichera.spring.https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloResource {
    @GetMapping()
    public String getHelloResource(){
        return "Hello resource";
    }
}
