package com.superclovers.springboot.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * 商品列表信息数据的实体类
 */
@Data
public class GoodsEntity implements Serializable {
    private static final long serialVersionUID = -7123568729160306865L;
    private Integer pid;
    private String pname;
    private float pprices;
}
