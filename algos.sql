-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2018 at 03:52 PM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `algos`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `adminNo` int(11) NOT NULL,
  `username` varchar(125) NOT NULL,
  `password` varchar(125) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`adminNo`, `username`, `password`) VALUES
(1, 'BrianaLee', 'algos1'),
(2, 'CiaranToman', 'algos2'),
(3, 'DylanIrwin', 'algos3'),
(4, 'RoryFriel', 'algos4'),
(5, 'KyleDoherty', 'algos5'),
(6, 'ShaunHaugh', 'algos6'),
(7, 'KevinMcGonagle', 'algos7'),
(8, 'RuthLennon', 'algos8');

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `clientNo` int(11) NOT NULL,
  `username` varchar(125) NOT NULL,
  `password` varchar(125) NOT NULL,
  `orderID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`clientNo`, `username`, `password`, `orderID`) VALUES
(1, 'MaryDoherty', 'algosA', 0),
(2, 'BarbaraLynch', 'algosB', 0),
(3, 'JoeMcLaughlin', 'algosC', 0),
(4, 'EthanDoherty', 'algosD', 0),
(5, 'JennyHughes', 'algosE', 0),
(6, 'JoshHegarty', 'algosF', 0);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `noOfEvilMinions` int(11) NOT NULL,
  `weightOfRockets` int(11) NOT NULL,
  `noOfTanks` int(11) NOT NULL,
  `noOfTrains` int(11) NOT NULL,
  `totalCost` int(11) NOT NULL,
  `orderID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`adminNo`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD KEY `orderID` (`orderID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
