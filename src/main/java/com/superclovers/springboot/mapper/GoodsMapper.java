package com.superclovers.springboot.mapper;

import com.superclovers.springboot.entity.GoodsEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 处理商品数据的持久层接口
 */
@Repository
public interface GoodsMapper {
    /**
     * 获取所有商品列表
     * @return 商品列表
     */
    List<GoodsEntity> findList();
}
