package com.lyw.spark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangxiaowu on 16/5/8.
 */
@Controller
public class SparkLearnController {

    @RequestMapping("/spark")
    @ResponseBody
    public Map<String,Object> showSpark(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "hello spark!");
        return map;
    }
}
