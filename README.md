# A Scalable Online Shopping System

This repo includes study notes and re-implementation detail from course https://coding.imooc.com/class/chapter/168.html.

Feature implemented so far:
* user register and log in
* view goods list
* view goods detail
* create order

## How to start on local host 
### MY SQL
```
CREATE TABLE `goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(16) DEFAULT NULL,
  `goods_title` varchar(64) DEFAULT NULL,
  `goods_img` varchar(64) DEFAULT NULL,
  `goods_detail` longtext,
  `goods_price` decimal(10,2) DEFAULT '0.00',
  `goods_stock` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4

CREATE TABLE `miaosha_goods` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '秒杀的商品表',
  `goods_id` bigint(20) DEFAULT NULL COMMENT '商品Id',
  `miaosha_price` decimal(10,2) DEFAULT '0.00' COMMENT '秒杀价',
  `stock_count` int(11) DEFAULT NULL COMMENT '库存数量',
  `start_date` datetime DEFAULT NULL COMMENT '秒杀开始时间',
  `end_date` datetime DEFAULT NULL COMMENT '秒杀结束时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4
```
### MY SQL
### Redis
### RabbitMQ
## A Simple Project Demo 


## TODO
* Nginx for reverse proxy
* JMeter for stress testing. We mainly focused on the qps before and after introducing Redis and RabbitMQ.
