package pl.bykowski.springbootjwtauthb1;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@RestController
public class Api {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello B1! Koło w piąteczek!!!!";
    }

    @GetMapping("/hello-user")
    public String getHelloUser() {
        return "zaliczysz <3";
    }
}