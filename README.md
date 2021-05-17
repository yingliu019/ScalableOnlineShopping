# A Scalable Online Shopping System

This repo includes study notes and re-implementation detail from course https://coding.imooc.com/class/chapter/168.html.

The project built a web based online shopping application based on Java(1.8) and Spring Boot(1.5.8.RELEASE). And introducing Redis(3.2) and RabbitMQ(3.7.7) to improve qps from 1306 to 2114 with 5000 Threads and 10 Loop Count.

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
Install Redis and changed your connection setting in src\main\resources, here are mine:
```
#redis
redis.host=127.0.0.1
redis.port=6379
```
### RabbitMQ
Installed Erlang(20.3) and RabbitMQ(3.7.7). Changed your connection setting in src\main\resources, here are mine:
```
#rabbitmq
spring.rabbitmq.host=127.0.0.1
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
```
If everything goes well, visit http://localhost:15672/ and log in with username: guest and password: guest

Add miaosha.queue and miaoshatest manually:
![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/rabbitmq.JPG)

### Notes about Redis and RabbitMQ
Installation of these two could be error-prone. I'll add details later, for now please refer official documentation.
To save some debugging time, we can test Redis and RabbitMQ connection on windows PowerShell

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/testconnection.JPG)

### Run Application
Go to src\main\java\com\imooc\miaosha\MainApplication.java and run as java application.

## A Simple Project Demo 
* user register and log in

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/login.JPG)


* view goods list

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/goodslist.JPG)


* view goods detail

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/orderdetail.JPG)


* create order

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/orderdetail.JPG)

## TODO
* Nginx for reverse proxy
* JMeter for stress testing. We mainly focused on the qps before and after introducing Redis and RabbitMQ.
