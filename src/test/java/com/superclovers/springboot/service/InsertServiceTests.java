package com.superclovers.springboot.service;

import com.superclovers.springboot.entity.InsertEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertServiceTests {

    @Autowired
    IInsertService service;

    @Test
    public void reg(){
        InsertEntity insertEntity = new InsertEntity();
        insertEntity.setPid(107);
        insertEntity.setPname("足球");
        insertEntity.setPprices("10");
        Integer rows = service.reg(insertEntity);
        System.err.println("rows=" + rows);
    }
}
