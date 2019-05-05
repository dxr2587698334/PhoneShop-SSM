
USE PhoneShopSSM

-- 订单表
CREATE TABLE orders(
	oid VARCHAR(50) COMMENT'订单id',
	ototalmoney INT COMMENT'总金额',
	oaddress VARCHAR(50)COMMENT'订单地址',
	otime VARCHAR(20) COMMENT'订单时间',
	ostatus VARCHAR(4) DEFAULT '等待处理' COMMENT'订单状态',
	uid VARCHAR(50) COMMENT'关联的用户id',
	PRIMARY KEY(oid)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

-- drop table orders;
-- ------------------------------------------------

-- 订单详情表
CREATE TABLE ordersdetail(
	odid INT AUTO_INCREMENT COMMENT'订单详情id',
	odnum INT COMMENT'订单数量',
	odmoney INT COMMENT'订单单价',
	odtotalmoney INT COMMENT'订单总额',
	odaddress VARCHAR(50)COMMENT'订单地址',
	odstatus VARCHAR(4)DEFAULT '等待处理' COMMENT'订单状态',
	oid VARCHAR(50) COMMENT'关联的订单id',
	gid INT COMMENT'关联的商品id',
	PRIMARY KEY(odid)
)ENGINE=INNODB DEFAULT CHARSET=utf8 AUTO_INCREMENT=100;

-- drop table ordersdetail;
-- ------------------------------------------------

-- 商品表
CREATE TABLE goods(
	gid INT AUTO_INCREMENT COMMENT'商品id',
	gmoney INT COMMENT'单价',
	gname VARCHAR(20) COMMENT'商品名称',
	gimage VARCHAR(50) COMMENT'商品图片',
	gstatus VARCHAR(20)DEFAULT '正常销售' COMMENT'商品状态',
	PRIMARY KEY(gid)
)ENGINE=INNODB CHARSET=utf8;

-- drop table goods;
-- ------------------------------------------------

-- 购物车表
CREATE TABLE car(
	cid INT AUTO_INCREMENT COMMENT '购物车id',
	cmoney INT COMMENT'单价',
	cnum INT DEFAULT '1' COMMENT'商品数量',
	cname VARCHAR(20) COMMENT'物品名称',
	cimage VARCHAR(50) COMMENT'物品图片',
	cstatus VARCHAR(20)DEFAULT '正常销售' COMMENT'商品状态',
	gid INT COMMENT'关联的商品id',
	uid VARCHAR(50) COMMENT'关联的用户id',
	PRIMARY KEY(cid)
)ENGINE=INNODB CHARSET=utf8 AUTO_INCREMENT=1000;

-- drop table car;
