package com.logigate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SiteErrorController implements ErrorController {

    /**
     * Serves error page with specified status code and exception message, if
     * present
     * 
     * @param request
     * @param model
     * @return
     */
    @GetMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        Exception e = (Exception) request.getAttribute("javax.servlet.error.exception");
        model.addAttribute("errorNum", ((statusCode == null) ? "" : Integer.toString(statusCode)));
        model.addAttribute("errorMsg", (e == null ? "" : e.getMessage()));
        return "error";
    }
}
