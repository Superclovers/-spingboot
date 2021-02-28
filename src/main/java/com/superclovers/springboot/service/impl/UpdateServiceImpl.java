package com.superclovers.springboot.service.impl;

import com.superclovers.springboot.entity.GoodsEntity;
import com.superclovers.springboot.mapper.UpdateMapper;
import com.superclovers.springboot.service.IUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.interfaces.RSAKey;

/**
 * 处理商品数据更改业务层实现类
 */
@Service
public class UpdateServiceImpl implements IUpdateService {

    @Autowired
    private UpdateMapper uMapper;

    @Override
    public GoodsEntity getByPid(Integer pid) {
        // 根据参数pid查询对应的商品数据
        GoodsEntity result = uMapper.findPid(pid);
        return result;
    }

    @Override
    public Integer updateData(GoodsEntity data) {
        Integer res = uMapper.updateData(data);
        return res;
    }

    @Override
    public Integer deleteData(Integer pid) {
        Integer s = uMapper.deleteData(pid);
        return s;
    }


}
