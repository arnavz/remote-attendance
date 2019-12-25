package com.mobycy.controllers;

import com.mobycy.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class UserController {

    @Autowired
    UserServiceInterface userService;
   /* @RequestMapping("/hello")
    public static String hello(){
        return "hello";
    }*/
   @RequestMapping("/punchIn")
   public String UserPunchIn(@PathVariable("userId") String UserId){

       //Validation to check if user is already checked In
       /*if(AlreadyPunchedIn)
           return false;*/

    userService.punchIn(UserId);






       return "User Punched In";
   }

    @RequestMapping("/punchOut")
    public String UserPunchOut(String UserId){
        return null;
    }

    @RequestMapping("/getLocation")
    public List<String> getLocationByUserId(String UserId) {


        return null;
    }
}
