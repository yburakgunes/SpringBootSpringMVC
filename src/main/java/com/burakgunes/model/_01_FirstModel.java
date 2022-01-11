package com.burakgunes.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _01_FirstModel {
    //localhost:8080/ilkuygulama

    //ekranda göster
    @GetMapping("/ilkuygulama")
    @ResponseBody
    public String firstMethod() {

        return "Spring Boot";
    }


}
