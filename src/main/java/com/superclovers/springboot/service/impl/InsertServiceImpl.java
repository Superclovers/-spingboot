package com.superclovers.springboot.service.impl;

import com.superclovers.springboot.entity.InsertEntity;
import com.superclovers.springboot.mapper.InsertMapper;
import com.superclovers.springboot.service.IInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertServiceImpl implements IInsertService {

    @Autowired
    private InsertMapper insertMapper;


    /**
     * 新增商品数据
     * @return 商品数据
     */
    @Override
    public Integer reg(InsertEntity data) {
        Integer rows = insertMapper.addnew(data);
        System.err.println(rows);
        return rows;
    }
}
