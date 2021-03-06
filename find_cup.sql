/*
 Navicat Premium Data Transfer

 Source Server         : 1
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : find_cup

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 01/03/2021 15:55:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity`  (
  `activity_id` int(0) NOT NULL COMMENT '活动id',
  `activity_name` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '活动名称',
  `activity_address` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '活动地址',
  `activity_participation_MAX` int(0) NULL DEFAULT NULL COMMENT '活动最多参与人数',
  `activity_participation` int(0) NULL DEFAULT NULL COMMENT '活动参与人数',
  `activity_
Registration_Start_Time` datetime(0) NULL DEFAULT NULL COMMENT '活动报名开始时间',
  `activity_
Registration_Deadline` datetime(0) NULL DEFAULT NULL COMMENT '活动报名截至时间',
  `activity_
Start_Time` datetime(0) NULL DEFAULT NULL COMMENT '活动开始时间',
  `activity_Deadline` datetime(0) NULL DEFAULT NULL COMMENT '活动截止时间',
  `activity_credits` int(0) NULL DEFAULT NULL COMMENT '活动学分',
  `activity_resume` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '活动内容',
  PRIMARY KEY (`activity_name`, `activity_id`) USING BTREE,
  INDEX `activity_id`(`activity_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of activity
-- ----------------------------

-- ----------------------------
-- Table structure for community
-- ----------------------------
DROP TABLE IF EXISTS `community`;
CREATE TABLE `community`  (
  `community_id` int(0) NOT NULL COMMENT '社团id',
  `community_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '社团姓名',
  `community
_administrator_id` int(0) NULL DEFAULT NULL COMMENT '社团管理员',
  `community_activity_id` int(0) NULL DEFAULT NULL COMMENT '社团活动',
  `community_member_id` int(0) NULL DEFAULT NULL COMMENT '社团成员',
  `community_creat_time` datetime(0) NULL DEFAULT NULL COMMENT '社团创建时间',
  PRIMARY KEY (`community_name`, `community_id`) USING BTREE,
  INDEX `user_number`(`community_name`, `community
_administrator_id`) USING BTREE,
  INDEX `user_name`(`community_name`) USING BTREE,
  INDEX `user_number_2`(`community_name`, `community
_administrator_id`) USING BTREE,
  INDEX `user_number_3`(`community_name`) USING BTREE,
  INDEX `fk_user_c`(`community_activity_id`) USING BTREE,
  INDEX `community_id`(`community_id`) USING BTREE,
  INDEX `fk_c_u`(`community_member_id`) USING BTREE,
  INDEX `fk_c_u_A`(`community
_administrator_id`) USING BTREE,
  CONSTRAINT `fk_c_a` FOREIGN KEY (`community_activity_id`) REFERENCES `activity` (`activity_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_c_u` FOREIGN KEY (`community_member_id`) REFERENCES `user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of community
-- ----------------------------

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information`  (
  `user_id` int(0) NULL DEFAULT NULL,
  `community_id` int(0) NULL DEFAULT NULL,
  `activity_id` int(0) NULL DEFAULT NULL,
  INDEX `fk_u_id`(`user_id`) USING BTREE,
  INDEX `fk_a_id`(`activity_id`) USING BTREE,
  INDEX `fk_c_id`(`community_id`) USING BTREE,
  CONSTRAINT `fk_u_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_a_id` FOREIGN KEY (`activity_id`) REFERENCES `activity` (`activity_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_c_id` FOREIGN KEY (`community_id`) REFERENCES `community` (`community_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of information
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(0) NOT NULL COMMENT '用户id',
  `user_password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户密码',
  `user_number` int(0) NOT NULL COMMENT '用户学号',
  `user_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户姓名',
  `user_college` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户学院',
  `user_email` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户邮箱',
  `user_phone` int(0) NULL DEFAULT NULL COMMENT '用户手机号',
  `user_community_id` int(0) NULL DEFAULT NULL COMMENT '用户参加的社团',
  `user_join_activity_id` int(0) NULL DEFAULT NULL COMMENT '用户参加的活动',
  `user_credits` float NULL DEFAULT NULL COMMENT '用户学分',
  `user_nickname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户昵称',
  `user_sex` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户性别',
  `user_nationailty` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户民族',
  `user_creat_time` datetime(0) NULL DEFAULT NULL COMMENT '用户创建时间',
  PRIMARY KEY (`user_id`, `user_number`, `user_name`) USING BTREE,
  INDEX `user_number`(`user_number`, `user_name`, `user_college`, `user_email`) USING BTREE,
  INDEX `user_name`(`user_name`) USING BTREE,
  INDEX `user_number_2`(`user_number`, `user_name`, `user_college`) USING BTREE,
  INDEX `user_number_3`(`user_number`, `user_name`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE,
  INDEX `fk_u_a`(`user_join_activity_id`) USING BTREE,
  INDEX `fk_u_c`(`user_community_id`) USING BTREE,
  CONSTRAINT `fk_u_a` FOREIGN KEY (`user_join_activity_id`) REFERENCES `activity` (`activity_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_u_c` FOREIGN KEY (`user_community_id`) REFERENCES `community` (`community_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
