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

 Date: 13/06/2018 11:22:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for api_user_infos
-- ----------------------------
DROP TABLE IF EXISTS `api_user_infos`;
CREATE TABLE `api_user_infos`  (
  `aui_app_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `aui_app_secret` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `aui_status` int(255) NULL DEFAULT NULL,
  `aui_ajax_bind_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `aui_mark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`aui_app_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of api_user_infos
-- ----------------------------
INSERT INTO `api_user_infos` VALUES ('c2R4bWtqX21vYmls', 'mKk7r7IJkc+RVjvPh3M4PG6VIGUlgD7jOo3VwkHJKSOL9Qyd7BW1YInvJX', 0, '127.0.0.1', 'test');

SET FOREIGN_KEY_CHECKS = 1;
