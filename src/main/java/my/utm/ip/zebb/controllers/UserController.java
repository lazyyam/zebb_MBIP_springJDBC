package my.utm.ip.zebb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import my.utm.ip.zebb.models.user.User;
import my.utm.ip.zebb.services.user.UserService;

@Controller
@RequestMapping("/")

public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session){
        User currentUser = userService.login(username);

        if(currentUser !=null){

        if(currentUser.getPassword().equals(password)){

            currentUser.setAuthenticated(true);

        }else{

            currentUser.setAuthenticated(false);

        }

        session.setAttribute("user", currentUser);

        }
        return "main/index";

    }

    @RequestMapping("/register")
    public String register(){
        return "main/registration";
    }

    @RequestMapping("/registervalidation")
    public String register(@RequestParam("username") String username,
                        @RequestParam("email") String email,
                        @RequestParam("password") String password,
                        HttpSession session){
        User newUser = new User(username,email,password);
        userService.register(newUser);

        session.setAttribute("user", newUser);

        return "main/index";

    }

    @RequestMapping("/updateprofile")
    public String updateProfile(
            @RequestParam("fullname") String fullname,
            @RequestParam("nickname") String nickname,
            @RequestParam("email") String email,
            @RequestParam("phonenum") String phonenum,
            @RequestParam("language") String language,
            @RequestParam("category") String category,
            @RequestParam("poscode") String poscode,
            @RequestParam("address") String address,
            HttpSession session
    ){
        User curuser = (User) session.getAttribute("user");
        curuser.setFullname(fullname);
        curuser.setNickname(nickname);
        curuser.setEmail(email);
        curuser.setPhoneNum(phonenum);
        curuser.setPreferredLanguage(language);
        curuser.setCategory(category);
        curuser.setPoscode(poscode);
        curuser.setAddress(address);
        userService.updateProfile(curuser);
        
        session.removeAttribute("user");
        
        session.setAttribute("user",curuser);
        return "redirect:editprofile";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "main/index";
    }


    @RequestMapping("/editprofile")
    public String editprofile(){
        return "user/editprofile";
    }
}