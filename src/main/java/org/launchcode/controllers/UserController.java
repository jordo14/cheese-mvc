package org.launchcode.controllers;


import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jordanwills on 6/5/17.
 */

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model) {

        return "user/add";

    }

//    @RequestMapping(value = "add", method = RequestMethod.POST)
//    public String add(Model model, User user, String verify) {
//
//        if( ) {
//
//        }
//    }
}
