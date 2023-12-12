package lesson19.controller;

import javax.servlet.http.HttpServletRequest;
import lesson19.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class StudentController {
    private Student student;

    @GetMapping("/")
    public String init(HttpServletRequest request) {
        request.setAttribute("mode", "REGISTRATION");
        return "index";
    }

    @PostMapping("/registerStudent")
    public String registerStudent(@RequestParam String name, @RequestParam String surname, @RequestParam int age, @RequestParam MultipartFile photo, HttpServletRequest request) throws IOException {
        this.student = new Student(name, surname, age, photo);
        saveFile(this.student.getPhoto());
        request.setAttribute("mode", "REGISTERED");
        request.setAttribute("student", this.student);
        return "index";
    }

    public void saveFile(MultipartFile file) throws IOException {
        Files.createDirectories(Paths.get("target/classes/static/images/"));
        String folder = "target/classes/static/images/";
        byte[] bytes = file.getBytes();
        Path path = Paths.get(folder + file.getOriginalFilename());
        Files.write(path, bytes);
    }
}
