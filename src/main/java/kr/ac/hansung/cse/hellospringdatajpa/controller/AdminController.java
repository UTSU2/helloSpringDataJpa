package kr.ac.hansung.cse.hellospringdatajpa.controller;

import kr.ac.hansung.cse.hellospringdatajpa.entity.MyUser;
import kr.ac.hansung.cse.hellospringdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private UserService userService; // 사용자 목록을 제공하는 서비스

    @GetMapping("/admin/home")
    public String showAdminHome(Model model) {
        List<MyUser> userList = userService.getAllUsers();
        model.addAttribute("userList", userList);
        return "adminhome"; // templates/adminhome.html
    }
}