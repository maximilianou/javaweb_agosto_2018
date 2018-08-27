--
-- Database: `reposteria_db`
--
CREATE DATABASE IF NOT EXISTS `reposteria_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `reposteria_db`;

-- --------------------------------------------------------

--
-- Table structure for table `articulos`
--

CREATE TABLE `articulos` (
  `art_id` int(11) NOT NULL,
  `art_titulo` varchar(255) COLLATE utf8_bin NOT NULL,
  `art_descripcion` text COLLATE utf8_bin NOT NULL,
  `art_precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `articulos`
--

INSERT INTO `articulos` (`art_id`, `art_titulo`, `art_descripcion`, `art_precio`) VALUES
(1, 'Lemon Pie', '4 limones\r\n500 gr manteca\r\n600 gr harina\r\n10 gr polvo de hornear\r\n6 huevos\r\n300 gr azucar', 300),
(2, 'medualuna', 'graasa', 100),
(3, 'Alfajor', 'Triple', 100),
(4, 'torta', 'galesa', 100),
(5, 'torta', 'Galesa Golosa', 250);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`art_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `articulos`
--
ALTER TABLE `articulos`
  MODIFY `art_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
