package com.burakgunes.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _03_otherJSP {

    @GetMapping("/otherpage")
    public String getJsp() {
        return "otherfile/other";
    }
}
