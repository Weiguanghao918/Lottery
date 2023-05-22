create database lottery_01;

-- auto-generated definition
create table user_take_activity
(
    id           bigint    null,
    uId          tinytext  null,
    takeId       bigint    null,
    activityId   bigint    null,
    activityName tinytext  null,
    takeDate     timestamp null,
    takeCount    int       null,
    uuid         tinytext  null,
    createTime   timestamp null,
    updateTime   timestamp null
)
    comment '用户参与活动记录表';

-- auto-generated definition
create table user_take_activity_count
(
    id         bigint    null,
    uId        tinytext  null,
    activityId bigint    null,
    totalCount int       null,
    leftCount  int       null,
    createTime timestamp null,
    updateTime timestamp null
)
    comment '用户活动参与次数表';

-- auto-generated definition
create table user_strategy_export_001(id           bigint     null,uId          mediumtext null,activityId   bigint     null,orderId      bigint     null,strategyId   bigint     null,strategyType int        null,grantType    int        null,grantDate    timestamp  null,grantState   int        null,awardId      bigint     null,awardType    int        null,awardName    mediumtext null,awardContent mediumtext null,uuid         mediumtext null,createTime   timestamp  null,updateTime   timestamp  null) comment '用户策略计算结果表';
create table user_strategy_export_002(id           bigint     null,uId          mediumtext null,activityId   bigint     null,orderId      bigint     null,strategyId   bigint     null,strategyType int        null,grantType    int        null,grantDate    timestamp  null,grantState   int        null,awardId      bigint     null,awardType    int        null,awardName    mediumtext null,awardContent mediumtext null,uuid         mediumtext null,createTime   timestamp  null,updateTime   timestamp  null) comment '用户策略计算结果表';
create table user_strategy_export_003(id           bigint     null,uId          mediumtext null,activityId   bigint     null,orderId      bigint     null,strategyId   bigint     null,strategyType int        null,grantType    int        null,grantDate    timestamp  null,grantState   int        null,awardId      bigint     null,awardType    int        null,awardName    mediumtext null,awardContent mediumtext null,uuid         mediumtext null,createTime   timestamp  null,updateTime   timestamp  null) comment '用户策略计算结果表';
create table user_strategy_export_004(id           bigint     null,uId          mediumtext null,activityId   bigint     null,orderId      bigint     null,strategyId   bigint     null,strategyType int        null,grantType    int        null,grantDate    timestamp  null,grantState   int        null,awardId      bigint     null,awardType    int        null,awardName    mediumtext null,awardContent mediumtext null,uuid         mediumtext null,createTime   timestamp  null,updateTime   timestamp  null) comment '用户策略计算结果表';

