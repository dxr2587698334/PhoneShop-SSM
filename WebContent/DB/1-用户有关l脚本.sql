

USE PhoneShopSSM

CREATE DATABASE PhoneShopSSM CHARSET utf8;

-- drop DATABASE PhoneShopSSM

-- 用户表
CREATE TABLE `user` (
  `uid` VARCHAR(50) NOT NULL COMMENT 'ID',
  `upwd` VARCHAR(50) NOT NULL COMMENT '密码',
  `uname` VARCHAR(50) NOT NULL COMMENT '姓名',
  `uphone` VARCHAR(20) NOT NULL COMMENT '电话',
  `uaddress` VARCHAR(20) NOT NULL COMMENT '地址',
  `role_rid` INT DEFAULT 103 COMMENT '角色id',
  PRIMARY KEY (`uid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

SELECT * FROM USER;
-- -----------------------------

-- 角色表
CREATE TABLE `role` (
  `r_id` INT AUTO_INCREMENT COMMENT '角色ID',
  `r_name` VARCHAR(50) NOT NULL COMMENT '角色名称',
  `r_describe` VARCHAR(500) NOT NULL COMMENT '角色描述',
  PRIMARY KEY (`r_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 AUTO_INCREMENT=100;

SELECT * FROM role;
-- -----------------------------

-- 权限表
CREATE TABLE `privilege` (
  `p_id` VARCHAR(50) COMMENT'权限ID',
  `p_name` VARCHAR(50) NOT NULL COMMENT'权限名称',
  `p_uri` VARCHAR(50) NOT NULL COMMENT'权限的链接地址',
  `p_describe` VARCHAR(50) NOT NULL COMMENT'权限描述',
  `p_parent` VARCHAR(50) NOT NULL COMMENT'父级权限',
  `p_target` VARCHAR(50) NOT NULL COMMENT'跳转位置',
  `p_position` VARCHAR(50) NOT NULL COMMENT'显示位置',
  PRIMARY KEY (`p_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

SELECT * FROM privilege;
-- -----------------------------

-- 中间表
CREATE TABLE `pr` (
  `r_id`INT(50) NOT NULL,
  `p_id`VARCHAR(50) NOT NULL,
  PRIMARY KEY (`r_id`,`p_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8

SELECT * FROM pr;
 
