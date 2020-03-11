-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 11, 2020 at 02:58 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vqdbf`
--

-- --------------------------------------------------------

--
-- Table structure for table `buyer_transaction`
--

DROP TABLE IF EXISTS `buyer_transaction`;
CREATE TABLE IF NOT EXISTS `buyer_transaction` (
  `OR` int(100) NOT NULL,
  `BUYCODE` varchar(100) NOT NULL,
  `DATE` date NOT NULL,
  `DCG` varchar(100) NOT NULL,
  `QUANTITY` int(100) NOT NULL,
  `NETW` varchar(100) NOT NULL,
  `UNIT_PRICE` int(100) NOT NULL,
  `AMOUNT` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buyer_transaction`
--

INSERT INTO `buyer_transaction` (`OR`, `BUYCODE`, `DATE`, `DCG`, `QUANTITY`, `NETW`, `UNIT_PRICE`, `AMOUNT`) VALUES
(1, ' 1', '2002-02-20', 'hakdog', 23, '2', 8, '184.0');

-- --------------------------------------------------------

--
-- Table structure for table `suppliers_transaction`
--

DROP TABLE IF EXISTS `suppliers_transaction`;
CREATE TABLE IF NOT EXISTS `suppliers_transaction` (
  `SUPCODE` varchar(100) NOT NULL,
  `OR` int(100) NOT NULL,
  `DATE` date NOT NULL,
  `DCG` varchar(100) NOT NULL,
  `QUANTITY` int(100) NOT NULL,
  `NETW` varchar(100) NOT NULL,
  `UNIT_PRICE` int(100) NOT NULL,
  `AMOUNT` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `suppliers_transaction`
--

INSERT INTO `suppliers_transaction` (`SUPCODE`, `OR`, `DATE`, `DCG`, `QUANTITY`, `NETW`, `UNIT_PRICE`, `AMOUNT`) VALUES
(' 1', 1, '2001-01-20', 'MABIGAT', 12, '30', 38, '456.0'),
(' 1', 1, '2001-01-20', 'MABIGAT', 12, '30', 38, '456.0'),
(' 2', 2, '2002-02-20', '2', 2, '2', 4, '8.0'),
(' 3', 3, '2003-03-20', '3', 5, '3', 7, '35.0'),
(' 4', 4, '2004-04-20', '4', 12, '5', 90, '1080.0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
