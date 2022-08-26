package me.gamehugo.restapi;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ImageController {

    @GetMapping("/image")
    public void getImage(@RequestParam(value = "id", defaultValue = "cat.png") String id, HttpServletResponse response) throws IOException {
        ClassPathResource imgFile = new ClassPathResource(id);
        if (!exists(imgFile)) {
            response.sendError(404, "no such id");
            return;
        }

        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
    }

    public boolean exists(ClassPathResource resource) {
        try {
            resource.getFile();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
