-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 22, 2024 at 03:26 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `item_id` varchar(30) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `isbn` varchar(50) NOT NULL,
  `publisher` varchar(50) NOT NULL,
  `numberOfPage` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`item_id`, `genre`, `isbn`, `publisher`, `numberOfPage`) VALUES
('I-001', 'Thriller', 'Q-8563214', 'Wasana', '250'),
('I-003', 'Self-Help', 'Q-856f98s565', 'Wasana', '200'),
('I-005', 'Thriller', 'Q-7841kfJ', 'Wasana', '203');

-- --------------------------------------------------------

--
-- Table structure for table `borrowitem`
--

CREATE TABLE `borrowitem` (
  `borrow_id` varchar(30) NOT NULL,
  `member_id` varchar(30) NOT NULL,
  `item_id` varchar(30) NOT NULL,
  `type` varchar(50) NOT NULL,
  `borrowDate` varchar(50) NOT NULL,
  `dueDate` varchar(50) NOT NULL,
  `isReturn` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `borrowitem`
--

INSERT INTO `borrowitem` (`borrow_id`, `member_id`, `item_id`, `type`, `borrowDate`, `dueDate`, `isReturn`) VALUES
('B-001', 'M-001', 'I-002', 'Book', '2024/09/17', '2024/10/01', 'No'),
('B-002', 'M-001', 'I-001', 'DVD', '2024/09/17', '2024/10/01', 'No'),
('B-003', 'M-001', 'I-001', 'Book', '2024/09/18', '2024/10/02', 'Yes'),
('B-004', 'M-001', 'I-003', 'Book', '2024/09/18', '2024/10/02', 'Yes'),
('B-005', 'M-001', 'I-004', 'Book', '2024/09/18', '2024/10/02', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `dvd`
--

CREATE TABLE `dvd` (
  `item_id` varchar(30) NOT NULL,
  `language` varchar(50) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `duration` varchar(50) NOT NULL,
  `isSubtitleAvailable` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dvd`
--

INSERT INTO `dvd` (`item_id`, `language`, `genre`, `duration`, `isSubtitleAvailable`) VALUES
('I-002', 'German', 'Mystery', '120', 'No'),
('I-004', 'English', 'Science Fiction (Sci-Fi)', '200', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `finepayment`
--

CREATE TABLE `finepayment` (
  `payment_id` varchar(30) NOT NULL,
  `return_id` varchar(30) NOT NULL,
  `fineAmount` varchar(50) NOT NULL,
  `paymentDate` varchar(50) NOT NULL,
  `paymentTime` varchar(50) NOT NULL,
  `isPaymentComplete` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `finepayment`
--

INSERT INTO `finepayment` (`payment_id`, `return_id`, `fineAmount`, `paymentDate`, `paymentTime`, `isPaymentComplete`) VALUES
('F-001', 'R-001', '450', '2024/09/17', '23:25', 'Yes'),
('F-002', 'R-001', '100', '2024/09/17', '23:39', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `item_id` varchar(30) NOT NULL,
  `title` varchar(50) NOT NULL,
  `isAvailable` varchar(20) NOT NULL,
  `authorOrDirector` varchar(50) NOT NULL,
  `publicationYear` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`item_id`, `title`, `isAvailable`, `authorOrDirector`, `publicationYear`) VALUES
('I-001', 'Madol Duwa', 'No', 'Martin Wikramasinghe', '2004'),
('I-002', 'DVD', 'Yes', 'Director', '2000'),
('I-003', 'Ape Gama', 'Yes', 'Martin Wikramasinghe', '2000'),
('I-004', 'Captian America', 'Yes', 'Marvel', '2015'),
('I-005', 'Sherlok Homes 2', 'Yes', 'Chandana Mendis', '2007');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `member_id` varchar(30) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phoneNumber` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `memberShipDate` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`member_id`, `name`, `email`, `phoneNumber`, `address`, `memberShipDate`) VALUES
('M-001', 'Sarath Kumara', 'sarath@gmail.com', '0771452365', 'Colombo', '2024/09/17'),
('M-002', 'Kasun Sankalpa', 'sankalpa@gmail.com', '0741238714', 'Colombo', '2024/09/22'),
('M-003', 'Lahiru Lakruwan', 'ruwan74@gmail.com', '0721547821', 'Matara', '2024/09/22');

-- --------------------------------------------------------

--
-- Table structure for table `returnitem`
--

CREATE TABLE `returnitem` (
  `return_id` varchar(30) NOT NULL,
  `borrow_id` varchar(30) NOT NULL,
  `returnDate` varchar(50) NOT NULL,
  `isLate` varchar(50) NOT NULL,
  `numberOfDateLate` varchar(50) NOT NULL,
  `fineAmount` varchar(50) NOT NULL,
  `isFinePaymentPaid` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `returnitem`
--

INSERT INTO `returnitem` (`return_id`, `borrow_id`, `returnDate`, `isLate`, `numberOfDateLate`, `fineAmount`, `isFinePaymentPaid`) VALUES
('R-001', 'B-001', '2024/09/17', 'No', '0', '0', 'No'),
('R-002', 'B-001', '2024/09/17', 'No', '0', '0', 'No'),
('R-003', 'B-003', '2024/09/18', 'No', '0', '0', 'No'),
('R-004', 'B-004', '2024/09/18', 'No', '0', '0', 'No'),
('R-005', 'B-005', '2024/09/18', 'No', '0', '0', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `email` varchar(50) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `userName` varchar(30) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`email`, `firstName`, `lastName`, `userName`, `password`) VALUES
('janith789@gmail.com', 'Janith', 'Harshana', 'janith123', '123456'),
('kavinga@gmail.com', 'Amal', 'Kavinga', 'kavinga412', '1789');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD KEY `item_id` (`item_id`);

--
-- Indexes for table `borrowitem`
--
ALTER TABLE `borrowitem`
  ADD PRIMARY KEY (`borrow_id`),
  ADD KEY `bItemID` (`item_id`),
  ADD KEY `memberID` (`member_id`);

--
-- Indexes for table `dvd`
--
ALTER TABLE `dvd`
  ADD KEY `itemID` (`item_id`);

--
-- Indexes for table `finepayment`
--
ALTER TABLE `finepayment`
  ADD PRIMARY KEY (`payment_id`),
  ADD KEY `returnID` (`return_id`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`item_id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`member_id`);

--
-- Indexes for table `returnitem`
--
ALTER TABLE `returnitem`
  ADD PRIMARY KEY (`return_id`),
  ADD KEY `bborrowID` (`borrow_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`email`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `item_id` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`);

--
-- Constraints for table `borrowitem`
--
ALTER TABLE `borrowitem`
  ADD CONSTRAINT `bItemID` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `memberID` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `dvd`
--
ALTER TABLE `dvd`
  ADD CONSTRAINT `itemID` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`);

--
-- Constraints for table `finepayment`
--
ALTER TABLE `finepayment`
  ADD CONSTRAINT `returnID` FOREIGN KEY (`return_id`) REFERENCES `returnitem` (`return_id`);

--
-- Constraints for table `returnitem`
--
ALTER TABLE `returnitem`
  ADD CONSTRAINT `bborrowID` FOREIGN KEY (`borrow_id`) REFERENCES `borrowitem` (`borrow_id`) ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
