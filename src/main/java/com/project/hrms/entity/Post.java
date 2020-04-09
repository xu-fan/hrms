package com.blog.fan.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  xufan
 * @Date 2020-04-09 
 */
public class Post {

	private static final long serialVersionUID =  3401048966071923393L;
    /**
      * 岗位编号
      **/
    private Integer pId;

    /**
      * 岗位名称
      **/
    private String pName;

    /**
      * 岗位所在部门
      **/
    private Integer dId;

    /**
      * 上级岗位编号
      **/
    private Integer pSupid;

    /**
      * 新增日期
      **/
    private Date pAddDate;

    /**
      * 修改日期
      **/
    private Date pUpdateDate;



  public Integer getPId() {
    return pId;
  }

  public void setPId(Integer pId) {
    this.pId = pId;
  }


  public String getPName() {
    return pName;
  }

  public void setPName(String pName) {
    this.pName = pName;
  }


  public Integer getDId() {
    return dId;
  }

  public void setDId(Integer dId) {
    this.dId = dId;
  }


  public Integer getPSupid() {
    return pSupid;
  }

  public void setPSupid(Integer pSupid) {
    this.pSupid = pSupid;
  }


  public Date getPAddDate() {
    return pAddDate;
  }

  public void setPAddDate(Date pAddDate) {
    this.pAddDate = pAddDate;
  }


  public Date getPUpdateDate() {
    return pUpdateDate;
  }

  public void setPUpdateDate(Date pUpdateDate) {
    this.pUpdateDate = pUpdateDate;
  }

}
