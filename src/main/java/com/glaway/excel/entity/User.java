package com.glaway.excel.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.glaway.excel.util.SexConverter;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-12-29 15:30:01
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelIgnore
    private String id;

    @ExcelProperty(value = {"姓名"}, index = 0)
    @ColumnWidth(8)
    private String name;

    @ExcelProperty(value = {"性别"}, index = 1,converter = SexConverter.class)
    @ColumnWidth(8)
    private Integer sex;

    @ExcelProperty(value = {"年龄"}, index = 2)
    @ColumnWidth(8)
    private Integer age;

    @ExcelProperty(value = {"创建时间"}, index = 3)
    @ColumnWidth(20)
    @DateTimeFormat("yyyy-MM-dd hh:dd:ss")
    private Date createTime;

    @ExcelProperty(value = {"状态"}, index = 4)
    @ColumnWidth(8)
    private Integer status;


}