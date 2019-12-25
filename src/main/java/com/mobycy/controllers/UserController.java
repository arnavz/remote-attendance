package com.mobycy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class UserController {

   /* @RequestMapping("/hello")
    public static String hello(){
        return "hello";
    }*/
   @RequestMapping("/punchIn")
   public String UserPunchIn(String UserId){
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
