package com.blog.fan.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  xufan
 * @Date 2020-04-09 
 */
public class Department {

	private static final long serialVersionUID =  990172677386051407L;
    /**
      * 部门编号
      **/
    private Integer dId;

    /**
      * 部门名称
      **/
    private String dName;

    /**
      * 上级部门id
      **/
    private Integer dSupid;

    /**
      * 新增日期
      **/
    private Date dAddDate;

    /**
      * 修改日期
      **/
    private Date dUpdateDate;



  public Integer getDId() {
    return dId;
  }

  public void setDId(Integer dId) {
    this.dId = dId;
  }


  public String getDName() {
    return dName;
  }

  public void setDName(String dName) {
    this.dName = dName;
  }


  public Integer getDSupid() {
    return dSupid;
  }

  public void setDSupid(Integer dSupid) {
    this.dSupid = dSupid;
  }


  public Date getDAddDate() {
    return dAddDate;
  }

  public void setDAddDate(Date dAddDate) {
    this.dAddDate = dAddDate;
  }


  public Date getDUpdateDate() {
    return dUpdateDate;
  }

  public void setDUpdateDate(Date dUpdateDate) {
    this.dUpdateDate = dUpdateDate;
  }

}
