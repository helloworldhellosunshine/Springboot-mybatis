package cn.zcbigdata.mybits_demo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.io.FileReader;


@Controller
public class IndexController {
    private static final Logger LOGGER = Logger.getLogger(IndexController.class);

    @RequestMapping("/")
    public String index(){
        return "back";
    }

}
