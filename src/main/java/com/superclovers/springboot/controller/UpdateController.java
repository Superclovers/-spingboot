package com.superclovers.springboot.controller;

import com.superclovers.springboot.entity.GoodsEntity;
import com.superclovers.springboot.service.IUpdateService;
import com.superclovers.springboot.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("springboot")
public class UpdateController extends BaseController {

    @Autowired
    private IUpdateService updateService;


    /**
     * 根据pid获取对应商品数据
     *
     * @param pid 商品编号
     * @return 返回对应pid的商品数据
     */
    @GetMapping("getPidData/{pid}")
    @ResponseBody
    public ResponseResult<GoodsEntity> getData(@PathVariable Integer pid) {
        GoodsEntity data = updateService.getByPid(pid);
        return new ResponseResult<>(SUCCESS, data);
    }


    /**
     * 修改商品
     * @param pid 商品pid
     * @param pname 修改的商品名称
     * @param pprices 修改的商品单价
     * @return
     */
    @RequestMapping("updateData")
    @ResponseBody
    public ResponseResult<Void> updateData(
            @RequestParam("pid") Integer pid,
            @RequestParam("pname") String pname,
            @RequestParam("pprices") String pprices){
        GoodsEntity datas = new GoodsEntity();
        datas.setPid(pid);
        datas.setPname(pname);
        datas.setPprices(pprices);
        ResponseResult<Void> rr = new ResponseResult<>();
        Integer result = updateService.updateData(datas);
        rr.setState(200);
        return rr;
    }

    /**
     * 删除对应的商品数据
     * @param pid 商品编号
     * @return
     */
    @RequestMapping("deleteData")
    @ResponseBody
    public ResponseResult<Void> deleteData(@RequestParam("pid") Integer pid){
        GoodsEntity goodsEntity = new GoodsEntity();
        goodsEntity.setPid(pid);
        ResponseResult<Void> rr = new ResponseResult<>();
        Integer result = updateService.deleteData(pid);
        rr.setState(200);
        return rr;
    }

}
