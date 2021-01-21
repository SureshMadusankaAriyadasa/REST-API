-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 21, 2021 at 04:58 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sql_coffee_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `ctr_id` int(11) NOT NULL,
  `fname` varchar(15) NOT NULL,
  `lname` varchar(15) NOT NULL,
  `address` text NOT NULL,
  `telephone` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`ctr_id`, `fname`, `lname`, `address`, `telephone`) VALUES
(1, 'suresh', 'ariyadasa', 'no 716, 4th lane,church road, Hingurakgoda.', '+94769661212'),
(2, 'viranga', 'boghalanda', 'no 215, 3th lane,church road, Hingurakgoda.', '+94703360180'),
(3, 'chamath', 'nethmini', 'no 432, Near the temple, Kandy.', '0703360160'),
(4, 'yasas', 'tharuka', 'no 33/1, Near the Air-force, Hingurakgoda.', '0768812345'),
(5, 'tharaka', 'withanage', 'no 22/1, Road in front of the police station, Thanamalwila.\r\n', '+94769661215');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `customer_fname` varchar(15) NOT NULL,
  `customer_lname` varchar(15) NOT NULL,
  `customer_address` text NOT NULL,
  `customer_tel` varchar(12) NOT NULL,
  `item_id` varchar(4) NOT NULL,
  `qty` int(11) NOT NULL,
  `price` double DEFAULT NULL,
  `ctr_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `customer_fname`, `customer_lname`, `customer_address`, `customer_tel`, `item_id`, `qty`, `price`, `ctr_id`) VALUES
(1, 'suresh', 'ariyadasa', 'no 716, 4th lane, church road, Hingurakgoda.', '+94769661212', 'a001', 1, 750, 1),
(2, 'viranga', 'bogahalanda', 'no 215, 3th lane,church road, Hingurakgoda.', '+94703360180', 'a002', 2, 1600, 2);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `item_id` varchar(4) NOT NULL,
  `coffee_name` varchar(25) NOT NULL,
  `coffee_description` varchar(500) NOT NULL,
  `unit_price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`item_id`, `coffee_name`, `coffee_description`, `unit_price`) VALUES
('a001', 'Americano', 'With a similar flavor to black coffee, the americano consists of an espresso shot diluted in hot wat', 750),
('a002', 'Red Eye', 'A cup of hot coffee mixed with an espresso shot will definitely get your heart beating.', 850),
('a003', 'Flat White', 'This Aussie-born drink is basically a cappuccino without the foam or chocolate sprinkle. It’s an esp', 1000),
('a004', 'Iced Coffee', 'A coffee with ice, typically served with a dash of milk, cream or sweetener—iced coffee is really as', 450);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`ctr_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `item_id` (`item_id`,`ctr_id`),
  ADD KEY `ctr_id` (`ctr_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`item_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`item_id`) REFERENCES `products` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`ctr_id`) REFERENCES `customers` (`ctr_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
