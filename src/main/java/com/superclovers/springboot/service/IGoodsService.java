package com.superclovers.springboot.service;

import java.util.List;
import com.superclovers.springboot.entity.GoodsEntity;

/**
 * 处理数据的业务层接口
 */
public interface IGoodsService {

    /**
     * 获取热销商品列表
     * @return 热销商品列表
     */
    List<GoodsEntity> getHotList();

}
