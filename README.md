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
### MY SQL
* Use MySQL Workbench and create miaosha schema
* Run the SQL query in tablesDDL.sql

![alt text](https://github.com/yingliu019/ScalableOnlineShopping/blob/master/src/main/resources/static/img/mysqlworkbench.JPG)
### Redis
### RabbitMQ

## A Simple Project Demo 


## TODO
* Nginx for reverse proxy
* JMeter for stress testing. We mainly focused on the qps before and after introducing Redis and RabbitMQ.
