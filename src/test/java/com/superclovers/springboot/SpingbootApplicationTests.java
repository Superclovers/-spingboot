package com.superclovers.springboot;

import com.superclovers.springboot.entity.GoodsEntity;
import com.superclovers.springboot.mapper.GoodsMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GoodsMapperTests {

    @Autowired
    public GoodsMapper mapper;

    @Test
    public void findList() {
        System.err.println(mapper);

        List<GoodsEntity> list = mapper.findList();
        System.err.println("count=" + list.size());
        for (GoodsEntity item : list) {
            System.out.println(item);
        }
    }
}
