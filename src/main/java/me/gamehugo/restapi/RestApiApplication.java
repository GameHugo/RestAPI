package me.gamehugo.restapi;

import me.gamehugo.restapi.cat.CatManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {
    public static CatManager catManager;
    public static void main(String[] args) {
        catManager = new CatManager();
        SpringApplication.run(RestApiApplication.class, args);
    }

}
