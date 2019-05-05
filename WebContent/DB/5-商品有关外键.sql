

USE PhoneShopSSM

-- alter table 从表 
-- add constraint 自己建的外键名 
-- foreign key (从表里的外键字段) 
-- references 主表(映射主表中的主键字段);

-- 订单表添加外键
ALTER TABLE orders
ADD CONSTRAINT f_o_1
FOREIGN KEY (uid)
REFERENCES USER(uid);

-- 订单详情表添加外键
ALTER TABLE ordersdetail
ADD CONSTRAINT f_od_1
FOREIGN KEY (oid)
references orders(oid);

alter table ordersdetail
add constraint f_od_2
foreign key (gid)
references goods(gid);

-- 购物车表添加外键,关联用户
alter table car
add constraint f_c_2
foreign key (uid)
references user(uid);
