package me.personal.controller;

import me.personal.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/save")
    public void save() {
        personService.save();
    }

    @RequestMapping("/get")
    public void get() {
        personService.get();
    }

    @RequestMapping("/update")
    public void update() {
        personService.update();
    }

    @RequestMapping("/delete")
    public void delete() {
        personService.delete();
    }
}
