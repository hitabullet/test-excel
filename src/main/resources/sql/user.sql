/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 31/12/2020 10:24:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `ID` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `NAME` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `SEX` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `AGE` int(0) NULL DEFAULT NULL,
  `CREATE_TIME` timestamp(0) NULL DEFAULT NULL,
  `STATUS` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('17318ad2735e4ee19db1ddd956aeb84f', '小周', '1', 20, '2021-01-04 01:00:47', 0);
INSERT INTO `user` VALUES ('5caeba2c190240189e672551e68fc11a', '小容', '0', 18, '2021-01-05 02:00:16', 1);
INSERT INTO `user` VALUES ('7e89e14ba3aa4c3ebe2bae16e0e625c2', '小容', '0', 18, '2021-01-04 01:00:55', 1);
INSERT INTO `user` VALUES ('d8bcf0645bb6451787ea0e408e1a5965', '小容', '0', 18, '2021-01-01 01:00:18', 1);
INSERT INTO `user` VALUES ('dbb78b5fb4f44d4d828d03961f2a21b7', '小周', '1', 20, '2021-01-04 01:00:55', 0);
INSERT INTO `user` VALUES ('dfdbefae9621486f859c81597074270e', '小容', '0', 18, '2021-01-04 01:00:47', 1);
INSERT INTO `user` VALUES ('e4a286ca3e4244fab2cfaaff532570da', '小周', '1', 20, '2021-01-01 01:00:18', 0);
INSERT INTO `user` VALUES ('ed1fee1e6faa4de99c8a95fb493164d8', '小周', '1', 20, '2021-01-05 02:00:16', 0);

SET FOREIGN_KEY_CHECKS = 1;
