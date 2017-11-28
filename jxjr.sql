/*
Navicat MySQL Data Transfer

Source Server         : 1707
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : jxjr

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2017-11-28 18:46:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for current
-- ----------------------------
DROP TABLE IF EXISTS `current`;
CREATE TABLE `current` (
  `id` bigint(50) NOT NULL,
  `fc_id` bigint(50) DEFAULT NULL COMMENT '理财公司id',
  `risk` int(5) DEFAULT NULL COMMENT '投资风险',
  `nav` int(20) DEFAULT NULL COMMENT '单位净值',
  `three_rate` int(20) DEFAULT NULL COMMENT '三个月的利率',
  `redemp_time` int(5) DEFAULT NULL COMMENT '赎回时长',
  `near_year` int(20) DEFAULT NULL COMMENT '近一年',
  `init_amount` int(20) DEFAULT NULL COMMENT '初始金额',
  `set_time` datetime DEFAULT NULL COMMENT '成立日期',
  `new_scale` varchar(255) DEFAULT NULL COMMENT '最新规模',
  `message` text COMMENT '信息',
  `title` varchar(255) DEFAULT NULL,
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `comid` (`fc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of current
-- ----------------------------

-- ----------------------------
-- Table structure for current_order
-- ----------------------------
DROP TABLE IF EXISTS `current_order`;
CREATE TABLE `current_order` (
  `id` bigint(50) NOT NULL,
  `userid` bigint(50) DEFAULT NULL COMMENT '用户id',
  `currentid` bigint(50) DEFAULT NULL COMMENT '活期产品id',
  `create_time` datetime DEFAULT NULL,
  `money` int(20) DEFAULT NULL COMMENT '购买金额',
  `expire_time` datetime DEFAULT NULL COMMENT '取款时间',
  `message` varchar(255) DEFAULT NULL COMMENT '信息',
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `cufinid` (`currentid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of current_order
-- ----------------------------

-- ----------------------------
-- Table structure for fc_company
-- ----------------------------
DROP TABLE IF EXISTS `fc_company`;
CREATE TABLE `fc_company` (
  `id` bigint(50) NOT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `message` text,
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fc_company
-- ----------------------------

-- ----------------------------
-- Table structure for fixedtime
-- ----------------------------
DROP TABLE IF EXISTS `fixedtime`;
CREATE TABLE `fixedtime` (
  `id` bigint(50) NOT NULL,
  `comid` bigint(50) DEFAULT NULL,
  `seven_earnings` int(20) DEFAULT NULL COMMENT '近七日年化收益率',
  `copies` int(20) DEFAULT NULL COMMENT '万份收益',
  `period_cycle` int(20) DEFAULT NULL COMMENT '锁定周期',
  `init_amount` int(20) DEFAULT NULL COMMENT '初始金额',
  `message` text COMMENT '信息',
  `state` int(2) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `comid` (`comid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fixedtime
-- ----------------------------

-- ----------------------------
-- Table structure for fixedtime_order
-- ----------------------------
DROP TABLE IF EXISTS `fixedtime_order`;
CREATE TABLE `fixedtime_order` (
  `id` bigint(50) NOT NULL,
  `userid` bigint(50) DEFAULT NULL,
  `detimeid` bigint(50) DEFAULT NULL COMMENT '定期产品id',
  `create_time` datetime DEFAULT NULL COMMENT '购买时间',
  `money` int(20) DEFAULT NULL,
  `expire_time` datetime DEFAULT NULL COMMENT '取出时间',
  `message` text,
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `detimeid` (`detimeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fixedtime_order
-- ----------------------------

-- ----------------------------
-- Table structure for insurance_company
-- ----------------------------
DROP TABLE IF EXISTS `insurance_company`;
CREATE TABLE `insurance_company` (
  `id` bigint(50) NOT NULL COMMENT '保险公司表的主键id,关联于保险产品表(company_id)的外键',
  `name` varchar(255) DEFAULT NULL COMMENT '该保险公司的名称',
  `telephone` varchar(20) DEFAULT NULL COMMENT '该保险公司的主要电话,必备',
  `address` varchar(255) DEFAULT NULL COMMENT '该保险公司的主要联系地址',
  `pic_path` varchar(255) DEFAULT NULL COMMENT '公司介绍的图片',
  `message` text COMMENT '公司的相关介绍',
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of insurance_company
-- ----------------------------

-- ----------------------------
-- Table structure for insurance_order
-- ----------------------------
DROP TABLE IF EXISTS `insurance_order`;
CREATE TABLE `insurance_order` (
  `id` bigint(50) NOT NULL,
  `user_id` bigint(50) DEFAULT NULL COMMENT '外键: 关联用户表的ID',
  `insurance_id` bigint(50) DEFAULT NULL COMMENT '外键:关联保险产品表的ID',
  `buy_date` date DEFAULT NULL COMMENT '该用户购买保险产品的时间,精确到秒',
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of insurance_order
-- ----------------------------

-- ----------------------------
-- Table structure for insurance_product
-- ----------------------------
DROP TABLE IF EXISTS `insurance_product`;
CREATE TABLE `insurance_product` (
  `id` bigint(50) NOT NULL COMMENT '保险产品的ID',
  `company_id` bigint(50) DEFAULT NULL COMMENT '关联保险公司表的外键',
  `name` varchar(255) DEFAULT NULL COMMENT '保险产品的名称',
  `cat` tinyint(1) DEFAULT NULL COMMENT '保险分类: 0=空, 1=日常小病, 2=大病, 3=癌症',
  `duration` int(10) DEFAULT NULL COMMENT '保障期限时长: 以"月"为单位',
  `coverage` bigint(20) DEFAULT NULL COMMENT '该产品的保额:以"分"为单位',
  `premium` int(10) DEFAULT NULL COMMENT '该产品的保费:以"分"为单位',
  `message` text COMMENT '该产品的相关信息及介绍',
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `company_id` (`company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of insurance_product
-- ----------------------------

-- ----------------------------
-- Table structure for loan
-- ----------------------------
DROP TABLE IF EXISTS `loan`;
CREATE TABLE `loan` (
  `id` bigint(50) NOT NULL,
  `loan_time` int(11) DEFAULT NULL COMMENT '所借时长/月',
  `repayment` bit(1) DEFAULT b'0' COMMENT '还款方式/就一种',
  `interest_rate` double DEFAULT NULL COMMENT '利率',
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loan
-- ----------------------------

-- ----------------------------
-- Table structure for loan_order
-- ----------------------------
DROP TABLE IF EXISTS `loan_order`;
CREATE TABLE `loan_order` (
  `id` bigint(50) NOT NULL,
  `userId` bigint(50) DEFAULT NULL COMMENT '用户id',
  `loadId` bigint(50) DEFAULT NULL COMMENT '贷款id',
  `money` double DEFAULT NULL COMMENT '贷款多少',
  `total_interest` double DEFAULT NULL COMMENT '总利息',
  `create_time` time DEFAULT NULL COMMENT '创建时间',
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of loan_order
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(50) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_realname` varchar(255) DEFAULT NULL,
  `login_password` varchar(255) DEFAULT NULL,
  `pay_password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL COMMENT '电子邮件',
  `phone` int(20) DEFAULT NULL COMMENT '手机',
  `address` varchar(255) DEFAULT NULL,
  `id_card` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `bank_card_1` varchar(20) DEFAULT NULL COMMENT '银行卡号1',
  `bank_card_2` varchar(20) DEFAULT NULL COMMENT '银行卡号2',
  `image` varchar(255) DEFAULT NULL,
  `level` int(2) DEFAULT NULL,
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for user_profit
-- ----------------------------
DROP TABLE IF EXISTS `user_profit`;
CREATE TABLE `user_profit` (
  `id` bigint(50) NOT NULL AUTO_INCREMENT,
  `today_term_deposits_profit` int(11) DEFAULT NULL COMMENT '定期理财',
  `today_Fund_profit` int(11) DEFAULT NULL COMMENT '基金理财',
  `total_profit` int(11) DEFAULT NULL COMMENT '总收益',
  `userid` int(50) DEFAULT NULL,
  `state` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_profit
-- ----------------------------
