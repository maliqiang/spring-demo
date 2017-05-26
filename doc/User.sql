-- auto Generated on 2017-05-25 16:19:11 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE `user`(
    `user_id` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'userId',
    `user_name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'userName',
    `age` INT (11) NOT NULL DEFAULT -1 COMMENT 'age',
    PRIMARY KEY (`user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`user`';
