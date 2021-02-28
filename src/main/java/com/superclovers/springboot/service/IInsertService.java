package com.superclovers.springboot.service;

import com.superclovers.springboot.entity.InsertEntity;

/**
 * 新增商品数据业务层接口
 */
public interface IInsertService {
    Integer reg(InsertEntity data);
}
