# SSH_maven
Struts2,Hibernate,Spring三大框架的整合总是很麻烦，在此提供一个已经整合好三大框架的包，可以直接下载导入Myeclipse使用，项目基于Maven做依赖管理。

其中包含的内容如下：
  
1.Struts2.3.16.3,Hibernate4.3.5,Spring4.0.4三大框架的整合；

2.前端框架集成了Bootstrap3.3.5，Jquery1.12.3,集成了Bootstrap插件Bootgrid数据表格实现分页，使用Bootstrap的datetimepicker插件实现日期时间选择；

3.数据库使用Mysql中自带的的sakila数据库，使用前，请将MySSH/WebRoot/WEB-INF中的applicationContext.xml中的数据库密码设置为自己的；

4.实现了sakila中的单表的增删改查和跨表查询，跨表查询包括了hibernate的1-N和1-1双向映射；

5.集成了作业自动调度框架Quartz 2.2.2实现作业调度；

6.json插件使用Struts2自带的json插件；

7.包含了一个文件上传的功能和数据表导出为Excel下载的功能，使用POI实现；

8.包含了带验证码的登录功能以及登录验证的拦截器；

9.整个包可直接导入Myeclipse继续编辑，war文件可直接放入tomcat部署。

10.非maven版本参见https://github.com/shenzhanwang/MySSH

效果图：
 ![alt text](https://github.com/shenzhanwang/MySSH/blob/master/%E6%95%88%E6%9E%9C%E5%9B%BE.png)
