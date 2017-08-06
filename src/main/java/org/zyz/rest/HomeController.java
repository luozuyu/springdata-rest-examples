package org.zyz.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fin_tech_2014 on 2017/5/9.
 */
@RestController
public class HomeController {

    @RequestMapping("/hello")
    public String index() {
        return "HelloWorld!";
    }

}
