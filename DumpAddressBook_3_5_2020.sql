-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: addressbook.ciwlvmvlrimm.us-east-2.rds.amazonaws.com    Database: addressBook
-- ------------------------------------------------------
-- Server version	5.7.22-log

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
-- Table structure for table `BigContact`
--

DROP TABLE IF EXISTS `BigContact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `BigContact` (
  `ID` int(11) NOT NULL,
  `PersonID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `BigContact`
--

LOCK TABLES `BigContact` WRITE;
/*!40000 ALTER TABLE `BigContact` DISABLE KEYS */;
/*!40000 ALTER TABLE `BigContact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contactInfo`
--

DROP TABLE IF EXISTS `contactInfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contactInfo` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Phone` varchar(13) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `PersonID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `PersonID` (`PersonID`),
  CONSTRAINT `contactInfo_ibfk_1` FOREIGN KEY (`PersonID`) REFERENCES `persons` (`PersonID`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contactInfo`
--

LOCK TABLES `contactInfo` WRITE;
/*!40000 ALTER TABLE `contactInfo` DISABLE KEYS */;
INSERT INTO `contactInfo` VALUES (1,'123-123-1234','Me@them.com',NULL),(6,'123-123-1234','me@them.com',NULL),(27,'123-123-1234','Me@them.com',NULL),(28,'908-421-5125','more@examples.com',NULL),(29,'515-890-1412','josh@example.com',NULL);
/*!40000 ALTER TABLE `contactInfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persons`
--

DROP TABLE IF EXISTS `persons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persons` (
  `PersonID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(35) NOT NULL,
  `DateOfBirth` date DEFAULT NULL,
  PRIMARY KEY (`PersonID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persons`
--

LOCK TABLES `persons` WRITE;
/*!40000 ALTER TABLE `persons` DISABLE KEYS */;
INSERT INTO `persons` VALUES (1,'Kelly','Klein','1979-03-21'),(4,'Ender','Klein','2015-04-26'),(5,'Tom','Petty','1954-10-20'),(28,'More','Examples','2020-03-01'),(31,'Biggie','Smalls','2020-02-29'),(32,'some new','dude','2020-12-31'),(33,'Tinfoil','Hatt','2006-06-06');
/*!40000 ALTER TABLE `persons` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-05 20:40:25
