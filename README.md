### 描述

##### 解决问题
  * 多节点服务 hystrix 仪表盘聚集图形展示
  
  ![多节点](./img/1.png)
  
  * 多服务聚集 hystrix 仪表盘合并图形展示
  
  ![多服务](./img/3.jpg)
  
  * 仪表盘说明
  
  ![多服务](./img/2.png)

-----

##### 使用要求

* 在公司统一注册中心中的微服务。

* 接入了Hystrix 组件。

* Hystrix 端口可以访问。


##### 使用说明
* 指定服务名称 规则为：turbine_项目 名称

* 上传服务配置文件到配置中心 配置示例：http://10.10.7.60:20080/zygfengyuwuzu/config-dev/blob/master/turbine-1.yml

* 设置 app-config 为要被聚集的服务名称，多个用 逗号 分割。

* 每个项目部署一个聚合仪表盘，收集整个项目的服务请求信息。

* 打开Hystrix 仪表盘地址 http://servicemoniter.zjs.com.cn/hystrix

* 输入 部署完毕的聚合服务 http://turbine-hostname:port/turbine.stream






