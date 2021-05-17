# A Scalable Online Shopping System

This repo includes study notes and re-implementation detail from course https://coding.imooc.com/class/chapter/168.html.

Feature implemented so far:
* user register and log in
* view goods list
* view goods detail
* create order

## How to start on local host 
The notes below shows how I started my instance on windows 10 machine. Please feel free to choose any tool you like!
### pom.xml
* git clone this repo
* Open IntelliJ and import project from existing source (choose the directory of pom.xml)

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/intellij.JPG)

### MY SQL
* Use MySQL Workbench and create miaosha schema
* Run the SQL query in tablesDDL.sql
After running DDL, you can see:

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/mysqlworkbench.JPG)

Changed your connection setting in src\main\resources, here are mine:
```
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/miaosha?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false
```
### Redis
Changed your connection setting in src\main\resources, here are mine:
```
#redis
redis.host=127.0.0.1
redis.port=6379
```
### RabbitMQ
Changed your connection setting in src\main\resources, here are mine:
```
#rabbitmq
spring.rabbitmq.host=127.0.0.1
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
```
To save some debugging time, we can test Redis and RabbitMQ connection on windows power shell

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/testconnection.JPG)

## A Simple Project Demo 


## TODO
* Nginx for reverse proxy
* JMeter for stress testing. We mainly focused on the qps before and after introducing Redis and RabbitMQ.
