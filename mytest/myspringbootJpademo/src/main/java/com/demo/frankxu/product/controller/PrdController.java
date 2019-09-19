package com.demo.frankxu.product.controller;



import com.demo.frankxu.product.dao.PrdInfoDao;
import com.demo.frankxu.product.entity.CustInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@Api(tags = "产品中心")
@RequestMapping("/prd")
public class PrdController {
    protected org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    PrdInfoDao prdInfoDao;



    @ApiOperation(value = "查询所有主产品信息",response = CustInfo.class)
    @RequestMapping("/getMprdAll")
    public void getMprdAll()throws Exception {

    }


}
