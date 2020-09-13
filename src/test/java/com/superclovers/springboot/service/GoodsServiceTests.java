package com.superclovers.springboot.service;

import com.superclovers.springboot.entity.GoodsEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsServiceTests {
    @Autowired
    IGoodsService service;

    @Test
    public void getHotList() {
        List<GoodsEntity> list = service.getHotList();
        System.err.println("count=" + list.size());
        for (GoodsEntity item : list) {
            System.err.println(item);
        }
    }
}
