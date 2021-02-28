package com.superclovers.springboot.controller;

import com.superclovers.springboot.entity.InsertEntity;
import com.superclovers.springboot.service.IInsertService;
import com.superclovers.springboot.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理新增商品数据的控制器类
 */
@RestController
@RequestMapping("springboot")
public class InsertController extends BaseController{
    @Autowired
    private IInsertService iInsertService;

    @RequestMapping("insertdata")
    public ResponseResult<Void> reg(InsertEntity data){
        ResponseResult<Void> rr = new ResponseResult<>();
        iInsertService.reg(data);
        rr.setState(200);
        return rr;
    }

}
