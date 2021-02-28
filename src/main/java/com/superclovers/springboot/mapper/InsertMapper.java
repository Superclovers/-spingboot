package com.superclovers.springboot.mapper;

import com.superclovers.springboot.entity.InsertEntity;
import org.springframework.stereotype.Repository;

/**
 * 新增商品数据的持久层接口
 */
@Repository
public interface InsertMapper {
   Integer addnew(InsertEntity data);
}
