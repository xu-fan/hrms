/*
Navicat MySQL Data Transfer

Source Server         : jjjj
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : hrms

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2020-04-09 10:18:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `d_id` int(11) NOT NULL COMMENT '部门编号',
  `d_name` varchar(255) NOT NULL COMMENT '部门名称',
  `d_supid` int(11) DEFAULT '0' COMMENT '上级部门id',
  `d_add_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增日期',
  `d_update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `e_id` int(11) NOT NULL COMMENT '员工编号',
  `e_name
e_name` varchar(30) NOT NULL COMMENT '员工姓名',
  `e_sex` varchar(10) NOT NULL COMMENT '性别',
  `e_brithday` datetime DEFAULT NULL COMMENT '出生日期',
  `e_idcard` varchar(18) DEFAULT NULL COMMENT '省份证号码',
  `d_id` int(11) DEFAULT NULL COMMENT '部门编号',
  `j_id` int(11) DEFAULT NULL COMMENT '岗位编号',
  `e_probation` int(1) NOT NULL DEFAULT '1' COMMENT '是否试用期  0表示否，1表示是',
  `e_dimisssion` int(1) NOT NULL DEFAULT '0' COMMENT '是否离职  0表示否，1表示是',
  `e_add_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增日期',
  `e_update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of employee
-- ----------------------------

-- ----------------------------
-- Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `p_id` int(11) NOT NULL COMMENT '岗位编号',
  `p_name` varchar(255) NOT NULL COMMENT '岗位名称',
  `d_id` int(11) NOT NULL COMMENT '岗位所在部门',
  `p_supid` int(11) DEFAULT '0' COMMENT '上级岗位编号',
  `p_add_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增日期',
  `p_update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of post
-- ----------------------------
