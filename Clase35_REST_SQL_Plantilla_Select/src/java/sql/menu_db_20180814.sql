-- phpMyAdmin SQL Dump
-- version 4.6.6deb4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Aug 24, 2018 at 10:34 AM
-- Server version: 10.1.26-MariaDB-0+deb9u1
-- PHP Version: 7.0.30-0+deb9u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `menu_db`
--
CREATE DATABASE IF NOT EXISTS `menu_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `menu_db`;

-- --------------------------------------------------------

--
-- Table structure for table `comidas`
--

CREATE TABLE `comidas` (
  `com_id` int(11) NOT NULL,
  `com_titulo` varchar(255) COLLATE utf8_bin NOT NULL,
  `com_descripcion` text COLLATE utf8_bin NOT NULL,
  `com_precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `comidas`
--

INSERT INTO `comidas` (`com_id`, `com_titulo`, `com_descripcion`, `com_precio`) VALUES
(3, 'Fugazzeta', 'Jamon y Queso,,... Y muchos morrones y aceitunas', 270),
(7, 'chipa vegano', 'vegano', 5000),
(8, 'ricota', 'con azucar', 100),
(9, 'copos', 'choco y dulce', 100),
(10, 'chipasito', 'chiciito', 10),
(11, 'talitas', 'largas', 40);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comidas`
--
ALTER TABLE `comidas`
  ADD PRIMARY KEY (`com_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comidas`
--
ALTER TABLE `comidas`
  MODIFY `com_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
