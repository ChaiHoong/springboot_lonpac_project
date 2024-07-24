package com.example.form_validation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.form_validation.model.PostcodeTown;
import com.example.form_validation.model.User;
import com.example.form_validation.repo.PostcodeTownRepository;
import com.example.form_validation.repo.UserRepository;
import com.example.form_validation.service.PostcodeTownService;


@Controller
public class FormValidationController {

    @Autowired
    private UserRepository userrepo;

    @Autowired
    private PostcodeTownRepository postcodeTownRepository;

    @GetMapping("/")
    public String formValidation(Model model) {

        List<PostcodeTown> postcodeTowns = (List<PostcodeTown>) postcodeTownRepository.findAll();
        model.addAttribute("postcodeTowns", postcodeTowns);
        
        return "form_validation";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user, Model model) {
        //TODO: process POST request
        System.out.println(user.toString());
        userrepo.save(user);

        User user_inserted = userrepo.save(user);
        model.addAttribute( "message", "User with ic number " + user_inserted.getIcNumber() + " inserted into database.");
        return "submit";

    }
    
    @Autowired
    private PostcodeTownService postcodeTownService;

    @GetMapping("/findTownsByPostcode")
    @ResponseBody
    public List<PostcodeTown> findTownsByPostcode(@RequestParam String postcode) {
        return postcodeTownService.findTownsByPostcode(postcode);
    }
}
