package com.lh.note.controller;

import com.lh.note.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author :lh
 * @Date: 2022-10-17 16:40
 */
@RestController
@AllArgsConstructor
public class TestController {
    private final TestService testService;

    @PostMapping("/export")
    public void export(HttpServletResponse response) {
        testService.export(response);
    }

}
