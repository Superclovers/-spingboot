package com.superclovers.springboot.controller;

import com.superclovers.springboot.entity.GoodsEntity;
import com.superclovers.springboot.service.IGoodsService;
import com.superclovers.springboot.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 处理商品相关请求的控制器类
 */
@RestController
@RequestMapping("springboot")
public class GoodsController extends BaseController {
    @Autowired
    private IGoodsService goodsService;

    @GetMapping("hot")
    public ResponseResult<List<GoodsEntity>> getHotList() {
        // 执行查询
        List<GoodsEntity> data = goodsService.getHotList();
        // 返回
        return new ResponseResult<>(SUCCESS, data);
    }
}
