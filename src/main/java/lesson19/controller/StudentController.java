package lesson19.controller;

import javax.servlet.http.HttpServletRequest;
import lesson19.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private Student student;

    @GetMapping("/")
    public String init(HttpServletRequest request) {
        request.setAttribute("mode", "REGISTRATION");
        return "index";
    }

    @PostMapping("/registerStudent")
    public String registerStudent(@ModelAttribute Student student, HttpServletRequest request) {
        this.student = student;
        request.setAttribute("mode", "REGISTERED");
        request.setAttribute("student", this.student);
        return "index";
    }

}
