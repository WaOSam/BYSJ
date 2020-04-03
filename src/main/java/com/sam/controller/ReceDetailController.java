package com.sam.controller;

import com.sam.pojo.ReceDetail;
import com.sam.pojo.ReceDetailExample;
import com.sam.service.ReceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@Author: Same_T
 *@date: 2020-03-26 15:36:47
 *@Description: 编写receDetail业务
 */
@Controller
@RequestMapping(value = "receDetail", produces = "application/json; charset=utf-8")
public class ReceDetailController extends BaseController<ReceDetail, ReceDetailExample> {
    private ReceDetailService receDetailService;

    @Autowired
    public void setReceDetailService(ReceDetailService receDetailService) {
        this.receDetailService = receDetailService;
        this.baseService = receDetailService;
    }
}
