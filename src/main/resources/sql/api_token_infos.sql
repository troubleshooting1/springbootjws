/*
 Navicat MySQL Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 13/06/2018 11:22:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for api_token_infos
-- ----------------------------
DROP TABLE IF EXISTS `api_token_infos`;
CREATE TABLE `api_token_infos`  (
  `ati_id` int(11) NOT NULL AUTO_INCREMENT,
  `ati_app_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ati_token` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ati_build_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ati_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of api_token_infos
-- ----------------------------
INSERT INTO `api_token_infos` VALUES (1, 'c2R4bWtqX21vYmls', 'eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMlI0Yld0cVgyMXZZbWxzIiwiaWF0IjoxNTI4ODYwMDc4LCJpc3MiOiJPbmxpbmUgWUF1dGggQnVpbGRlciIsImV4cCI6MTUyODg2NzI3OH0.-MbwsAe8rt44A_wNtcas8AoNlo0mcymXC_zOajeKpC4', '1528860078999');

SET FOREIGN_KEY_CHECKS = 1;
