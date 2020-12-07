package pl.koral.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @Value("${app.user}")
    @GetMapping
    public String hello(){
        return "hello userApi its !";
    }
}
