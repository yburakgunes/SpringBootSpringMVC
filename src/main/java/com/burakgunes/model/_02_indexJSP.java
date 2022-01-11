package com.burakgunes.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _02_indexJSP {

    @GetMapping("/jsp")
    public String getJsp() {
        return "index";
    }
}
