package com.superclovers.springboot.service;

import com.superclovers.springboot.entity.GoodsEntity;
import org.springframework.stereotype.Service;

/**
 * 处理更改商品数据的业务层接口
 */
@Service
public interface IUpdateService {

    /**
     * 根据商品编号pid获取对应的商品数据信息
     *
     * @param pid 商品编号
     * @return 匹配的商品数据信息
     */
    GoodsEntity getByPid(Integer pid);

    /**
     * 修改商品数据
     *
     * @param data 商品数据
     * @return 所修改的数据
     */
    Integer updateData(GoodsEntity data);

    /**
     * 删除商品数据
     *
     * @param pid 商品编号
     */
    Integer deleteData(Integer pid);

}
