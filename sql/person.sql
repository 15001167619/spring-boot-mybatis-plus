
-- 创建 local_test 数据库
CREATE DATABASE IF NOT EXISTS `local_test` ;
USE `local_test`;


-- 创建  表 local_test.person 结构
CREATE TABLE IF NOT EXISTS `person` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL,
  `balance` DECIMAL(10,2) NULL DEFAULT NULL COMMENT '余额',
  `add_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name` (`name`(250)) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=1000001 DEFAULT CHARSET=latin1;

