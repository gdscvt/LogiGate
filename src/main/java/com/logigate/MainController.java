package com.logigate;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

/**
 * Define mapping for primary web pages
 */
@Controller
public class MainController {

    private final ProblemRepository repository;

    MainController(ProblemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "LogiGate | Home");
        return "index";
    }

    @GetMapping("/problems/problem-hub")
    public String problemHub(Model model) {
        model.addAttribute("title", "LogiGate | Problems");
        return "/problems/problem-hub";
    }

    @GetMapping("/learn/learn-hub")
    public String learn(Model model) {
        model.addAttribute("title", "LogiGate | Learn");
        return "/learn/learn-hub";
    }

    @GetMapping("/discuss/discuss-hub")
    public String discuss(Model model) {
        model.addAttribute("title", "LogiGate | Discussion");
        return "/discuss/discuss-hub";
    }

    @GetMapping("/discuss/discussion1")
    public String discussion1(Model model) {
        return "/discuss/discussion1";
    }

    @GetMapping("/problems/problem1")
    public String problem(Model model) {
        return "/problems/problem1";
    }

    @GetMapping("/problems/{slug}")
    public String problem(@PathVariable String slug, Model model) {
        Problem problem = repository.findBySlug(slug);
        if (problem == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This problem does not exist");
        }
        model.addAttribute("title", "Problem " + problem.getNumber());
        model.addAttribute("problem", problem);
        return "/problems/problem";
    }
}