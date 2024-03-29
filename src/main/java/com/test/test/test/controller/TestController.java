package com.test.test.test.controller;

import com.test.test.test.dao.TestRepository;
import com.test.test.test.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @RequestMapping("/")
    @ResponseBody
    public String saveTest() {
        Test test = new Test();
        test.setContent("abc");
        testRepository.save(test);

        return "저장이 잘 됐습니다.";
    }

}
