-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: auctionsystem
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `as_goods`
--

DROP TABLE IF EXISTS `as_goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `as_goods` (
  `goods_id` int NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `goods_type` int DEFAULT NULL COMMENT '商品类别',
  `goods_pic` varchar(50) DEFAULT NULL COMMENT '商品图片',
  `goods_detail_pic` varchar(50) DEFAULT NULL COMMENT '商品详情展示图片',
  `goods_start_time` date DEFAULT NULL COMMENT '竞拍开始时间',
  `goods_end_time` date DEFAULT NULL COMMENT '竞拍结束时间',
  `goods_auction_times` int DEFAULT '0' COMMENT '被竞拍次数',
  `goods_start_price` double DEFAULT NULL COMMENT '初始价格',
  `goods_current_price` double DEFAULT NULL COMMENT '当前价格',
  `goods_state` int DEFAULT '0' COMMENT '商品当前状态，0未出售，1，已出售',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `as_goods`
--

LOCK TABLES `as_goods` WRITE;
/*!40000 ALTER TABLE `as_goods` DISABLE KEYS */;
/*!40000 ALTER TABLE `as_goods` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-11  9:54:47
