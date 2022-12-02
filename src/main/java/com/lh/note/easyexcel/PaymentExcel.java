package com.lh.note.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :lh
 * @Date: 2022-12-02 17:15
 */
@Data
@NoArgsConstructor
public class PaymentExcel {

    @ColumnWidth(20)
    @ExcelProperty("主键ID")
    private Integer id;

    @ColumnWidth(20)
    @ExcelProperty("名称")
    private String name;

    @ColumnWidth(20)
    @ExcelProperty("年龄")
    private Integer age;

    @ColumnWidth(20)
    @ExcelProperty("电话")
    private String phone;

    @ColumnWidth(20)
    @ExcelProperty("邮箱")
    private String email;

    @ColumnWidth(20)
    @ExcelProperty("地址")
    private String address;
}
