package com.test.test.Reply.controller;

import com.test.test.Reply.dao.ReplyRepository;
import com.test.test.Reply.domain.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/answer")
public class ReplyController {

    @Autowired
    private ReplyRepository replyRepository;

    @RequestMapping("/list")
    @ResponseBody
    public List<Reply> showReplys() {
        return replyRepository.findAll();
    }
}
