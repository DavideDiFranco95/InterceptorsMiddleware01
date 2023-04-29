package co.develhope.interceptorsmiddleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping("")
    public LocalTime getTime(){
        return LocalTime.now();
    }
    /*@GetMapping("")
    public String userAgent(HttpServletRequest request){
        String agent = request.getHeader("User-Agent");
        return agent;
    }*/
}