package com.superclovers.springboot.service.impl;

import com.superclovers.springboot.entity.GoodsEntity;
import com.superclovers.springboot.mapper.GoodsMapper;
import com.superclovers.springboot.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 获取热销商品列表
     *
     * @return 热销商品列表
     */
    @Override
    public List<GoodsEntity> getHotList() {
        return goodsMapper.findList();
    }
}
