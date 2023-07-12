# README

**项目简介：** LuckyDraw营销平台是优选社区购项目的抽奖扩展模块，采用基于DDD领域驱动设计的架构，旨在满足优选社区购项目对用户的拉新、促活和留存需求。项目运用抽象、分治和DDD知识，拆分服务边界，凝练领域服务。核心职责围绕抽奖服务的规则引擎、活动配置、抽奖策略和奖品发放等领域展开。通过独立开发各类领域服务，实现领域分层，提升后期的维护性和扩展性。

**核心技术：** SpringBoot、Mybatis、Dubbo、MQ、Redis、Mysql、ELK、分库分表、xxl-job、docker。

**项目架构：** DDD领域驱动设计、充血模型、设计模式（策略、组合、模板、工厂、状态）。

**项目流程：**

![img.jpg](doc/assets/img/Lottery抽奖活动全流程.jpg)

使用方式：

- 克隆或下载这个仓库到你的本地计算机：`git@github.com:Weiguanghao918/Lottery.git`。
- 首先下载相关依赖，引入分库分表路由组件[db-router-spring-boot-starter](https://github.com/Weiguanghao918/db-router-spring-boot-starter)
- 部署涉及的环境Kafka、nacos、xxl-job-admin、mysql、zookeeper、Redis、portainer、ES等。
- 数据库导入[sql](doc/assets/sql)文件。
- 在[lottery-interfaces](lottery-interfaces)的yml文件中修改自己的相关配置。
- 启动服务([lottery-interfaces](lottery-interfaces))的主启动类。

