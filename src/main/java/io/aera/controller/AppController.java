package io.aera.controller;

import io.aera.model.Cat;
import io.aera.model.Dog;
import io.aera.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    @Autowired
    private Cat cat;
    @Autowired
    Message message;
    @Autowired
    private Dog dog;

    // localhost:8080/
    @RequestMapping("/")
    public String hello(Model model) {
        message.setMessageInfo("Big ane fat cat Tihon!");
        model.addAttribute("attr", message.getMessage());
        //model.addAttribute("attr", cat.getName());
        return "index";
    }

    @RequestMapping("/create")
    public String createDogTable(Model model) {
        model.addAttribute("status", dog.createDogTable());
        return "dog";
    }

    @RequestMapping("/user/page")
    public String getUser() {
        return "page";
    }

    @RequestMapping("/admin/page")
    public String getAdmin() {
        return "admin";
    }
}
