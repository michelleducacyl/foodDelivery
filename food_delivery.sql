-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 27, 2024 at 03:00 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS food_delivery;

-- Usar la base de datos
USE food_delivery;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `food_delivery`
--

-- --------------------------------------------------------

--
-- Table structure for table `dishes`
--

CREATE TABLE `dishes` (
  `id` int(11) NOT NULL,
  `id_restaurant` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dishes`
--

INSERT INTO `dishes` (`id`, `id_restaurant`, `name`, `description`, `price`, `image`) VALUES
(1, 'RSH', 'Classic Roll', 'Uramaki tempurizado de salmón.', 12.99, '/images/classicRoll.png'),
(2, 'RSH', 'Takoyaki', 'Bolitas de pulpo tradicional.', 7.99, '/images/Takoyaki.png'),
(3, 'RSH', 'Kinoku Udon', 'Fideos Udon salteados con mix de setas.', 25, '/images/udon.png'),
(4, 'SQ', 'Menú Shawarma', 'Menú completo bebida y patatas.', 12, '/images/platoShawarma.png'),
(5, 'SQ', 'Plato desnudo', 'Ingredientes en plato, low carb', 9, '/images/platoKebab.png'),
(6, 'SQ', 'Kebab Clásico', 'La mejor carne en pan pita.', 10, '/images/kebabClasico.png'),
(7, 'MP', 'Bowl mexicano', 'Selección de ingredientes frescos.', 8.5, '/images/bowl.png'),
(8, 'MP', 'Enchiladas de carne', 'Bien picantes.', 12, '/images/enchiladas.png'),
(9, 'MP', 'Tacos al pastor', 'El favorito del público.', 15, '/images/tacosP.png'),
(10, 'LT', 'Pasta al pesto', 'Clásica combinación con piñones.', 15, '/images/pesto.png'),
(11, 'LT', 'Ñoquis carbonara', 'Ñoquis en su salsa.', 15, '/images/noquis.png'),
(12, 'LT', 'Fusilli bolognesa', 'Con la mejor carne del mercado.', 20, '/images/fusilli.png'),
(13, 'CT', 'Carrot cake', 'Cubierta de queso crema', 5, '/images/carrot.png'),
(14, 'CT', 'Red Velvet', 'Explosión de sabores.', 4, '/images/redvelvet.png'),
(15, 'CT', 'Batido de chocolate', 'Pidelo con crema para una mejor experiencia.', 3, '/images/batidochoco.png'),
(16, 'BP', 'Burger clásica', 'Carne en su punto', 20, '/images/burgerclasica.png'),
(17, 'BP', 'Pizza vegana', 'Base de colifor.', 15, '/images/veganp.png'),
(18, 'BP', 'Pollo crunchy', 'Hamburguesa de pollo.', 12, '/images/crunchyb.png');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `restaurant_id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `id_user`, `total`, `order_date`, `restaurant_id`) VALUES
(1, 1, 58.97, '2024-01-27', 'RSH'),
(3, 1, 35.98, '2024-01-27', 'RSH'),
(4, 1, 32, '2024-01-27', 'MP'),
(5, 1, 49.980000000000004, '2024-01-27', 'CT');

-- --------------------------------------------------------

--
-- Table structure for table `orders_dishes`
--

CREATE TABLE `orders_dishes` (
  `order_id` int(11) NOT NULL,
  `dish_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders_dishes`
--

INSERT INTO `orders_dishes` (`order_id`, `dish_id`) VALUES
(1, 1),
(3, 2),
(4, 8),
(5, 1),
(5, 14);

-- --------------------------------------------------------

--
-- Table structure for table `restaurant`
--

CREATE TABLE `restaurant` (
  `id` varchar(50) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(200) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `restaurant`
--

INSERT INTO `restaurant` (`id`, `name`, `description`, `image`) VALUES
('BP', 'Burgers & Pizza', '<html>Deliciosas hamburguesas jugosas y pizzas recién horneadas te esperan en nuestro lugar. Satisface tus antojos con lo mejor de ambos mundos. ¡Ven y disfruta de una experiencia gastronómica única!<', '/images/burgersP.png'),
('CT', 'Coffe Time', '<html>Deliciosas tartas y refrescantes batidos, todo en un solo lugar. Sabores irresistibles que te harán volver por más. ¡Ven y disfruta en nuestra cafetería!</html>\n', '/images/coffeTime.png'),
('LT', 'Le Trattoria', '<html>Pastas exquisitas entregadas directamente a tu puerta. ¡Sabores frescos y deliciosos! Disfruta lo mejor con nuestro servicio de entrega a domicilio.</html>\n', '/images/leTrattoria.png'),
('MP', 'Mexican Palace', '<html>Deliciosos platillos mexicanos entregados a tu puerta. ¡Frescos, sabrosos y rápidos! Experimenta lo mejor con nuestro servicio de entrega a domicilio.</html>', '/images/mexicanPalace.png'),
('RSH', 'Royal Sushi House', '<html>Exquisite sushi delivered to your door!.  Fresh, flavorful, and fast – experience the best with our delivery app service </html>', '/images/royalSushi.png'),
('SQ', 'Shawarma Queen', '<html>Shawarmas deliciosos entregados directamente a tu puerta. ¡Sabores auténticos y rápidos! Disfruta lo mejor con nuestro servicio de entrega a domicilio.</html>\n', '/images/shawarmaQueen.png');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `verification_code` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `verification_code`) VALUES
(1, 'michelleag99@gmail.com', '$2a$10$lIO1iwTx.b9lernjFImpU.mmXjHmYxPBUhlCL3NMHpFF0d.V6eK.G', 565317),
(2, 'alexmoneo@gmail.com', '$2a$10$uWgC58YfYB/UZtZD5SuH0eidJwV506tsa6JdmuBSIaZmtGTl0JEzO', 519996);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dishes`
--
ALTER TABLE `dishes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_restaurant` (`id_restaurant`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `orders_dishes`
--
ALTER TABLE `orders_dishes`
  ADD PRIMARY KEY (`order_id`,`dish_id`),
  ADD KEY `dish_id` (`dish_id`);

--
-- Indexes for table `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dishes`
--
ALTER TABLE `dishes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dishes`
--
ALTER TABLE `dishes`
  ADD CONSTRAINT `dishes_ibfk_1` FOREIGN KEY (`id_restaurant`) REFERENCES `restaurant` (`id`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`);

--
-- Constraints for table `orders_dishes`
--
ALTER TABLE `orders_dishes`
  ADD CONSTRAINT `orders_dishes_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`),
  ADD CONSTRAINT `orders_dishes_ibfk_2` FOREIGN KEY (`dish_id`) REFERENCES `dishes` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
