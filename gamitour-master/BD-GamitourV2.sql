CREATE DATABASE  IF NOT EXISTS `gamitour` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `gamitour`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gamitour
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actividad`
--

DROP TABLE IF EXISTS `actividad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `actividad` (
  `idactividad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `fechainicio` date DEFAULT NULL,
  `fechafin` date DEFAULT NULL,
  `ubicacion` varchar(60) DEFAULT NULL,
  `numparticipantes` int(11) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `imagen` varchar(60) DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  PRIMARY KEY (`idactividad`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actividad`
--

LOCK TABLES `actividad` WRITE;
/*!40000 ALTER TABLE `actividad` DISABLE KEYS */;
INSERT INTO `actividad` VALUES (2,'actividad1','2010-10-10','2011-11-11','ubi',10,20.4,'sin imagen',10),(3,'actividad2','2011-11-11','2012-12-12','ubi2',30,10,'sin imagen',10),(7,'actividad','2011-11-11','2012-12-12','ubic',10,10,'sin imagen',10),(8,'actividad3','2012-12-12','2013-01-13','ubica',10,10,'sin imagen',10),(11,'gggggg','2010-10-10','2011-11-11','aaa',10,10,'sin imagen',10);
/*!40000 ALTER TABLE `actividad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `apellidos` varchar(60) DEFAULT NULL,
  `fechanacimiento` date DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `codigopostal` varchar(10) DEFAULT NULL,
  `avatar` varchar(45) DEFAULT NULL,
  `puntosacumulados` int(11) DEFAULT NULL,
  `fecharegistro` date DEFAULT NULL,
  `rol_idrol` int(11) NOT NULL,
  `nick` varchar(45) NOT NULL,
  PRIMARY KEY (`idcliente`),
  UNIQUE KEY `nick_UNIQUE` (`nick`),
  KEY `fk_cliente_rol1_idx` (`rol_idrol`),
  CONSTRAINT `fk_cliente_rol1` FOREIGN KEY (`rol_idrol`) REFERENCES `rol` (`idrol`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (2,'aaa','aaa','2010-10-10','aaa','aaa','aa','aa','aa','',0,'2018-01-27',1,'aaa'),(3,'aa','aaaaaaaa','2010-10-10','aaaaa','aa','aa','aa','aa','',0,'2018-01-27',1,'nick'),(4,'oscar ','apellido','2010-10-10','email','pass','555','dsa','2313','',0,'2018-01-27',1,'oscar'),(8,'aaaa','aaaaaa','2010-10-10','aaaaa','aa','aa','aa','aa','',0,'2018-01-27',1,'estoesunnick'),(9,'nombre','apellidos','2010-10-10','email','pass','telf','direcc','330222','',0,'2018-01-27',1,'nickdeprueba'),(11,'aaa','aaa','2010-10-10','aa','aaa','sss','sss','ss','',0,'2018-01-27',1,'veinti4'),(12,'jkhjk','hhjkhkj','2010-10-10','hjkhkj','jkjjj','jkjo','joi','jiojoi','',0,'2018-01-27',1,'nklsdlamcwlñ'),(13,'nombre','apell','2010-10-10','email','pass','te','ee','eee','',0,'2018-01-27',1,'nickkkkaaakakak'),(14,'admin','admin','2010-10-10','admin','admin','admin','admin','admin','',0,'2018-01-27',3,'admin2'),(17,'nombreaaaa','kk','2010-01-01','kk','kk','kk','kk','kk','',0,'2018-01-30',3,'kkooll'),(20,'sinrol','v','2011-11-11','sinrol','sinrol','sinrol','sinrol','sinrol','',0,'2018-02-14',1,'sinrol'),(21,'oooo','oooo','2011-11-11','oooo','oooo','oooo','oooo','oooo','',0,'2018-02-14',1,'oooo'),(22,'segundo','primero','2011-11-11','primero','primero','primero','primero','primero','',0,'2018-02-18',1,'primero');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente_has_actividad`
--

DROP TABLE IF EXISTS `cliente_has_actividad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente_has_actividad` (
  `cliente_idcliente` int(11) NOT NULL,
  `actividad_idactividad` int(11) NOT NULL,
  PRIMARY KEY (`cliente_idcliente`,`actividad_idactividad`),
  KEY `fk_cliente_has_actividad_actividad1_idx` (`actividad_idactividad`),
  KEY `fk_cliente_has_actividad_cliente1_idx` (`cliente_idcliente`),
  CONSTRAINT `fk_cliente_has_actividad_actividad1` FOREIGN KEY (`actividad_idactividad`) REFERENCES `actividad` (`idactividad`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_actividad_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_has_actividad`
--

LOCK TABLES `cliente_has_actividad` WRITE;
/*!40000 ALTER TABLE `cliente_has_actividad` DISABLE KEYS */;
INSERT INTO `cliente_has_actividad` VALUES (3,11);
/*!40000 ALTER TABLE `cliente_has_actividad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentario`
--

DROP TABLE IF EXISTS `comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comentario` (
  `idcomentario` int(11) NOT NULL AUTO_INCREMENT,
  `texto` varchar(200) DEFAULT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  `multimedia_idmultimedia` int(11) NOT NULL,
  PRIMARY KEY (`idcomentario`),
  KEY `fk_comentario_cliente1_idx` (`cliente_idcliente`),
  KEY `fk_comentario_multimedia1_idx` (`multimedia_idmultimedia`),
  CONSTRAINT `fk_comentario_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_comentario_multimedia1` FOREIGN KEY (`multimedia_idmultimedia`) REFERENCES `multimedia` (`idmultimedia`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentario`
--

LOCK TABLES `comentario` WRITE;
/*!40000 ALTER TABLE `comentario` DISABLE KEYS */;
INSERT INTO `comentario` VALUES (1,'texto',2,1),(2,'textodecomentario2',3,1),(3,'29222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 22222222222222222222222222222222222222222222222 2222222222222222222222222222222222222',2,1);
/*!40000 ALTER TABLE `comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itinerario`
--

DROP TABLE IF EXISTS `itinerario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itinerario` (
  `iditinerario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  `duracion` varchar(15) DEFAULT NULL,
  `ubicacion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iditinerario`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itinerario`
--

LOCK TABLES `itinerario` WRITE;
/*!40000 ALTER TABLE `itinerario` DISABLE KEYS */;
INSERT INTO `itinerario` VALUES (2,'nombre','categoria','categoria','ubicacion'),(3,'segundo','segundo','segundo','segundo'),(4,'itinerario3000','categor','catego','cerca');
/*!40000 ALTER TABLE `itinerario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `multimedia`
--

DROP TABLE IF EXISTS `multimedia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `multimedia` (
  `idmultimedia` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `comentario` varchar(60) DEFAULT NULL,
  `imagen` varchar(60) DEFAULT NULL,
  `video` varchar(60) DEFAULT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  `pruebaDeportiva_idpruebadeportiva` int(11) NOT NULL,
  `puntosacumulados` int(11) DEFAULT NULL,
  `titulo` varchar(45) NOT NULL,
  PRIMARY KEY (`idmultimedia`),
  UNIQUE KEY `titulo_UNIQUE` (`titulo`),
  KEY `fk_multimedia_cliente1_idx` (`cliente_idcliente`),
  KEY `fk_multimedia_pruebaDeportiva1_idx` (`pruebaDeportiva_idpruebadeportiva`),
  CONSTRAINT `fk_multimedia_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_multimedia_pruebaDeportiva1` FOREIGN KEY (`pruebaDeportiva_idpruebadeportiva`) REFERENCES `pruebadeportiva` (`idpruebadeportiva`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `multimedia`
--

LOCK TABLES `multimedia` WRITE;
/*!40000 ALTER TABLE `multimedia` DISABLE KEYS */;
INSERT INTO `multimedia` VALUES (1,'2010-11-11','comenta','imagen','video',2,1,10,'titulo'),(2,'2011-11-11','video','paradad','paradad',3,1,30,'tituloNuevo2');
/*!40000 ALTER TABLE `multimedia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `noticia`
--

DROP TABLE IF EXISTS `noticia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `noticia` (
  `idnoticia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `texto` varchar(200) DEFAULT NULL,
  `fechaalta` date DEFAULT NULL,
  `fechacaducidad` date DEFAULT NULL,
  `imagen` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idnoticia`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `noticia`
--

LOCK TABLES `noticia` WRITE;
/*!40000 ALTER TABLE `noticia` DISABLE KEYS */;
INSERT INTO `noticia` VALUES (3,'dasdaasda','dasdaasda','2011-11-11','2012-11-11','');
/*!40000 ALTER TABLE `noticia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parada`
--

DROP TABLE IF EXISTS `parada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parada` (
  `idparada` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `numeroParada` int(11) NOT NULL,
  `ubicacion` varchar(45) DEFAULT NULL,
  `historia` varchar(200) DEFAULT NULL,
  `anecdotario` varchar(200) DEFAULT NULL,
  `gastronomia` varchar(200) DEFAULT NULL,
  `imagen` varchar(45) DEFAULT NULL,
  `itinerario_iditinerario` int(11) NOT NULL,
  PRIMARY KEY (`idparada`),
  UNIQUE KEY `numeroParada_UNIQUE` (`numeroParada`),
  KEY `fk_parada_itinerario_idx` (`itinerario_iditinerario`),
  CONSTRAINT `fk_parada_itinerario` FOREIGN KEY (`itinerario_iditinerario`) REFERENCES `itinerario` (`iditinerario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parada`
--

LOCK TABLES `parada` WRITE;
/*!40000 ALTER TABLE `parada` DISABLE KEYS */;
INSERT INTO `parada` VALUES (1,'parada',10,'ubi','hist','anec','gastro','image',2),(2,'paradaprueba',1,'gijon','historia','anecdotario',' gastronomia2','imagen.png',2);
/*!40000 ALTER TABLE `parada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `premio`
--

DROP TABLE IF EXISTS `premio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `premio` (
  `idpremio` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `imagen` varchar(45) DEFAULT NULL,
  `fechaactivacion` date DEFAULT NULL,
  `fechaconsumo` date DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  PRIMARY KEY (`idpremio`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`),
  KEY `fk_premio_cliente1_idx` (`cliente_idcliente`),
  CONSTRAINT `fk_premio_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `premio`
--

LOCK TABLES `premio` WRITE;
/*!40000 ALTER TABLE `premio` DISABLE KEYS */;
INSERT INTO `premio` VALUES (2,'premio','descripcion de premio','img','2011-11-11','2012-12-12',30,2);
/*!40000 ALTER TABLE `premio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pruebacultural`
--

DROP TABLE IF EXISTS `pruebacultural`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pruebacultural` (
  `idpruebacultural` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `pregunta` varchar(200) DEFAULT NULL,
  `respuesta` varchar(45) DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  `parada_idparada` int(11) NOT NULL,
  PRIMARY KEY (`idpruebacultural`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`),
  KEY `fk_pruebaCultural_parada1_idx` (`parada_idparada`),
  CONSTRAINT `fk_pruebaCultural_parada1` FOREIGN KEY (`parada_idparada`) REFERENCES `parada` (`idparada`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pruebacultural`
--

LOCK TABLES `pruebacultural` WRITE;
/*!40000 ALTER TABLE `pruebacultural` DISABLE KEYS */;
INSERT INTO `pruebacultural` VALUES (1,'prueba','????????','¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡',30,1),(2,'nombre','pregunta','respuesta232',30,1),(3,'nombrejeje','¿esto es una pregunta?','si lo es¡',30,1);
/*!40000 ALTER TABLE `pruebacultural` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pruebadeportiva`
--

DROP TABLE IF EXISTS `pruebadeportiva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pruebadeportiva` (
  `idpruebadeportiva` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  `fechainicio` date DEFAULT NULL,
  `fechafin` date DEFAULT NULL,
  `explicacion` varchar(200) DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  `parada_idparada` int(11) NOT NULL,
  `pdf` varchar(45) DEFAULT NULL,
  `video` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpruebadeportiva`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`),
  KEY `fk_pruebaDeportiva_parada1_idx` (`parada_idparada`),
  CONSTRAINT `fk_pruebaDeportiva_parada1` FOREIGN KEY (`parada_idparada`) REFERENCES `parada` (`idparada`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pruebadeportiva`
--

LOCK TABLES `pruebadeportiva` WRITE;
/*!40000 ALTER TABLE `pruebadeportiva` DISABLE KEYS */;
INSERT INTO `pruebadeportiva` VALUES (1,'paradad','2010-10-10','2011-11-11','exp',10,1,'pdf','video'),(4,'prueba','2011-11-11','2012-12-12','El madrid gano ayer al bayer por 1-2 en alemania con goles deeee pepinillo y carvajal.. y jejejejeje',30,1,'jejejeje','jojojjo');
/*!40000 ALTER TABLE `pruebadeportiva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rol` (
  `idrol` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) NOT NULL,
  PRIMARY KEY (`idrol`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (3,'admin'),(9,'diamante'),(8,'plueban'),(4,'prueba'),(1,'usuario');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voto`
--

DROP TABLE IF EXISTS `voto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `voto` (
  `idvoto` int(11) NOT NULL AUTO_INCREMENT,
  `puntos` int(11) DEFAULT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  `multimedia_idmultimedia` int(11) NOT NULL,
  PRIMARY KEY (`idvoto`),
  KEY `fk_voto_cliente1_idx` (`cliente_idcliente`),
  KEY `fk_voto_multimedia1_idx` (`multimedia_idmultimedia`),
  CONSTRAINT `fk_voto_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_voto_multimedia1` FOREIGN KEY (`multimedia_idmultimedia`) REFERENCES `multimedia` (`idmultimedia`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voto`
--

LOCK TABLES `voto` WRITE;
/*!40000 ALTER TABLE `voto` DISABLE KEYS */;
INSERT INTO `voto` VALUES (2,0,3,1),(3,0,3,1),(4,0,3,1),(5,0,3,1),(6,0,3,1),(7,0,3,1),(8,30,3,1);
/*!40000 ALTER TABLE `voto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-26 20:44:37
