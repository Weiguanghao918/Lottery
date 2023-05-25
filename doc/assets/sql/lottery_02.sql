/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : localhost:3306
 Source Schema         : lottery_02

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 04/10/2021 08:43:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_strategy_export_000
-- ----------------------------
DROP TABLE IF EXISTS `user_strategy_export_000`;
CREATE TABLE `user_strategy_export_000` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `u_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户ID',
  `activity_id` bigint(20) DEFAULT NULL COMMENT '活动ID',
  `order_id` bigint(32) DEFAULT NULL COMMENT '订单ID',
  `strategy_id` bigint(20) DEFAULT NULL COMMENT '策略ID',
  `strategy_mode` tinyint(2) DEFAULT NULL COMMENT '策略方式（1:单项概率、2:总体概率）',
  `grant_type` tinyint(2) DEFAULT NULL COMMENT '发放奖品方式（1:即时、2:定时[含活动结束]、3:人工）',
  `grant_date` datetime DEFAULT NULL COMMENT '发奖时间',
  `grant_state` int(11) DEFAULT NULL COMMENT '发奖状态',
  `award_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '发奖ID',
  `award_type` tinyint(2) DEFAULT NULL COMMENT '奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）',
  `award_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '奖品名称',
  `award_content` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '奖品内容「文字描述、Key、码」',
  `uuid` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '防重ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_uuid` (`uuid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='用户策略计算结果表';

-- ----------------------------
-- Records of user_strategy_export_000
-- ----------------------------
BEGIN;
INSERT INTO `user_strategy_export_000` VALUES (1, 'fustack', 100001, 1444540456057864192, 10001, 2, 1, NULL, 0, '3', 1, 'ipad', 'Code', '1444540456057864192', '2021-10-03 13:50:57', '2021-10-03 13:50:57');
INSERT INTO `user_strategy_export_000` VALUES (2, 'fustack', 100001, 1444541565086367744, 10001, 2, 1, NULL, 0, '5', 1, 'Book', 'Code', '1444541565086367744', '2021-10-03 13:55:22', '2021-10-03 13:55:22');
INSERT INTO `user_strategy_export_000` VALUES (3, 'fustack', 100001, 1444810184030633984, 10001, 2, 1, NULL, 0, '4', 1, 'AirPods', 'Code', '1444810184030633984', '2021-10-04 07:42:45', '2021-10-04 07:42:45');
INSERT INTO `user_strategy_export_000` VALUES (4, 'fustack', 100001, 1444820311156670464, 10001, 2, 1, NULL, 0, '2', 1, 'iphone', 'Code', '1444820311156670464', '2021-10-04 08:23:00', '2021-10-04 08:23:00');
COMMIT;

-- ----------------------------
-- Table structure for user_strategy_export_001
-- ----------------------------
DROP TABLE IF EXISTS `user_strategy_export_001`;
CREATE TABLE `user_strategy_export_001` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `u_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户ID',
  `activity_id` bigint(20) DEFAULT NULL COMMENT '活动ID',
  `order_id` bigint(32) DEFAULT NULL COMMENT '订单ID',
  `strategy_id` bigint(20) DEFAULT NULL COMMENT '策略ID',
  `strategy_mode` tinyint(2) DEFAULT NULL COMMENT '策略方式（1:单项概率、2:总体概率）',
  `grant_type` tinyint(2) DEFAULT NULL COMMENT '发放奖品方式（1:即时、2:定时[含活动结束]、3:人工）',
  `grant_date` datetime DEFAULT NULL COMMENT '发奖时间',
  `grant_state` int(11) DEFAULT NULL COMMENT '发奖状态',
  `award_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '发奖ID',
  `award_type` tinyint(2) DEFAULT NULL COMMENT '奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）',
  `award_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '奖品名称',
  `award_content` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '奖品内容「文字描述、Key、码」',
  `uuid` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '防重ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_uuid` (`uuid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户策略计算结果表';

-- ----------------------------
-- Records of user_strategy_export_001
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user_strategy_export_002
-- ----------------------------
DROP TABLE IF EXISTS `user_strategy_export_002`;
CREATE TABLE `user_strategy_export_002` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `u_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户ID',
  `activity_id` bigint(20) DEFAULT NULL COMMENT '活动ID',
  `order_id` bigint(32) DEFAULT NULL COMMENT '订单ID',
  `strategy_id` bigint(20) DEFAULT NULL COMMENT '策略ID',
  `strategy_mode` tinyint(2) DEFAULT NULL COMMENT '策略方式（1:单项概率、2:总体概率）',
  `grant_type` tinyint(2) DEFAULT NULL COMMENT '发放奖品方式（1:即时、2:定时[含活动结束]、3:人工）',
  `grant_date` datetime DEFAULT NULL COMMENT '发奖时间',
  `grant_state` int(11) DEFAULT NULL COMMENT '发奖状态',
  `award_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '发奖ID',
  `award_type` tinyint(2) DEFAULT NULL COMMENT '奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）',
  `award_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '奖品名称',
  `award_content` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '奖品内容「文字描述、Key、码」',
  `uuid` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '防重ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_uuid` (`uuid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户策略计算结果表';

-- ----------------------------
-- Records of user_strategy_export_002
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user_strategy_export_003
-- ----------------------------
DROP TABLE IF EXISTS `user_strategy_export_003`;
CREATE TABLE `user_strategy_export_003` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `u_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户ID',
  `activity_id` bigint(20) DEFAULT NULL COMMENT '活动ID',
  `order_id` bigint(32) DEFAULT NULL COMMENT '订单ID',
  `strategy_id` bigint(20) DEFAULT NULL COMMENT '策略ID',
  `strategy_mode` tinyint(2) DEFAULT NULL COMMENT '策略方式（1:单项概率、2:总体概率）',
  `grant_type` tinyint(2) DEFAULT NULL COMMENT '发放奖品方式（1:即时、2:定时[含活动结束]、3:人工）',
  `grant_date` datetime DEFAULT NULL COMMENT '发奖时间',
  `grant_state` int(11) DEFAULT NULL COMMENT '发奖状态',
  `award_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '发奖ID',
  `award_type` tinyint(2) DEFAULT NULL COMMENT '奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）',
  `award_name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '奖品名称',
  `award_content` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '奖品内容「文字描述、Key、码」',
  `uuid` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '防重ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_uuid` (`uuid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户策略计算结果表';

-- ----------------------------
-- Records of user_strategy_export_003
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for user_take_activity
-- ----------------------------
DROP TABLE IF EXISTS `user_take_activity`;
CREATE TABLE `user_take_activity` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `u_id` varchar(32) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户ID',
  `take_id` bigint(20) DEFAULT NULL COMMENT '活动领取ID',
  `activity_id` bigint(20) DEFAULT NULL COMMENT '活动ID',
  `activity_name` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '活动名称',
  `take_date` datetime DEFAULT NULL COMMENT '活动领取时间',
  `take_count` int(11) DEFAULT NULL COMMENT '领取次数',
  `strategy_id` int(11) DEFAULT NULL COMMENT '抽奖策略ID',
  `state` tinyint(2) DEFAULT NULL COMMENT '活动单使用状态 0未使用、1已使用',
  `uuid` varchar(128) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '防重ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_uuid` (`uuid`) USING BTREE COMMENT '防重ID'
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户参与活动记录表';

-- ----------------------------
-- Records of user_take_activity
-- ----------------------------
BEGIN;
INSERT INTO `user_take_activity` VALUES (4, 'fustack', 1444537120189480960, 100001, '???', '2021-10-03 13:37:33', 1, 10001, 1, 'fustack_100001_1', '2021-10-03 13:37:42', '2021-10-03 13:37:42');
INSERT INTO `user_take_activity` VALUES (6, 'fustack', 1444539043961536512, 100001, '???', '2021-10-03 13:45:18', 2, 10001, 1, 'fustack_100001_2', '2021-10-03 13:45:37', '2021-10-03 13:45:37');
INSERT INTO `user_take_activity` VALUES (7, 'fustack', 1444540455500021760, 100001, '???', '2021-10-03 13:50:57', 3, 10001, 1, 'fustack_100001_3', '2021-10-03 13:50:57', '2021-10-03 13:50:57');
INSERT INTO `user_take_activity` VALUES (8, 'fustack', 1444541564645965824, 100001, '???', '2021-10-03 13:55:22', 4, 10001, 1, 'fustack_100001_4', '2021-10-03 13:55:21', '2021-10-03 13:55:21');
INSERT INTO `user_take_activity` VALUES (9, 'fustack', 1444820310565273600, 100001, '???', '2021-10-04 08:23:00', 5, 10001, 1, 'fustack_100001_5', '2021-10-04 08:23:00', '2021-10-04 08:23:00');
COMMIT;

-- ----------------------------
-- Table structure for user_take_activity_count
-- ----------------------------
DROP TABLE IF EXISTS `user_take_activity_count`;
CREATE TABLE `user_take_activity_count` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `u_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户ID',
  `activity_id` bigint(20) DEFAULT NULL COMMENT '活动ID',
  `total_count` int(11) DEFAULT NULL COMMENT '可领取次数',
  `left_count` int(11) DEFAULT NULL COMMENT '已领取次数',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_uId_activityId` (`u_id`,`activity_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户活动参与次数表';

-- ----------------------------
-- Records of user_take_activity_count
-- ----------------------------
BEGIN;
INSERT INTO `user_take_activity_count` VALUES (1, 'fustack', 100001, 10, 5, '2021-10-03 13:37:42', '2021-10-03 13:37:42');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
