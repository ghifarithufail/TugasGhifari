-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 02, 2021 at 06:16 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventori`
--

-- --------------------------------------------------------

--
-- Table structure for table `iventories`
--

CREATE TABLE `iventories` (
  `id` int(11) NOT NULL,
  `name` varchar(230) NOT NULL,
  `description` text NOT NULL,
  `stock` int(11) DEFAULT 0,
  `created_at` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `iventories`
--

INSERT INTO `iventories` (`id`, `name`, `description`, `stock`, `created_at`) VALUES
(6, 'bmw', 'tahun 2000', 40, '2021-10-01 19:14:59'),
(7, 'mercy', 'tahun 2017 masih mulu full paper', 5, '2021-10-01 19:56:33'),
(8, 'benelli', 'keeway', 200, '2021-10-01 23:36:52'),
(9, 'yamaha', 'xsr', 40, '2021-10-01 23:55:30'),
(10, 'yamah R1', 'motor dengan CC sbesar 1000 CC dengan 4 silinder', 90, '2021-10-02 16:01:57'),
(11, 'mobil', 'honda', 21, '2021-10-02 22:18:40');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `iventories`
--
ALTER TABLE `iventories`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `iventories`
--
ALTER TABLE `iventories`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
