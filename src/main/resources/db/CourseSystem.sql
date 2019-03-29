/*
 Navicat Premium Data Transfer

 Source Server         : wjx
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost
 Source Database       : CourseSystem

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : utf-8

 Date: 12/06/2018 15:17:20 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_Id` bigint(10) NOT NULL,
  `course_name` varchar(20) NOT NULL,
  `course_department` varchar(20) NOT NULL,
  `course_time` varchar(20) NOT NULL,
  `course_location` varchar(20) NOT NULL,
  `course_teacher` varchar(20) NOT NULL,
  `course_credit` float(10,0) NOT NULL,
  `course_mixnumber` int(100) NOT NULL,
  `course_isFull` tinyint(1) NOT NULL,
  PRIMARY KEY (`course_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `course`
-- ----------------------------
BEGIN;
INSERT INTO `course` VALUES ('1', '选课1', '教育学院', '周一晚一二节，1-14周', '教三304', '吴', '1', '40', '0'), ('2', '选课2', '计信学院', '周二晚一二节，1-13周', '教四401', '蒋', '2', '40', '0'), ('3', '选课3', '生命科学学院', '周三晚一二节，1-13周', '教四305', '丁', '1', '40', '0');
COMMIT;

-- ----------------------------
--  Table structure for `hadChoose`
-- ----------------------------
DROP TABLE IF EXISTS `hadChoose`;
CREATE TABLE `hadChoose` (
  `HadChoose_id` bigint(8) NOT NULL,
  `Course_id` varchar(15) NOT NULL,
  `Teacher_id` varchar(15) NOT NULL,
  `Student_id` varchar(15) NOT NULL,
  `IsPass` bit(1) NOT NULL,
  PRIMARY KEY (`HadChoose_id`,`Course_id`,`Teacher_id`,`Student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` bigint(15) NOT NULL,
  `student_password` varchar(16) NOT NULL,
  `student_department` varchar(10) NOT NULL,
  `student_name` char(20) NOT NULL,
  `student_class` varchar(10) NOT NULL,
  `student_course1` varchar(15) DEFAULT NULL,
  `student_course2` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `student`
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES ('72', '123456', '教育学院', '吴建星', '1601', null, null);
COMMIT;

-- ----------------------------
--  Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` bigint(15) NOT NULL,
  `teacher_password` varchar(16) NOT NULL,
  `teacher_name` char(20) NOT NULL,
  `teacher_department` varchar(15) NOT NULL,
  `teacher_course` varchar(15) NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `teacher`
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES ('1', '12345678', '吴笛', '教育学院', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
