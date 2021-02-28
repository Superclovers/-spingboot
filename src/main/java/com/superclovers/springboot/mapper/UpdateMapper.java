package com.superclovers.springboot.mapper;

import com.superclovers.springboot.entity.GoodsEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 修改商品数据持久层接口
 * 注：为了学习方便，这里用回GoodsEntity实体类。
 */
@Repository
public interface UpdateMapper {
    /**
     * 修改数据
     *
     * @param data 修改商品所有数据
     * @return 商品数据
     */
    Integer updateData(GoodsEntity data);

    /**
     * 根据pid查询数据
     *
     * @param pid 商品编号
     * @return 匹配对应的商品数据
     */
    GoodsEntity findPid(Integer pid);

    /**
     * 根据对应的pid删除对应的商品数据
     *
     * @param pid
     * @return 删除匹配对应数据
     * 注：为了统一管理，把删除的mapper接口写在这
     */
    Integer deleteData(Integer pid);

}
