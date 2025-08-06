package com.example.StickersMania.controller;

import com.example.StickersMania.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/dummy")
@RequiredArgsConstructor

public class DummyController {

    @PostMapping("/create-user")
    public String createUser(@RequestBody UserDto userDto){
        System.out.println(userDto);
        return "User created successfully";


    }

    @GetMapping("/headers")
    public String readHeaders(@RequestHeader (name="User-agent")String userAgent,
                              @RequestHeader   (name="User-Location")String userLocation){

        return "Recieved headers with value:"+ userAgent+" "+userLocation;


    }

    @GetMapping("/search")
    public String searchUser(@RequestParam String name){

        return "Searching for user:"+ name;


    }

    @GetMapping("/multi-search")
    public String multisearch(@RequestParam Map<String,String> params){

        return "Searching for user:"+ params.get("firstname")+" "+params.get("lastname");


    }

    @GetMapping("/user/{userId}/post/{postId}")
    public String getUser(@PathVariable(name = "userId") String id,@PathVariable String postId){

        return "Searching for user:" +id +" and post: "+postId;


    }
}
