-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-02-2026 a las 12:57:34
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `deudas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deudas`
--

CREATE TABLE `deudas` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `monto` decimal(10,2) NOT NULL,
  `mes` varchar(20) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `deudas`
--

INSERT INTO `deudas` (`id`, `nombre`, `monto`, `mes`, `fecha`) VALUES
(1, 'TARJETA  BBVA', '3632.01', 'septiembre', '2025-09-07'),
(5, 'TARJETA NU (YO)', '4337.52', 'septiembre', '2025-09-07'),
(6, 'TARJETA NU (MOM)', '322.00', 'julio', '2025-07-17'),
(7, 'TARJETA NU (MOM)', '625.00', 'agosto', '2025-08-18'),
(8, 'TARJETA NU (MOM)', '474.01', 'septiembre', '2025-09-17'),
(9, 'TARJETA NU (YO)', '5098.82', 'agosto', '2025-08-11'),
(10, 'TARJETA NU (YO)', '5008.42', 'julio', '2025-07-10'),
(11, 'TARJETA NU (YO)', '5148.89', 'junio', '2025-06-10'),
(12, 'TARJETA NU (YO)', '3278.23', 'mayo', '2025-05-12'),
(13, 'TARJETA NU (YO)', '1643.72', 'abril', '2025-04-10'),
(14, 'TARJETA NU (YO)', '3843.55', 'marzo', '2025-03-10'),
(15, 'TARJETA NU (YO)', '7262.52', 'febrero', '2025-02-10'),
(16, 'TARJETA NU (YO)', '3632.23', 'enero', '2025-01-10'),
(17, 'TARJETA BRADESCARD', '1443.65', 'agosto', '2025-08-25'),
(18, 'TARJETA BRADESCARD', '690.61', 'septiembre', '2025-09-18'),
(19, 'TARJETA MP', '201.12', 'abril', '2025-04-21'),
(20, 'TARJETA MP', '217.04', 'mayo', '2025-05-19'),
(21, 'TARJETA MP', '418.16', 'junio', '2025-06-17'),
(22, 'TARJETA MP', '418.16', 'julio', '2025-07-17'),
(23, 'TARJETA MP', '418.16', 'agosto', '2025-08-18'),
(24, 'TARJETA MP', '418.16', 'septiembre', '2025-09-17'),
(26, 'TARJETA MP', '113.58', 'octubre', '2025-11-18'),
(27, 'PRESTAMO NU', '730.02', 'noviembre', '2024-11-07'),
(28, 'PRESTAMO NU', '730.02', 'diceiembre', '2024-12-09'),
(29, 'PRESTAMO NU', '730.02', 'enero', '2025-01-07'),
(30, 'PRESTAMO NU', '730.02', 'febrero', '2025-02-07'),
(31, 'PRESTAMO NU', '730.02', 'marzo', '2025-03-07'),
(32, 'PRESTAMO NU', '730.02', 'abril', '2025-04-07'),
(33, 'PRESTAMO NU', '730.02', 'mayo', '2025-05-07'),
(34, 'PRESTAMO NU', '730.02', 'junio', '2025-06-09'),
(35, 'PRESTAMO NU', '730.02', 'julio', '2025-07-07'),
(36, 'PRESTAMO NU', '730.02', 'agosto', '2025-08-07'),
(37, 'PRESTAMO NU', '730.02', 'septiembre', '2025-09-08'),
(38, 'PRESTAMO NU', '730.02', 'octubre', '2025-10-07'),
(39, 'TARJETA NU (YO)', '4375.22', 'octubre', '2025-10-10'),
(40, 'TARJETA MP', '690.08', 'octubre', '2025-10-17'),
(41, 'TARJETA MP', '340.00', 'noviembre', '2025-11-17'),
(42, 'TARJETA NU (YO)', '4375.22', 'octubre', '2025-10-07'),
(43, 'TARJETA BBVA', '3622.13', 'noviembre', '2025-11-02');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `deudas`
--
ALTER TABLE `deudas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `deudas`
--
ALTER TABLE `deudas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
