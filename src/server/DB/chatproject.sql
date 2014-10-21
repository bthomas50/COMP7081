
-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 23, 2014 at 01:09 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `chatproject`
--

-- --------------------------------------------------------
DROP TABLE `users`;
DROP TABLE `teams`;

CREATE TABLE `teams`
(
   `team_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
   `company` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
   PRIMARY KEY (`team_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password` char(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `role` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `team` varchar(32) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
   FOREIGN KEY (`team`) REFERENCES teams(`team_id`),
   PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Dumping data for table `users`
--
INSERT INTO `teams` (`team_id`, `company`) VALUE
('', ''),
('testteam', ''),
('companyteam', 'company');

INSERT INTO `users` (`user_id`, `password`, `role`, `team`) VALUES
('admin', md5('password'), 'admin', ''),
('user', md5('password'), 'user', ''),
('testdev', md5('password'), 'dev', 'testteam'),
('testcomp', md5('password'), 'dev', 'companyteam');


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;