/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : auctionsystem

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 14/03/2021 20:08:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for as_bidding_record
-- ----------------------------
DROP TABLE IF EXISTS `as_bidding_record`;
CREATE TABLE `as_bidding_record`  (
  `record_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '竞价记录id',
  `record_user_id` int(0) NOT NULL COMMENT '竞价用户id',
  `record_goods_id` int(0) NOT NULL COMMENT '竞价商品id',
  `record_bidding_price` double(10, 2) NOT NULL DEFAULT 0.00 COMMENT '竞价后价格',
  `record_bidding_time` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '竞拍时间',
  `record_user_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '竞价人姓名',
  `record_is_win_bid` int(0) NULL DEFAULT 0 COMMENT '是否中标 0 未中标 1已中标',
  `record_goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '竞拍商品',
  PRIMARY KEY (`record_id`) USING BTREE,
  INDEX `record_user_name`(`record_user_name`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of as_bidding_record
-- ----------------------------
INSERT INTO `as_bidding_record` VALUES (1, 1, 7, 800.00, '2021-02-18 06:16:33', 'ranxu', 0, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (2, 1, 7, 900.00, '2021-02-18 06:16:33', 'ranxu', 1, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (3, 2, 7, 600.00, '2021-02-18 06:16:33', '史提文斯', 1, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (4, 2, 1, 1320.00, '2021-03-09 20:33:45', '史提文斯', 1, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (5, 2, 1, 1800.00, '2021-03-09 20:33:54', '史提文斯', 1, '第一条');
INSERT INTO `as_bidding_record` VALUES (6, 2, 7, 1500.00, '2021-03-09 20:44:17', '史提文斯', 0, '第一条');
INSERT INTO `as_bidding_record` VALUES (7, 2, 2, 800.00, '2021-03-09 20:45:58', '史提文斯', 0, '第一条');
INSERT INTO `as_bidding_record` VALUES (8, 2, 2, 1200.00, '2021-03-09 21:00:17', '史提文斯', 0, '第一条');
INSERT INTO `as_bidding_record` VALUES (9, 2, 19, 800.00, '2021-03-09 21:01:54', '史提文斯', 0, '国家级助理工艺美术师马燕《花鸟》');
INSERT INTO `as_bidding_record` VALUES (10, 2, 1, 2500.00, '2021-03-09 21:02:37', '史提文斯', 0, '国家级助理工艺美术师马燕《花鸟》');
INSERT INTO `as_bidding_record` VALUES (11, 2, 1, 2900.00, '2021-03-09 21:03:23', '史提文斯', 0, '国家级助理工艺美术师马燕《花鸟》');
INSERT INTO `as_bidding_record` VALUES (12, 2, 1, 3200.00, '2021-03-09 21:16:37', '史提文斯', 0, '国家级助理工艺美术师马燕《花鸟》');
INSERT INTO `as_bidding_record` VALUES (13, 2, 1, 4800.00, '2021-03-09 21:25:46', '史提文斯', 0, '国家级助理工艺美术师马燕《花鸟》');
INSERT INTO `as_bidding_record` VALUES (14, 2, 2, 1800.00, '2021-03-09 21:26:06', '史提文斯', 0, '国家级助理工艺美术师马燕《花鸟》');
INSERT INTO `as_bidding_record` VALUES (15, 2, 2, 2700.00, '2021-03-09 21:26:58', '史提文斯', 0, '国家级助理工艺美术师马燕《花鸟》');
INSERT INTO `as_bidding_record` VALUES (16, 2, 1, 5800.00, '2021-03-10 11:23:31', '史提文斯', 0, '国家级助理工艺美术师马燕《花鸟》');
INSERT INTO `as_bidding_record` VALUES (17, 2, 5, 800.00, '2021-03-10 14:55:12', '史提文斯', 0, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (18, 2, 2, 3000.00, '2021-03-11 16:45:14', '史提文斯', 0, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (19, 2, 1, 8700.00, '2021-03-11 20:10:58', '史提文斯', 0, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (20, 3, 2, 3500.00, '2021-03-13 13:53:26', '管理员', 0, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (21, 3, 5, 900.00, '2021-03-13 16:04:55', '管理员', 0, '和田玉羊脂玉');
INSERT INTO `as_bidding_record` VALUES (22, 2, 1, 10000.00, '2021-03-13 16:08:58', '史提文斯', 0, '和田玉羊脂玉');

-- ----------------------------
-- Table structure for as_goods
-- ----------------------------
DROP TABLE IF EXISTS `as_goods`;
CREATE TABLE `as_goods`  (
  `goods_id` int(0) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `goods_type` int(0) NULL DEFAULT NULL COMMENT '商品类别',
  `goods_pic` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品图片',
  `goods_detail_pic` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品详情展示图片',
  `goods_start_time` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '竞拍开始时间',
  `goods_end_time` char(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '竞拍结束时间',
  `goods_auction_times` int(0) NULL DEFAULT 0 COMMENT '被竞拍次数',
  `goods_start_price` double NULL DEFAULT NULL COMMENT '初始价格',
  `goods_current_price` double NULL DEFAULT 0 COMMENT '当前价格',
  `goods_state` int(0) NULL DEFAULT 0 COMMENT '商品当前状态，0未出售，1，已出售',
  `goods_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品描述',
  `goods_release_time` datetime(0) NULL DEFAULT NULL COMMENT '商品发布时间',
  `goods_audit` int(0) NOT NULL COMMENT '是否审核 0未审核 1已审核',
  `user_id` int(0) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`goods_id`) USING BTREE,
  INDEX `goods_type`(`goods_type`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 96 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of as_goods
-- ----------------------------
INSERT INTO `as_goods` VALUES (1, '和田玉羊脂玉', 1, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 8, 500, 10000, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', '2021-03-04 13:11:19', 1, 2);
INSERT INTO `as_goods` VALUES (2, '和田玉羊脂玉', 1, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 7, 600, 3500, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', '2021-03-25 13:11:24', 1, 2);
INSERT INTO `as_goods` VALUES (3, '和田玉羊脂玉', 1, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 5, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', '2021-03-18 13:11:27', 1, 2);
INSERT INTO `as_goods` VALUES (4, '和田玉羊脂玉', 1, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 6, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', '2021-03-24 13:11:30', 1, 2);
INSERT INTO `as_goods` VALUES (5, '和田玉羊脂玉', 1, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 10, 600, 900, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', '2021-03-20 13:11:33', 2, 2);
INSERT INTO `as_goods` VALUES (6, '和田玉羊脂玉', 1, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 7, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 1, 2);
INSERT INTO `as_goods` VALUES (7, '第一条', 2, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 577, 600, 1500, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 1, 2);
INSERT INTO `as_goods` VALUES (8, '国家级助理工艺美术师马燕《花鸟》', 2, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 15, 600, 452, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 1, 1);
INSERT INTO `as_goods` VALUES (9, '和田玉羊脂玉', 4, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 66, 500, 500, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 1, 1);
INSERT INTO `as_goods` VALUES (10, '和田玉羊脂玉', 4, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 5, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 1, 1);
INSERT INTO `as_goods` VALUES (11, '和田玉羊脂玉', 4, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 22, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 1);
INSERT INTO `as_goods` VALUES (12, '和田玉羊脂玉', 4, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 24, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 1);
INSERT INTO `as_goods` VALUES (13, '和田玉羊脂玉', 4, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 5, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 1);
INSERT INTO `as_goods` VALUES (14, '和田玉羊脂玉', 4, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 55, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (15, '国家级助理工艺美术师马燕《花鸟》', 2, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 5, 600, 900, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (16, '国家级助理工艺美术师马燕《花鸟》', 2, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 15, 600, 452, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (17, '和田玉羊脂玉', 1, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 58, 500, 500, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (18, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 9, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (19, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 78, 600, 800, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (20, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 6, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (21, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 35, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (22, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 534, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (23, '国家级助理工艺美术师马燕《花鸟》', 2, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 5, 600, 900, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (24, '国家级助理工艺美术师马燕《花鸟》', 2, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 15, 600, 452, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (25, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 857, 500, 500, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (26, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 543, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (27, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 354, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (28, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 21, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (31, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 2, 500, 500, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (45, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 321, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (55, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 321, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (65, '和田玉羊脂玉', 3, NULL, NULL, '2021-02-18 06:16:33', '2021-03-17 06:16:33', 45, 600, 600, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (75, '国家级助理工艺美术师马燕《花鸟》', 2, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 5, 600, 900, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 1, 0);
INSERT INTO `as_goods` VALUES (85, '赶紧给我好吧', 2, NULL, NULL, '2021-02-18 06:16:33', '2021-02-18 06:16:33', 15, 600, 452, 0, '108颗 圆珠 富贵手链 56.00克 新疆润玉福祥', NULL, 0, 0);
INSERT INTO `as_goods` VALUES (86, '冉旭', 2, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, 5000, 600, 1, '沙雕大王', NULL, 1, 2);
INSERT INTO `as_goods` VALUES (87, '石佳炘', 2, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, 5000, 500, 1, '沙雕大王', NULL, 1, 2);
INSERT INTO `as_goods` VALUES (88, '石佳炘', 2, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, 5000, 900, 1, '沙雕大王', NULL, 1, 2);
INSERT INTO `as_goods` VALUES (89, '石佳炘', 2, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, 5000, 933, 1, '沙雕大王', NULL, 0, 2);
INSERT INTO `as_goods` VALUES (90, '石佳炘', 2, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, 5000, 951, 1, '沙雕大王', NULL, 0, 2);
INSERT INTO `as_goods` VALUES (91, '我要发布', 1, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, 900, 0, 0, '我就是要发布', NULL, 0, 2);
INSERT INTO `as_goods` VALUES (92, 'abc', NULL, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, NULL, 0, 0, '2', NULL, 2, 2);
INSERT INTO `as_goods` VALUES (93, '我要发布', 3, NULL, NULL, '1991-12-04 12：54:55', '1991-12-04 12:54:55', 0, 5000, 0, 0, '沙雕大王', NULL, 0, 2);
INSERT INTO `as_goods` VALUES (94, 'aaa', 4, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, 5000, 0, 0, '沙雕大王', NULL, 0, 3);
INSERT INTO `as_goods` VALUES (95, '发布', 2, NULL, NULL, '1991-12-04 12:54:55', '1991-12-04 12:54:55', 0, 100000, 0, 0, '我就是要发布', NULL, 0, 2);

-- ----------------------------
-- Table structure for as_user
-- ----------------------------
DROP TABLE IF EXISTS `as_user`;
CREATE TABLE `as_user`  (
  `user_id` int(0) NOT NULL AUTO_INCREMENT,
  `pic` int(0) NULL DEFAULT 0 COMMENT '头像',
  `user_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `accounts` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `gender` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `birthday` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出生日期',
  `phone_num` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话号码',
  `pwd` char(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录密码',
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收货地址',
  `char_sign` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '这个人很懒，什么都没有写' COMMENT '个性签名',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱\r\n',
  `role` int(0) NULL DEFAULT 1 COMMENT '角色 0 管理员 1 用户',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of as_user
-- ----------------------------
INSERT INTO `as_user` VALUES (1, 0, '冉旭', '15326', '女', '1998-12-04', '15382171587', '1204', '我不管', '这个人很懒，什么都没有写', 'Ranshixu@163.com', 1);
INSERT INTO `as_user` VALUES (2, NULL, '史提文斯', '135@qq.com', '男', '1998-12-04', '15382171503', 'aboutyou', 'fda', 'adffads', 'Ranshixu@163.com', 1);
INSERT INTO `as_user` VALUES (3, 0, '管理员', '15326', '男', '1998-12-04', '15382171503', 'you88119', '要你管', '这个人很懒，什么都没有写', 'Ranshixu@163.com', 0);
INSERT INTO `as_user` VALUES (4, 0, 'ranxu2', '15326', '女', '1998-12-04', '17623035559', '1204', '重庆市酉阳县', '这个人很懒，什么都没有写', '1489455037@qq.com', 1);
INSERT INTO `as_user` VALUES (9, 0, '管理员3', '15326', '男', '1998-12-04', '15382171503', 'you88119', '要你管', '这个人很懒，什么都没有写', 'Ranshixu@163.com', 0);
INSERT INTO `as_user` VALUES (10, 0, 'ranxu4', '15326', '女', '1998-12-04', '17623035559', '1204', '重庆市酉阳县', '这个人很懒，什么都没有写', '1489455037@qq.com', 1);
INSERT INTO `as_user` VALUES (11, 0, '管理员4', '15326', '男', '1998-12-04', '15382171503', 'you88119', '要你管', '这个人很懒，什么都没有写', 'Ranshixu@163.com', 0);
INSERT INTO `as_user` VALUES (12, NULL, '史提文斯4', '135@qq.com', '男', '1998-12-04', '15382171503', 'aboutyou', 'fda', 'adffads', 'Ranshixu@163.com', 1);
INSERT INTO `as_user` VALUES (13, 0, '管理员5', '15326', '男', '1998-12-04', '15382171503', 'you88119', '要你管', '这个人很懒，什么都没有写', 'Ranshixu@163.com', 0);
INSERT INTO `as_user` VALUES (14, 0, 'ranxu5', '15326', '女', '1998-12-04', '17623035559', '1204', '重庆市酉阳县', '这个人很懒，什么都没有写', '1489455037@qq.com', 1);

SET FOREIGN_KEY_CHECKS = 1;
