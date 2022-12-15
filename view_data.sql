/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50737
 Source Host           : localhost:3306
 Source Schema         : view_data

 Target Server Type    : MySQL
 Target Server Version : 50737
 File Encoding         : 65001

 Date: 15/12/2022 14:36:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `country` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国家名称',
  `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省份',
  `patient_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '患者姓名',
  `patient_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '或者类型（1有症状2无症状）',
  `patient_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '患者状态（0疑似1确诊2治愈3重症4死亡）',
  `create_datetime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `suretime` datetime NULL DEFAULT NULL COMMENT '确诊时间',
  `hardtime` datetime NULL DEFAULT NULL COMMENT '重症时间',
  `curetime` datetime NULL DEFAULT NULL COMMENT '治愈时间',
  `dietime` datetime NULL DEFAULT NULL COMMENT '死亡时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES (1, '中国', '安徽省', '张三', '1', '3', '2020-01-23 00:00:00', '2020-01-23 03:03:00', NULL, '2020-02-10 00:00:00', NULL);
INSERT INTO `patient` VALUES (2, '中国', '安徽省', '李四', '2', '3', '2020-01-23 00:00:00', '2020-01-23 00:24:00', NULL, '2020-02-11 00:00:00', NULL);
INSERT INTO `patient` VALUES (3, '中国', '安徽省', '王五', '1', '3', '2020-01-23 00:00:00', '2020-01-23 00:00:00', NULL, '2020-02-12 00:00:00', NULL);
INSERT INTO `patient` VALUES (4, '中国', '安徽省', '赵六', '2', '3', '2020-01-26 00:00:00', '2020-01-26 00:00:00', NULL, '2020-02-13 00:00:00', NULL);
INSERT INTO `patient` VALUES (5, '中国', '安徽省', '花花', '2', '4', '2020-01-28 00:00:00', '2020-01-28 00:00:00', '2020-02-01 00:00:00', NULL, '2020-02-08 00:00:00');
INSERT INTO `patient` VALUES (6, '中国', '安徽省', '丽丽', '2', '4', '2020-01-28 00:00:00', '2020-01-28 00:00:00', '2020-02-02 00:00:00', NULL, '2020-02-10 00:00:00');
INSERT INTO `patient` VALUES (7, '中国', '贵州省', '赵华', '1', '3', '2020-01-29 00:00:00', '2020-01-29 00:00:00', NULL, '2020-02-11 00:00:00', NULL);
INSERT INTO `patient` VALUES (8, '中国', '安徽省', '钱琪', '1', '3', '2020-01-30 00:00:00', '2020-01-30 00:00:00', NULL, '2020-02-20 00:00:00', NULL);
INSERT INTO `patient` VALUES (9, '中国', '安徽省', '孙八', '2', '3', '2020-01-31 00:00:00', '2020-01-31 00:00:00', NULL, '2020-02-23 00:00:00', NULL);
INSERT INTO `patient` VALUES (10, '中国', '安徽省', '李雷', '1', '4', '2020-02-01 00:00:00', '2020-02-01 00:00:00', NULL, NULL, '2020-02-08 00:00:00');
INSERT INTO `patient` VALUES (11, '中国', '山西省', '小明', '2', '4', '2020-02-02 00:00:00', '2020-02-02 00:00:00', NULL, NULL, '2020-02-09 00:00:00');
INSERT INTO `patient` VALUES (12, '中国', '河北省', '李九', '1', '3', '2020-02-03 00:00:00', '2020-03-18 00:00:00', NULL, NULL, NULL);
INSERT INTO `patient` VALUES (15, '成都', '四川', 'yyy', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `patient` VALUES (16, '成都', '四川', 'yyy', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for provinceofchina
-- ----------------------------
DROP TABLE IF EXISTS `provinceofchina`;
CREATE TABLE `provinceofchina`  (
  `id` int(11) NOT NULL,
  `province` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省份',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省份名称',
  `confirm` int(11) NOT NULL COMMENT '累计确诊',
  `nowConfirm` int(11) NULL DEFAULT NULL COMMENT '现有确诊',
  `suspect` int(11) NULL DEFAULT NULL,
  `dead` int(11) NULL DEFAULT NULL COMMENT '死亡',
  `heal` int(11) NULL DEFAULT NULL COMMENT '治愈',
  `deadRate` float NOT NULL COMMENT '死亡率',
  `healRate` float NULL DEFAULT NULL COMMENT '治愈率',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of provinceofchina
-- ----------------------------
INSERT INTO `provinceofchina` VALUES (0, 'taiwan', '台湾', 4917, 3755, 0, 29, 1133, 0.59, 23.04);
INSERT INTO `provinceofchina` VALUES (1, 'xianggang', '香港', 11833, 67, 0, 210, 11556, 1.77, 97.66);
INSERT INTO `provinceofchina` VALUES (2, 'shanghai', '上海', 2069, 66, 0, 7, 1996, 0.34, 96.47);
INSERT INTO `provinceofchina` VALUES (3, 'guangdong', '广东', 2412, 45, 0, 8, 2359, 0.33, 97.8);
INSERT INTO `provinceofchina` VALUES (4, 'zhejiang', '浙江', 1362, 38, 0, 1, 1323, 0.07, 97.14);
INSERT INTO `provinceofchina` VALUES (5, 'sichuan', '四川', 1015, 33, 0, 3, 979, 0.3, 96.45);
INSERT INTO `provinceofchina` VALUES (6, 'fujian', '福建', 613, 27, 0, 1, 585, 0.16, 95.43);
INSERT INTO `provinceofchina` VALUES (7, 'yunnan', '云南', 352, 23, 0, 2, 327, 0.57, 92.9);
INSERT INTO `provinceofchina` VALUES (8, 'shanxi', '陕西', 611, 16, 0, 3, 592, 0.49, 96.89);
INSERT INTO `provinceofchina` VALUES (9, 'liaoning', '辽宁', 425, 15, 0, 2, 408, 0.47, 96);
INSERT INTO `provinceofchina` VALUES (10, 'jiangsu', '江苏', 723, 10, 0, 0, 713, 0, 98.62);
INSERT INTO `provinceofchina` VALUES (11, 'tianjin', '天津', 391, 9, 0, 3, 379, 0.77, 96.93);
INSERT INTO `provinceofchina` VALUES (12, 'anhui', '安徽', 1002, 7, 0, 6, 989, 0.6, 98.7);
INSERT INTO `provinceofchina` VALUES (13, 'hunan', '湖南', 1050, 7, 0, 4, 1039, 0.38, 98.95);
INSERT INTO `provinceofchina` VALUES (14, 'hainan', '海南', 188, 6, 0, 6, 176, 3.19, 93.62);
INSERT INTO `provinceofchina` VALUES (15, 'chongqing', '重庆', 598, 6, 0, 6, 586, 1, 97.99);
INSERT INTO `provinceofchina` VALUES (16, 'guangxi', '广西', 275, 6, 0, 2, 267, 0.73, 97.09);
INSERT INTO `provinceofchina` VALUES (17, 'shanxi', '山西', 251, 4, 0, 0, 247, 0, 98.41);
INSERT INTO `provinceofchina` VALUES (18, 'shandong', '山东', 883, 4, 0, 7, 872, 0.79, 98.75);
INSERT INTO `provinceofchina` VALUES (19, 'henan', '河南', 1314, 3, 0, 22, 1289, 1.67, 98.1);
INSERT INTO `provinceofchina` VALUES (20, 'neimenggu', '内蒙古', 385, 3, 0, 1, 381, 0.26, 98.96);
INSERT INTO `provinceofchina` VALUES (21, 'beijing', '北京市', 1058, 3, 0, 9, 1046, 0.85, 98.87);
INSERT INTO `provinceofchina` VALUES (22, 'heilongjiang', '黑龙江', 1612, 2, 0, 13, 1597, 0.81, 99.07);
INSERT INTO `provinceofchina` VALUES (23, 'hubei', '湖北', 68159, 2, 0, 4512, 63645, 6.62, 93.38);
INSERT INTO `provinceofchina` VALUES (24, 'aomen', '澳门', 50, 1, 0, 0, 49, 0, 98);
INSERT INTO `provinceofchina` VALUES (25, 'ningxia', '宁夏', 76, 1, 0, 0, 75, 0, 98.68);
INSERT INTO `provinceofchina` VALUES (26, 'gansu', '甘肃', 194, 1, 0, 2, 191, 1.03, 98.45);
INSERT INTO `provinceofchina` VALUES (27, 'xinjiang', '新疆', 980, 0, 0, 3, 977, 0.31, 99.69);
INSERT INTO `provinceofchina` VALUES (28, 'xizang', '西藏', 1, 0, 0, 0, 1, 0, 100);
INSERT INTO `provinceofchina` VALUES (29, 'guizhou', '贵州', 147, 0, 0, 2, 145, 1.36, 98.64);
INSERT INTO `provinceofchina` VALUES (30, 'jiangxi', '江西', 937, 0, 0, 1, 936, 0.11, 99.89);
INSERT INTO `provinceofchina` VALUES (31, 'qinghai', '青海', 18, 0, 0, 0, 18, 0, 100);
INSERT INTO `provinceofchina` VALUES (32, 'jilin', '吉林', 573, 0, 0, 3, 570, 0.52, 99.48);
INSERT INTO `provinceofchina` VALUES (33, 'hebei', '河北', 1317, 0, 0, 7, 1310, 0.53, 99.47);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zero', 'mixin6879', 'qianmeng6879@163.com', 21);
INSERT INTO `user` VALUES (2, 'zhangsan', 'mixin6879', 'zhangsan@163.com', 20);
INSERT INTO `user` VALUES (3, 'admin', '123456', 'admin@qq.com', 0);
INSERT INTO `user` VALUES (4, 'test', 'adfqwe', 'test@qq.com', 0);
INSERT INTO `user` VALUES (6, 'wangwu', 'wangwu', 'wangwu', 0);
INSERT INTO `user` VALUES (7, 't1', '123456', 't1@qq.com', 0);
INSERT INTO `user` VALUES (10, 'lisi', 'lisi', 'lisi@qq.com', 0);
INSERT INTO `user` VALUES (11, 'sdfsdf', '123', '345@qq.com', 0);

-- ----------------------------
-- Table structure for user_visit
-- ----------------------------
DROP TABLE IF EXISTS `user_visit`;
CREATE TABLE `user_visit`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ip_addr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_id` int(255) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 240 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_visit
-- ----------------------------
INSERT INTO `user_visit` VALUES (206, '0:0:0:0:0:0:0:1', 1, 'zero', '2022-12-15 09:28:55');
INSERT INTO `user_visit` VALUES (207, '0:0:0:0:0:0:0:1', 1, 'zero', '2022-12-15 09:30:50');
INSERT INTO `user_visit` VALUES (208, '0:0:0:0:0:0:0:1', 1, 'zero', '2022-12-15 09:30:58');
INSERT INTO `user_visit` VALUES (209, '0:0:0:0:0:0:0:1', 1, 'zero', '2022-12-15 09:31:54');
INSERT INTO `user_visit` VALUES (210, '127.0.0.1', 1, 'zero', '2022-12-15 13:31:44');
INSERT INTO `user_visit` VALUES (211, '127.0.0.1', 1, 'zero', '2022-12-15 13:33:01');
INSERT INTO `user_visit` VALUES (212, '127.0.0.1', 1, 'zero', '2022-12-15 13:33:10');
INSERT INTO `user_visit` VALUES (213, '127.0.0.1', 1, 'zero', '2022-12-15 13:34:20');
INSERT INTO `user_visit` VALUES (214, '127.0.0.1', 1, 'zero', '2022-12-15 13:35:21');
INSERT INTO `user_visit` VALUES (215, '127.0.0.1', 1, 'zero', '2022-12-15 13:35:46');
INSERT INTO `user_visit` VALUES (216, '127.0.0.1', 1, 'zero', '2022-12-15 13:36:29');
INSERT INTO `user_visit` VALUES (217, '127.0.0.1', 1, 'zero', '2022-12-15 13:38:04');
INSERT INTO `user_visit` VALUES (218, '192.168.31.201', 1, 'zero', '2022-12-15 13:42:55');
INSERT INTO `user_visit` VALUES (219, '192.168.31.201', 1, 'zero', '2022-12-15 13:43:13');
INSERT INTO `user_visit` VALUES (220, '192.168.31.1', 1, 'zero', '2022-12-15 13:44:25');
INSERT INTO `user_visit` VALUES (221, '192.168.31.1', 1, 'zero', '2022-12-15 13:45:16');
INSERT INTO `user_visit` VALUES (222, '192.168.31.1', 1, 'zero', '2022-12-15 13:50:26');
INSERT INTO `user_visit` VALUES (223, '192.168.31.1', 1, 'zero', '2022-12-15 13:58:51');
INSERT INTO `user_visit` VALUES (224, '192.168.31.1', 1, 'zero', '2022-12-15 13:59:29');
INSERT INTO `user_visit` VALUES (225, '192.168.31.1', 2, 'zhangsan', '2022-12-15 14:03:35');
INSERT INTO `user_visit` VALUES (226, '192.168.31.1', 1, 'zero', '2022-12-15 14:06:01');
INSERT INTO `user_visit` VALUES (227, '192.168.31.1', 2, 'zhangsan', '2022-12-15 14:06:14');
INSERT INTO `user_visit` VALUES (228, '192.168.31.1', 1, 'zero', '2022-12-15 14:06:29');
INSERT INTO `user_visit` VALUES (229, '192.168.31.1', 1, 'zero', '2022-12-15 14:08:27');
INSERT INTO `user_visit` VALUES (230, '192.168.31.1', 2, 'zhangsan', '2022-12-15 14:08:49');
INSERT INTO `user_visit` VALUES (231, '192.168.31.1', 1, 'zero', '2022-12-15 14:12:43');
INSERT INTO `user_visit` VALUES (232, '192.168.31.1', 6, 'wangwu', '2022-12-15 14:12:58');
INSERT INTO `user_visit` VALUES (233, '192.168.31.1', 7, 't1', '2022-12-15 14:15:13');
INSERT INTO `user_visit` VALUES (234, '192.168.31.1', 8, 'zero1', '2022-12-15 14:15:48');
INSERT INTO `user_visit` VALUES (235, '192.168.31.1', 1, 'zero', '2022-12-15 14:18:39');
INSERT INTO `user_visit` VALUES (236, '192.168.31.1', 10, 'lisi', '2022-12-15 14:23:07');
INSERT INTO `user_visit` VALUES (237, '172.31.133.10', 11, 'sdfsdf', '2022-12-15 14:27:03');
INSERT INTO `user_visit` VALUES (238, '192.168.31.1', 1, 'zero', '2022-12-15 14:29:04');
INSERT INTO `user_visit` VALUES (239, '192.168.31.1', 1, 'zero', '2022-12-15 14:32:46');

-- ----------------------------
-- Table structure for visit
-- ----------------------------
DROP TABLE IF EXISTS `visit`;
CREATE TABLE `visit`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) NULL DEFAULT NULL,
  `ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of visit
-- ----------------------------
INSERT INTO `visit` VALUES (2, 101, '192.168.1.10');
INSERT INTO `visit` VALUES (6, 38, '127.0.0.1');

SET FOREIGN_KEY_CHECKS = 1;
