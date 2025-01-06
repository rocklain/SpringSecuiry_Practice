package com.example.its.web.user;

import com.example.its.domain.issue.auth.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public String showlist(Model model){
        model.addAttribute("userList", userService.findAll());
        return "users/list";
    }

    //GET /users/creationForm
    @GetMapping("/creationForm")
    public String showCreationForm() {
        return "users/creationForm";
    }
}
