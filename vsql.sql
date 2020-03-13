-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2020 at 09:32 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `vsql`
--

-- --------------------------------------------------------

--
-- Table structure for table `buyer_table`
--

CREATE TABLE IF NOT EXISTS `buyer_table` (
  `BUYCODE` varchar(4) NOT NULL,
  `BUYNAME` varchar(40) NOT NULL,
  `BUYADDRESS` varchar(100) NOT NULL,
  `BUYCONTACT` varchar(11) NOT NULL,
  `BUYTIN` varchar(16) NOT NULL,
  PRIMARY KEY (`BUYCODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buyer_table`
--

INSERT INTO `buyer_table` (`BUYCODE`, `BUYNAME`, `BUYADDRESS`, `BUYCONTACT`, `BUYTIN`) VALUES
('1234', ' YOBIB', ' LAS PINAS', '091021', '1123');

-- --------------------------------------------------------

--
-- Table structure for table `buyer_transaction`
--

CREATE TABLE IF NOT EXISTS `buyer_transaction` (
  `OR` int(4) NOT NULL,
  `BUYCODE` varchar(4) NOT NULL,
  `DATE` date NOT NULL,
  `DCG` varchar(4) NOT NULL,
  `QUANTITY` int(9) NOT NULL,
  `NETW` varchar(9) NOT NULL,
  `UNIT_PRICE` int(9) NOT NULL,
  `AMOUNT` varchar(9) NOT NULL,
  PRIMARY KEY (`OR`),
  KEY `BUYCODE` (`BUYCODE`),
  KEY `DCG` (`DCG`),
  KEY `UNIT_PRICE` (`UNIT_PRICE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `product_table`
--

CREATE TABLE IF NOT EXISTS `product_table` (
  `DCG` varchar(4) NOT NULL,
  `PRODUCT_NAME` varchar(100) NOT NULL,
  `UNIT_PRICE` int(9) NOT NULL,
  PRIMARY KEY (`DCG`),
  UNIQUE KEY `UNIT_PRICE` (`UNIT_PRICE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_table`
--

INSERT INTO `product_table` (`DCG`, `PRODUCT_NAME`, `UNIT_PRICE`) VALUES
(' 12', ' kwekwek', 10000),
('QWE', 'TURON', 10);

-- --------------------------------------------------------

--
-- Table structure for table `suppliers_table`
--

CREATE TABLE IF NOT EXISTS `suppliers_table` (
  `SUPCODE` varchar(4) NOT NULL,
  `SUPNAME` varchar(40) NOT NULL,
  `SUPADDRESS` varchar(100) NOT NULL,
  `SUPPCONTACT` varchar(11) NOT NULL,
  `SUPPTIN` varchar(16) NOT NULL,
  PRIMARY KEY (`SUPCODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `suppliers_table`
--

INSERT INTO `suppliers_table` (`SUPCODE`, `SUPNAME`, `SUPADDRESS`, `SUPPCONTACT`, `SUPPTIN`) VALUES
('1231', ' sdas', ' sas', '23123', '1212'),
('1919', ' yobib', ' dasdasd', '09101232123', '1123'),
('HH', 'HOA HOUNG', 'EWAN KO', '09019019019', '010101011');

-- --------------------------------------------------------

--
-- Table structure for table `suppliers_transaction`
--

CREATE TABLE IF NOT EXISTS `suppliers_transaction` (
  `SUPCODE` varchar(4) NOT NULL,
  `OR` int(4) NOT NULL,
  `DATE` date NOT NULL,
  `DCG` varchar(4) NOT NULL,
  `QUANTITY` int(9) NOT NULL,
  `NETW` varchar(9) NOT NULL,
  `UNIT_PRICE` int(9) NOT NULL,
  `AMOUNT` varchar(9) NOT NULL,
  PRIMARY KEY (`OR`),
  KEY `SUPCODE` (`SUPCODE`),
  KEY `DCG` (`DCG`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buyer_transaction`
--
ALTER TABLE `buyer_transaction`
  ADD CONSTRAINT `BUYCODE` FOREIGN KEY (`BUYCODE`) REFERENCES `buyer_table` (`BUYCODE`),
  ADD CONSTRAINT `DCG` FOREIGN KEY (`DCG`) REFERENCES `product_table` (`DCG`),
  ADD CONSTRAINT `UPB` FOREIGN KEY (`UNIT_PRICE`) REFERENCES `product_table` (`UNIT_PRICE`);

--
-- Constraints for table `suppliers_transaction`
--
ALTER TABLE `suppliers_transaction`
  ADD CONSTRAINT `DCGS` FOREIGN KEY (`DCG`) REFERENCES `product_table` (`DCG`),
  ADD CONSTRAINT `SUPCODE` FOREIGN KEY (`SUPCODE`) REFERENCES `suppliers_table` (`SUPCODE`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
