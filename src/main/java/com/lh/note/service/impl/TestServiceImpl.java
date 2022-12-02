package com.lh.note.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.lh.note.easyexcel.PaymentExcel;
import com.lh.note.entity.Payment;
import com.lh.note.mapper.TestMapper;
import com.lh.note.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author :lh
 * @Date: 2022-12-02 16:18
 */
@Slf4j
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Payment> implements TestService {

    @Override
    public void export(HttpServletResponse response) {
        try {
            OutputStream out = response.getOutputStream();
            String fileName = "测试导出.xlsx";
/*            response.setHeader("content-type", "application/octet-stream");
            response.setContentType("application/octet-stream");
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
            response.setHeader("Content-Disposition", "attachment; filename=\"" +
                    new String(fileName.getBytes(Charsets.UTF_8),Charsets.ISO_8859_1) + "\"");*/
            response.setCharacterEncoding("UTF-8");
            response.setHeader("content-Type", "application/vnd.ms-excel");
            String fileNameURL = URLEncoder.encode(fileName, "UTF-8");
            response.setHeader("Content-disposition", "attachment;filename="+fileNameURL+";"+"filename*=utf-8''"+fileNameURL);
            List<PaymentExcel> list = baseMapper.list();
            if (CollectionUtils.isEmpty(list)) {
                EasyExcel.write(fileName, PaymentExcel.class).sheet("Empty").doWrite(Lists.newArrayList());
            }else {
                WriteSheet sheet;
                ExcelWriterBuilder writerBuilder = EasyExcel.write(out, PaymentExcel.class);
                ExcelWriter writer = writerBuilder.build();
                sheet = EasyExcel.writerSheet(fileName).build();
                writer.write(list, sheet);
                writer.finish();
            }
        }catch (Exception e) {
            e.printStackTrace();
            log.error("export exception: {}", e.getMessage());
        }
    }
}
