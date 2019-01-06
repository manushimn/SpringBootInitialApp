package com.learning.springbootfirstapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ui")
public class UIController {

    @RequestMapping(method = RequestMethod.GET)
    public String renderHomePage(){
        return "dummyHomePage";
    }
}
