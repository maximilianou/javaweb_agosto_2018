--
-- Database: `distribuidora_db`
--
CREATE DATABASE IF NOT EXISTS `distribuidora_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `distribuidora_db`;

-- --------------------------------------------------------

--
-- Table structure for table `golosinas`
--

CREATE TABLE `golosinas` (
  `gol_id` int(11) NOT NULL,
  `gol_titulo` varchar(255) COLLATE utf8_bin NOT NULL,
  `gol_descripcion` text COLLATE utf8_bin NOT NULL,
  `gol_precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `golosinas`
--

INSERT INTO `golosinas` (`gol_id`, `gol_titulo`, `gol_descripcion`, `gol_precio`) VALUES
(1, 'Alfajor', 'Capitan del Espacio', 25),
(2, 'Topolin', 'Sorpresa', 300),
(3, 'Topolino', 'Sorpesa con Juguete de platico', 300),
(4, 'jAMON', 'serrano', 300),
(5, 'Jamon', 'Serrrano', 300),
(6, 'Jamon ', 'Serrano en Pata', 1000),
(7, 'tarta', 'ricota', 100),
(8, 'guinda', 'masa fina para mara', 2000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `golosinas`
--
ALTER TABLE `golosinas`
  ADD PRIMARY KEY (`gol_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `golosinas`
--
ALTER TABLE `golosinas`
  MODIFY `gol_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
