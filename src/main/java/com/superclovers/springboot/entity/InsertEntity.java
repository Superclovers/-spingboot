package com.superclovers.springboot.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 更新产品数据的实体类
 */
@Data
public class InsertEntity implements Serializable {
    private static final long serialVersionUID = -7123568729160306865L;
    private Integer pid;
    private String pname;
    private String pprices;
}
