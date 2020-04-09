package com.blog.fan.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  xufan
 * @Date 2020-04-09 
 */
public class Employee {

	private static final long serialVersionUID =  5074906008294945951L;
    /**
      * 员工编号
      **/
    private Integer eId;

    /**
      * 员工姓名
      **/
    private String eNameEName;

    /**
      * 性别
      **/
    private String eSex;

    /**
      * 出生日期
      **/
    private Date eBrithday;

    /**
      * 省份证号码
      **/
    private String eIdcard;

    /**
      * 部门编号
      **/
    private Integer dId;

    /**
      * 岗位编号
      **/
    private Integer jId;

    /**
      * 是否试用期  0表示否，1表示是
      **/
    private Integer eProbation;

    /**
      * 是否离职  0表示否，1表示是
      **/
    private Integer eDimisssion;

    /**
      * 新增日期
      **/
    private Date eAddDate;

    /**
      * 修改日期
      **/
    private Date eUpdateDate;



  public Integer getEId() {
    return eId;
  }

  public void setEId(Integer eId) {
    this.eId = eId;
  }


  public String getENameEName() {
    return eNameEName;
  }

  public void setENameEName(String eNameEName) {
    this.eNameEName = eNameEName;
  }


  public String getESex() {
    return eSex;
  }

  public void setESex(String eSex) {
    this.eSex = eSex;
  }


  public Date getEBrithday() {
    return eBrithday;
  }

  public void setEBrithday(Date eBrithday) {
    this.eBrithday = eBrithday;
  }


  public String getEIdcard() {
    return eIdcard;
  }

  public void setEIdcard(String eIdcard) {
    this.eIdcard = eIdcard;
  }


  public Integer getDId() {
    return dId;
  }

  public void setDId(Integer dId) {
    this.dId = dId;
  }


  public Integer getJId() {
    return jId;
  }

  public void setJId(Integer jId) {
    this.jId = jId;
  }


  public Integer getEProbation() {
    return eProbation;
  }

  public void setEProbation(Integer eProbation) {
    this.eProbation = eProbation;
  }


  public Integer getEDimisssion() {
    return eDimisssion;
  }

  public void setEDimisssion(Integer eDimisssion) {
    this.eDimisssion = eDimisssion;
  }


  public Date getEAddDate() {
    return eAddDate;
  }

  public void setEAddDate(Date eAddDate) {
    this.eAddDate = eAddDate;
  }


  public Date getEUpdateDate() {
    return eUpdateDate;
  }

  public void setEUpdateDate(Date eUpdateDate) {
    this.eUpdateDate = eUpdateDate;
  }

}
