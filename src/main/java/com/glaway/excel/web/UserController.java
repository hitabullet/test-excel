package com.glaway.excel.web;

import com.glaway.excel.entity.User;
import com.glaway.excel.service.UserService;
import com.glaway.excel.util.ReturnT;
import com.glaway.excel.util.UUIDGenerator;
import com.glaway.excel.util.excel.ExcelListener;
import com.glaway.excel.util.excel.ExcelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-07-22 09:57:55
 */
@RestController
@RequestMapping(value = "/easyExcel")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelListener.class);

    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @PostMapping(value = "/import")
    public ReturnT read(MultipartFile excel) {
        List<User> userList = ExcelUtil.readExcel(excel, User.class, 0);

        //for循环遍历赋予每个user一个随机id
        for (User user : userList) {
            user.setId(UUIDGenerator.generate());
        }
        userService.saveEasyExcelData(userList);
        return new ReturnT().setMsg("Excel import successful").setSuccess(true).setResult(true);
    }

    @GetMapping(value = "/export")
    public ReturnT writeExcel(HttpServletResponse response) {
        List<User> list = getList();
        String fileName = UUIDGenerator.generate();
        String sheetName = "sheet";
        ExcelUtil.writeStyleExcel(response, list, fileName, sheetName, User.class);
        return new ReturnT().setMsg("Excel export successful").setSuccess(true).setResult(true);
    }

    private List<User> getList() {
        List<User> userList = userService.queryAll(new User());
        //根据创建时间降序排序
        userList.sort(Comparator.comparing(User::getCreateTime).reversed());
        LOGGER.info("all excel data parsed, count:{}", userList.size());
        return userList;
    }

}
