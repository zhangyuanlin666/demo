package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author zhangyuanlin
 * @date 2023/12/20
 */
@RestController
@RequestMapping("/api/exam")
public class ExamController {

    @GetMapping
    public String exam(@RequestParam(value = "id", required = true) String id) {
        return "hello, this is example";
    }
}
