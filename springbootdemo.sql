create database springbootdemo;
use springbootdemo;
CREATE TABLE `persona` (
  `persona_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) DEFAULT NULL,
  `apellidos` varchar(100) DEFAULT NULL,
  `tipo_documento` int(11) DEFAULT NULL,
  `numero_documento` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `cargo` int(11) DEFAULT NULL,
  PRIMARY KEY (`persona_id`)  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;