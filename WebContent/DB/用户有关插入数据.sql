

USE PhoneShopSSM;

-- 用户表插入数据
INSERT INTO `USER` (`uid`, `upwd`, `uname`, `uphone`, `uaddress`, role_rid) VALUES('111','aaa','张总','15999999999','西安',101);
INSERT INTO `USER` (`uid`, `upwd`, `uname`, `uphone`, `uaddress`, role_rid) VALUES('222','bbb','A商家','13888888888','上海',102);
INSERT INTO `USER` (`uid`, `upwd`, `uname`, `uphone`, `uaddress`, role_rid) VALUES('333','ccc','B商家','13999999999','广州',102);
INSERT INTO `USER` (`uid`, `upwd`, `uname`, `uphone`, `uaddress`, role_rid) VALUES('444','ddd','顾客1','13555555555','西安',103);
INSERT INTO `USER` (`uid`, `upwd`, `uname`, `uphone`, `uaddress`, role_rid) VALUES('555','eee','顾客2','13666666666','咸阳',103);

SELECT * FROM USER
-- delete from user where 1=1;
-- ---------------------------------------

-- 角色表插入数据
INSERT INTO `role` (`r_id`, `r_name`, `r_describe`) VALUES(101,'超级管理员','系统,角色管理,用户管理,商品管理,订单管理,个人信息');
INSERT INTO `role` (`r_id`, `r_name`, `r_describe`) VALUES(102,'商家','系统,商品管理,订单管理,个人信息');
INSERT INTO `role` (`r_id`, `r_name`, `r_describe`) VALUES(103,'顾客','系统,个人信息');

SELECT * FROM role
-- delete from role where 1=1;

-- ---------------------------------------
-- 权限表插入数据
insert into `privilege` (`p_id`, `p_name`, `p_uri`, `p_describe`, `p_parent`, `p_target`, `p_position`) values('p1001','角色管理','ManagerController/findAllRole.action','对角色的操作','0','left','角色管理');
insert into `privilege` (`p_id`, `p_name`, `p_uri`, `p_describe`, `p_parent`, `p_target`, `p_position`) values('p1002','用户管理','ManagerController/findAllUser.action','对用户的操作','0','left','用户管理');
insert into `privilege` (`p_id`, `p_name`, `p_uri`, `p_describe`, `p_parent`, `p_target`, `p_position`) values('p1003','商品管理','ManagerController/findAllGoods.action','对商品的操作','0','left','商品管理');
insert into `privilege` (`p_id`, `p_name`, `p_uri`, `p_describe`, `p_parent`, `p_target`, `p_position`) values('p1004','订单管理','ManagerController/findAllOrdersDetail.action','对订单的操作','0','left','订单管理');
insert into `privilege` (`p_id`, `p_name`, `p_uri`, `p_describe`, `p_parent`, `p_target`, `p_position`) values('p1005','个人信息','UserController/findUserInfo.action','对个人信息的操作','0','left','个人信息管理');

SELECT * FROM privilege
-- delete from privilege where 1=1;

-- ---------------------------------------

-- 中间表插入数据
INSERT INTO `pr` (`r_id`, `p_id`) VALUES(101,'p1001');
INSERT INTO `pr` (`r_id`, `p_id`) VALUES(101,'p1002');
INSERT INTO `pr` (`r_id`, `p_id`) VALUES(101,'p1003');
INSERT INTO `pr` (`r_id`, `p_id`) VALUES(101,'p1004');
INSERT INTO `pr` (`r_id`, `p_id`) VALUES(101,'p1005');

INSERT INTO `pr` (`r_id`, `p_id`) VALUES(102,'p1003');
INSERT INTO `pr` (`r_id`, `p_id`) VALUES(102,'p1004');
INSERT INTO `pr` (`r_id`, `p_id`) VALUES(102,'p1005');

INSERT INTO `pr` (`r_id`, `p_id`) VALUES(103,'p1005');

SELECT * FROM pr
-- delete from pr where 1=1;
