package com.superclovers.springboot.mapper;

import com.superclovers.springboot.entity.InsertEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertMapperTests {

    @Autowired
    public InsertMapper insertMapper;

    @Test
    public void  addnew(){
        InsertEntity insertEntity = new InsertEntity();
        insertEntity.setPid(106);
        insertEntity.setPname("篮球");
        insertEntity.setPprices("4");
        Integer rows = insertMapper.addnew(insertEntity);
        System.err.println("rows=" + rows);
    }

}
