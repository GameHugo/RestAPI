package me.gamehugo.restapi.cat;

import me.gamehugo.restapi.RestApiApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatController {

    @GetMapping("/cat")
    public List<Cat> cat(@RequestParam(value = "name", defaultValue = "test") String name) {
        return RestApiApplication.catManager.getByName(name);
    }

}
