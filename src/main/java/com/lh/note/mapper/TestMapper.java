package com.lh.note.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lh.note.easyexcel.PaymentExcel;
import com.lh.note.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author :lh
 * @Date: 2022-12-02 17:00
 */
@Mapper
public interface TestMapper extends BaseMapper<Payment> {

    List<PaymentExcel> list();
}
