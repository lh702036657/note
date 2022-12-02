package com.lh.note.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lh.note.entity.Payment;

import javax.servlet.http.HttpServletResponse;

/**
 * @author :lh
 * @Date: 2022-12-02 16:17
 */
public interface TestService extends IService<Payment> {

    void export(HttpServletResponse response);
}
