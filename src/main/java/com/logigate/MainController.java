package com.logigate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Define mapping for primary web pages
 */
@Controller
public class MainController {
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
}