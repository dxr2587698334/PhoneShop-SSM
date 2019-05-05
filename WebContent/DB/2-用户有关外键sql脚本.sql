
USE PhoneShopSSM;

角色权限的外键
-- alter table 从表 
-- add constraint 自己建的外键名 
-- foreign key (从表里的外键字段) 
-- references 主表(映射主表中的主键字段);

-- 给用户表添加外键
ALTER TABLE USER  
ADD CONSTRAINT pk_r_rid 
FOREIGN KEY (role_rid) 
REFERENCES role(r_id);

-- 给中间表表添加外键,关联角色表
ALTER TABLE pr 
ADD CONSTRAINT pk_pr_rid 
FOREIGN KEY (r_id) 
REFERENCES role(r_id);

-- 给中间表表添加外键,关联权限表
ALTER TABLE pr 
ADD CONSTRAINT pk_pr_pid 
FOREIGN KEY (p_id) 
REFERENCES privilege(p_id);

