package demo.hello.demo.controller;

import demo.hello.demo.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {
    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping("/projects")
    public String list(Model model) {
        model.addAttribute("projects", service.getAll());
        return "projects";
    }

    @GetMapping("/projects/detail")
    public String detail(@RequestParam("id") String id, Model model) {
        model.addAttribute("project", service.getById(id));
        return "project-detail";
    }
}
