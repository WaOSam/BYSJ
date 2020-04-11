package com.sam.controller;

import com.sam.pojo.SaleDetail;
import com.sam.pojo.SaleDetailExample;
import com.sam.service.SaleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者 Sam_T
 * 描述
 * 日期 2020-03-25 17:06
 * @author Sam
 */
@Controller
@RequestMapping(value = "saleDetail", produces = "application/json; charset=utf-8")
public class SaleDetailController extends BaseController<SaleDetail, SaleDetailExample> {
    private SaleDetailService saleDetailService;

    @Autowired
    public void setSaleDetailService(SaleDetailService saleDetailService) {
        this.saleDetailService = saleDetailService;
        this.baseService = saleDetailService;
    }
}
