-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-06-2017 a las 03:48:56
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prestamos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_carreras`
--

CREATE TABLE `cat_carreras` (
  `carrera_id` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_categoria`
--

CREATE TABLE `cat_categoria` (
  `categoria_Id` int(11) NOT NULL,
  `Descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_estadofisico`
--

CREATE TABLE `cat_estadofisico` (
  `estadofisico_id` smallint(6) NOT NULL,
  `descripcion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cat_login`
--

CREATE TABLE `cat_login` (
  `login` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `estado` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `Equipo_Id` int(11) NOT NULL,
  `clave` varchar(20) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `categoria_Id` int(10) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `serie` varchar(30) NOT NULL,
  `existencia` smallint(6) NOT NULL,
  `stock` smallint(6) NOT NULL,
  `comentarios` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidas`
--

CREATE TABLE `salidas` (
  `salida_id` int(11) NOT NULL,
  `solicitante` varchar(30) NOT NULL,
  `comentarios` varchar(150) NOT NULL,
  `carrera_id` int(11) NOT NULL,
  `fecha_salida` date NOT NULL,
  `fecha_devolucion` date NOT NULL,
  `estado_salida` char(1) NOT NULL,
  `login` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidas_det`
--

CREATE TABLE `salidas_det` (
  `salida_id` int(11) NOT NULL,
  `cons` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `equipo_id` int(11) NOT NULL,
  `estadofisico_id` smallint(6) NOT NULL,
  `comentario` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cat_carreras`
--
ALTER TABLE `cat_carreras`
  ADD PRIMARY KEY (`carrera_id`);

--
-- Indices de la tabla `cat_categoria`
--
ALTER TABLE `cat_categoria`
  ADD PRIMARY KEY (`categoria_Id`);

--
-- Indices de la tabla `cat_estadofisico`
--
ALTER TABLE `cat_estadofisico`
  ADD PRIMARY KEY (`estadofisico_id`);

--
-- Indices de la tabla `cat_login`
--
ALTER TABLE `cat_login`
  ADD PRIMARY KEY (`login`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`Equipo_Id`),
  ADD KEY `categoria_Id` (`categoria_Id`),
  ADD KEY `existencia` (`existencia`);

--
-- Indices de la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD PRIMARY KEY (`salida_id`),
  ADD KEY `carrera_id` (`carrera_id`),
  ADD KEY `login` (`login`);

--
-- Indices de la tabla `salidas_det`
--
ALTER TABLE `salidas_det`
  ADD KEY `equipo_id` (`equipo_id`),
  ADD KEY `estadofisico_id` (`estadofisico_id`),
  ADD KEY `salida_id` (`salida_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cat_carreras`
--
ALTER TABLE `cat_carreras`
  MODIFY `carrera_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `cat_categoria`
--
ALTER TABLE `cat_categoria`
  MODIFY `categoria_Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `cat_estadofisico`
--
ALTER TABLE `cat_estadofisico`
  MODIFY `estadofisico_id` smallint(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `Equipo_Id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `salidas`
--
ALTER TABLE `salidas`
  MODIFY `salida_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`categoria_Id`) REFERENCES `cat_categoria` (`categoria_Id`);

--
-- Filtros para la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD CONSTRAINT `salidas_ibfk_1` FOREIGN KEY (`carrera_id`) REFERENCES `cat_carreras` (`carrera_id`),
  ADD CONSTRAINT `salidas_ibfk_2` FOREIGN KEY (`login`) REFERENCES `cat_login` (`login`);

--
-- Filtros para la tabla `salidas_det`
--
ALTER TABLE `salidas_det`
  ADD CONSTRAINT `salidas_det_ibfk_1` FOREIGN KEY (`equipo_id`) REFERENCES `equipo` (`Equipo_Id`),
  ADD CONSTRAINT `salidas_det_ibfk_2` FOREIGN KEY (`estadofisico_id`) REFERENCES `cat_estadofisico` (`estadofisico_id`),
  ADD CONSTRAINT `salidas_det_ibfk_3` FOREIGN KEY (`salida_id`) REFERENCES `equipo` (`Equipo_Id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
