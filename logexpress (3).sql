-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 24-Jun-2014 às 22:06
-- Versão do servidor: 5.6.12-log
-- versão do PHP: 5.4.16

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `logexpress`
--
CREATE DATABASE IF NOT EXISTS `logexpress` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `logexpress`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--
-- Criação: 20-Jun-2014 às 02:36
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `NOme` varchar(45) DEFAULT NULL,
  `Fantasia` varchar(45) DEFAULT NULL,
  `CNPJ` varchar(45) DEFAULT NULL,
  `InscEstadual` varchar(45) DEFAULT NULL,
  `Telefone1` varchar(45) DEFAULT NULL,
  `Telefone2` varchar(45) DEFAULT NULL,
  `Fax` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Site` varchar(45) DEFAULT NULL,
  `Endereco` varchar(45) DEFAULT NULL,
  `Numero` varchar(45) DEFAULT NULL,
  `Bairro` varchar(45) DEFAULT NULL,
  `Cidade` varchar(45) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `CEP` varchar(45) DEFAULT NULL,
  `Observacoes` text,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Truncate table before insert `clientes`
--

TRUNCATE TABLE `clientes`;
--
-- Extraindo dados da tabela `clientes`
--

INSERT DELAYED IGNORE INTO `clientes` (`Codigo`, `NOme`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(1, 'popiuy', 'iouiou', 'iuoy', 'iuoiuo', 'yiui', 'uyyui', 'oy', 'yui', 'uiiiiiiiiiiyoy', 'iyui', 'uioui', 'ioyioyuioyuiouyio', 'iuyyoy', 'Item 1', 'uioyuiouioiuu', 'iouyiouiouioyuioyuioyuioyuiou');
INSERT DELAYED IGNORE INTO `clientes` (`Codigo`, `NOme`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(2, 'ttttttttttttttt', 'tjjjjjjjjjjj', 'jjjjjjjjjjjjjjj', 'jjjjjjjjjjjjjjjjjj', 'jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj', 'jjj', 'jjjjjjjjjjjjjjjjjjj', 'jjjjjjjjjjjjjjjj', 'jjjjjjjjjjjjj', 'jjjjjjjjjjjj', 'jjjjjjjjjjjjjjjjj', 'jjjjjjjjjjjj', 'jjjjjjjjjjjjjjjjjjjj', 'Item 1', 'jjjjjjjjjjjjjjjjjjjjjj', 'jjjjjjjjjjjjjjjjjjjjjjjjjjjjjj');
INSERT DELAYED IGNORE INTO `clientes` (`Codigo`, `NOme`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(3, 'lllllllllll', 'lllllllllllll', 'llllllllllll', 'llllllllllllllllllll', 'llllllllllllllllll', 'llllllllllllllll', 'llllllllllllllll', 'lllllllllllll', 'lllllllllllll', 'llllllllllllllll', 'llllllllllllllllllll', 'llllllllllllllll', 'llllllllllllllll', 'Item 1', 'lllllllllllllll', 'lllllllllllllllllllllllllllllllll');
INSERT DELAYED IGNORE INTO `clientes` (`Codigo`, `NOme`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(4, 'sgddfgfsd', 'sgdfgdfg', 'sdfgdfs', 'fsdgdfsg', 'gdsfgfsd', 'gdfgsdf', 'gsdfgdsf', 'gdfsgsdf', 'gsdfgdsf', 'gsdfgs', 'sdfgsdfg', 'sdfgd', 'dfgfsdg', 'Item 3', 'sfgsdfgs', 'fdsgsdfgsdfgdfs');
INSERT DELAYED IGNORE INTO `clientes` (`Codigo`, `NOme`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(5, 'Douglas', 'Tecnico', '06820059671', '10403795', '35210067', '35224249', '91646560', 'douglas.egidio2gmail.com', 'douglas.com.br', 'Sebastião Teóilo', '81', 'Nova California', 'passos', 'Item 2', '37904567', 'Testando o Itext');

-- --------------------------------------------------------

--
-- Estrutura da tabela `controlecombustivel`
--
-- Criação: 20-Jun-2014 às 02:36
--

DROP TABLE IF EXISTS `controlecombustivel`;
CREATE TABLE IF NOT EXISTS `controlecombustivel` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `DataAbastecimento` varchar(45) DEFAULT NULL,
  `Kilometro` varchar(45) DEFAULT NULL,
  `TipoCombustivel` varchar(45) DEFAULT NULL,
  `Litros` varchar(45) DEFAULT NULL,
  `TotalPago` varchar(45) DEFAULT NULL,
  `Observacao` varchar(45) DEFAULT NULL,
  `CodVeiculo` int(11) NOT NULL,
  `CodFornecedor` int(11) NOT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `fk_controlecombustivel_veiculo1_idx` (`CodVeiculo`),
  KEY `fk_controlecombustivel_fornecedor1_idx` (`CodFornecedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Truncate table before insert `controlecombustivel`
--

TRUNCATE TABLE `controlecombustivel`;
--
-- Extraindo dados da tabela `controlecombustivel`
--

INSERT DELAYED IGNORE INTO `controlecombustivel` (`Codigo`, `DataAbastecimento`, `Kilometro`, `TipoCombustivel`, `Litros`, `TotalPago`, `Observacao`, `CodVeiculo`, `CodFornecedor`) VALUES(1, 'hfghd', 'fgdhgf', 'Item 3', 'fghfgh', 'gfhdf', 'fgdhdfhdghdfhfdhdfhdfhfh', 2, 1);
INSERT DELAYED IGNORE INTO `controlecombustivel` (`Codigo`, `DataAbastecimento`, `Kilometro`, `TipoCombustivel`, `Litros`, `TotalPago`, `Observacao`, `CodVeiculo`, `CodFornecedor`) VALUES(2, '16/06/2014', '321654', 'Item 3', '50', '321654', 'wertewrtrtewet', 1, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `destinatario`
--
-- Criação: 20-Jun-2014 às 02:36
--

DROP TABLE IF EXISTS `destinatario`;
CREATE TABLE IF NOT EXISTS `destinatario` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) DEFAULT NULL,
  `Fantasia` varchar(45) DEFAULT NULL,
  `CNPJ` varchar(45) DEFAULT NULL,
  `InscEstadual` varchar(45) DEFAULT NULL,
  `Telefone1` varchar(45) DEFAULT NULL,
  `Telefone2` varchar(45) DEFAULT NULL,
  `Fax` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Site` varchar(45) DEFAULT NULL,
  `Endereco` varchar(45) DEFAULT NULL,
  `Numero` varchar(45) DEFAULT NULL,
  `Bairro` varchar(45) DEFAULT NULL,
  `Cidade` varchar(45) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `CEP` varchar(45) DEFAULT NULL,
  `Observacoes` text,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Truncate table before insert `destinatario`
--

TRUNCATE TABLE `destinatario`;
--
-- Extraindo dados da tabela `destinatario`
--

INSERT DELAYED IGNORE INTO `destinatario` (`Codigo`, `Nome`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(1, 'eeeeeeeeeeeeeeee', 'rrrrrrrrrrrrrrrrrrr', 'ttttttttttttttttttttt', 'yyyyyyyyyyy', 'iiiiiiiiiiii', 'yuuuuuuuuuuu', 'oooooooooo', 'pppppppppppppp', 'aaaaaaaaaaaaaaa', 'ddddddddddddddd', 'ffff', 'gggggggggg', 'hhhhhhhhhh', 'Item 2', 'jjjjjjj', 'kkkkkkkkkkkkkkkkkkkkkkkkkkkkk');
INSERT DELAYED IGNORE INTO `destinatario` (`Codigo`, `Nome`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(2, 'Italo', 'Egidio', '3214654987', '789456123', '32100000', '94654214', '321654987', '32132123@5465464.com', 'italo', 'lkj', 'lkj', 'lkj', 'Campoe de Goitacazes', ' RJ', 'lkj', 'lkj');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--
-- Criação: 20-Jun-2014 às 02:36
--

DROP TABLE IF EXISTS `fornecedor`;
CREATE TABLE IF NOT EXISTS `fornecedor` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) DEFAULT NULL,
  `Fantasia` varchar(45) DEFAULT NULL,
  `CNPJ` varchar(45) DEFAULT NULL,
  `InscEstadual` varchar(45) DEFAULT NULL,
  `Telefone1` varchar(45) DEFAULT NULL,
  `Telefone2` varchar(45) DEFAULT NULL,
  `Fax` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Site` varchar(45) DEFAULT NULL,
  `Endereco` varchar(45) DEFAULT NULL,
  `Numero` varchar(45) DEFAULT NULL,
  `Bairro` varchar(45) DEFAULT NULL,
  `Cidade` varchar(45) DEFAULT NULL,
  `Estado` varchar(45) DEFAULT NULL,
  `CEP` varchar(45) DEFAULT NULL,
  `Observacoes` text,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Truncate table before insert `fornecedor`
--

TRUNCATE TABLE `fornecedor`;
--
-- Extraindo dados da tabela `fornecedor`
--

INSERT DELAYED IGNORE INTO `fornecedor` (`Codigo`, `Nome`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(1, 'ffffffffffffffffff', 'fffffffff', 'ffffffffffffff', 'ffffffffffffffffff', 'fffffffffffffffff', 'ffffffffffffffff', 'fffffffffffffff', 'ffffffffffff', 'ffffffffffffffff', 'fffffffffffffffff', 'ffffffffffffff', 'fffffffffff', 'fffffffffffffffff', 'AP ', 'ffffffffffffffffffff', 'fffffffffffffffff');
INSERT DELAYED IGNORE INTO `fornecedor` (`Codigo`, `Nome`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(2, 'uuuuuuuuu', 'uuuuuuuuuuuuuuuuuuuu', 'uuuuuu', 'uuuuuuuuu', 'uuuu', 'uuuuuuuuuuuuu', 'uuuuuuu', 'uuuuuuuuuuuuuu', 'uuuuuuuuuuuuuuuu', 'uuuuuuuuuuuuuu', 'uuuuuuuuuuuu', 'uuuuuuuuuuuuuuuuuuuu', 'uuuuuuuuuuuuuuuuuu', 'AP ', 'uuuuuuuuuuuuu', 'uuuuuuuuuuuuuuuuuuuuu');
INSERT DELAYED IGNORE INTO `fornecedor` (`Codigo`, `Nome`, `Fantasia`, `CNPJ`, `InscEstadual`, `Telefone1`, `Telefone2`, `Fax`, `Email`, `Site`, `Endereco`, `Numero`, `Bairro`, `Cidade`, `Estado`, `CEP`, `Observacoes`) VALUES(3, 'Marcia', 'Pretinha', '47535008968', '805967132', '35210067', '91302110', '', 'mrsegidio@gmail.com', '', '', '', '', '', 'SP ', '37904567', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--
-- Criação: 20-Jun-2014 às 02:36
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `idFuncionario` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) DEFAULT NULL,
  `CPF` varchar(11) DEFAULT NULL,
  `RG` varchar(9) DEFAULT NULL,
  `DataNascimento` varchar(10) DEFAULT NULL,
  `CatHabilitacao` varchar(20) DEFAULT NULL,
  `CNH` varchar(11) DEFAULT NULL,
  `PIS` varchar(20) DEFAULT NULL,
  `TelResidencial` varchar(10) DEFAULT NULL,
  `Celular` varchar(10) DEFAULT NULL,
  `Endereco` varchar(60) DEFAULT NULL,
  `NumEnd` varchar(10) DEFAULT NULL,
  `Bairro` varchar(45) DEFAULT NULL,
  `Cidade` varchar(45) DEFAULT NULL,
  `Estado` varchar(10) DEFAULT NULL,
  `CEP` varchar(10) DEFAULT NULL,
  `EstadoCivil` varchar(25) DEFAULT NULL,
  `Sexo` varchar(20) DEFAULT NULL,
  `Observacao` text,
  PRIMARY KEY (`idFuncionario`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Truncate table before insert `funcionario`
--

TRUNCATE TABLE `funcionario`;
--
-- Extraindo dados da tabela `funcionario`
--

INSERT DELAYED IGNORE INTO `funcionario` (`idFuncionario`, `Nome`, `CPF`, `RG`, `DataNascimento`, `CatHabilitacao`, `CNH`, `PIS`, `TelResidencial`, `Celular`, `Endereco`, `NumEnd`, `Bairro`, `Cidade`, `Estado`, `CEP`, `EstadoCivil`, `Sexo`, `Observacao`) VALUES(1, 'Douglas', '06820059671', '10403795', '03011982', 'NH', '', '', '35210067', '91646560', '', '', '', '', 'MG ', '', 'Solteiro(a)', 'Feminino', 'Fazendo teste');
INSERT DELAYED IGNORE INTO `funcionario` (`idFuncionario`, `Nome`, `CPF`, `RG`, `DataNascimento`, `CatHabilitacao`, `CNH`, `PIS`, `TelResidencial`, `Celular`, `Endereco`, `NumEnd`, `Bairro`, `Cidade`, `Estado`, `CEP`, `EstadoCivil`, `Sexo`, `Observacao`) VALUES(2, 'Italo', '47535008968', '10403987', '', 'NH', '', '', '35224249', '91302110', '', '', '', '', 'UF', '', '***   Selecione   ***', 'Feminino', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--
-- Criação: 23-Jun-2014 às 13:01
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(25) DEFAULT NULL,
  `senha` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Truncate table before insert `login`
--

TRUNCATE TABLE `login`;
--
-- Extraindo dados da tabela `login`
--

INSERT DELAYED IGNORE INTO `login` (`codigo`, `nome`, `senha`) VALUES(1, 'logexpress', '123');

-- --------------------------------------------------------

--
-- Estrutura da tabela `manutencaopneus`
--
-- Criação: 20-Jun-2014 às 14:10
--

DROP TABLE IF EXISTS `manutencaopneus`;
CREATE TABLE IF NOT EXISTS `manutencaopneus` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `DataEntrada` varchar(45) DEFAULT NULL,
  `Reparo1` varchar(45) DEFAULT NULL,
  `Reparo2` varchar(45) DEFAULT NULL,
  `Reparo3` varchar(45) DEFAULT NULL,
  `Orcamento` varchar(45) DEFAULT NULL,
  `DataSaida` varchar(45) DEFAULT NULL,
  `Observacao` text,
  `CodVeiculo` int(11) NOT NULL,
  `Codfornecedor` int(11) NOT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `fk_manutencaopneus_veiculo1_idx` (`CodVeiculo`),
  KEY `fk_manutencaopneus_fornecedor1_idx` (`Codfornecedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Truncate table before insert `manutencaopneus`
--

TRUNCATE TABLE `manutencaopneus`;
--
-- Extraindo dados da tabela `manutencaopneus`
--

INSERT DELAYED IGNORE INTO `manutencaopneus` (`Codigo`, `DataEntrada`, `Reparo1`, `Reparo2`, `Reparo3`, `Orcamento`, `DataSaida`, `Observacao`, `CodVeiculo`, `Codfornecedor`) VALUES(1, 'safdf', 'Item 3', 'Item 2', 'Item 2', 'asdf', 'asdfsdf', 'sadfsdafsdfsd', 2, 1);
INSERT DELAYED IGNORE INTO `manutencaopneus` (`Codigo`, `DataEntrada`, `Reparo1`, `Reparo2`, `Reparo3`, `Orcamento`, `DataSaida`, `Observacao`, `CodVeiculo`, `Codfornecedor`) VALUES(2, 'dfghfdg', 'Item 1', 'Item 2', 'Item 3', 'dfhfdh', 'dfhfgh', 'dfghdffdhfgdhfdhdf', 3, 2);
INSERT DELAYED IGNORE INTO `manutencaopneus` (`Codigo`, `DataEntrada`, `Reparo1`, `Reparo2`, `Reparo3`, `Orcamento`, `DataSaida`, `Observacao`, `CodVeiculo`, `Codfornecedor`) VALUES(3, 'dfghfdg', 'Rodizio', 'Rodizio', 'Rodizio', 'dfhfdh', 'dfhfgh', 'dfghdffdhfgdhfdhdf', 3, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `manutencaoveiculo`
--
-- Criação: 20-Jun-2014 às 02:36
--

DROP TABLE IF EXISTS `manutencaoveiculo`;
CREATE TABLE IF NOT EXISTS `manutencaoveiculo` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `DataEntrada` varchar(45) DEFAULT NULL,
  `reparo1` varchar(45) DEFAULT NULL,
  `Reparo2` varchar(45) DEFAULT NULL,
  `Reparo3` varchar(45) DEFAULT NULL,
  `Orcamento` varchar(45) DEFAULT NULL,
  `DataSaida` varchar(45) DEFAULT NULL,
  `Observacao` text,
  `CodVeiculo` int(11) NOT NULL,
  `CodFornecedor` int(11) NOT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `fk_manutencaoveiculo_veiculo1_idx` (`CodVeiculo`),
  KEY `fk_manutencaoveiculo_fornecedor1_idx` (`CodFornecedor`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Truncate table before insert `manutencaoveiculo`
--

TRUNCATE TABLE `manutencaoveiculo`;
--
-- Extraindo dados da tabela `manutencaoveiculo`
--

INSERT DELAYED IGNORE INTO `manutencaoveiculo` (`Codigo`, `DataEntrada`, `reparo1`, `Reparo2`, `Reparo3`, `Orcamento`, `DataSaida`, `Observacao`, `CodVeiculo`, `CodFornecedor`) VALUES(1, 'sdfgdfg', 'Eletrico', 'Sem Reparo', 'Sem Reparo', 'dfgdg', 'dsfgfg', 'dsfggsdfgdf', 2, 1);
INSERT DELAYED IGNORE INTO `manutencaoveiculo` (`Codigo`, `DataEntrada`, `reparo1`, `Reparo2`, `Reparo3`, `Orcamento`, `DataSaida`, `Observacao`, `CodVeiculo`, `CodFornecedor`) VALUES(2, 'fdgsfg', 'Item 1', 'Item 1', 'Item 1', 'dfsgfds', 'dsfgdsfg', 'sdfgsdfgdsfg', 3, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ordementrega`
--
-- Criação: 20-Jun-2014 às 02:36
--

DROP TABLE IF EXISTS `ordementrega`;
CREATE TABLE IF NOT EXISTS `ordementrega` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `TipoMercadoria` varchar(45) DEFAULT NULL,
  `QuantMercadoria` varchar(45) DEFAULT NULL,
  `EspecieMerc` varchar(45) DEFAULT NULL,
  `Peso` varchar(45) DEFAULT NULL,
  `MetroCubico` varchar(45) DEFAULT NULL,
  `NotaFiscal` varchar(45) DEFAULT NULL,
  `Observacao` text,
  `CodCliente` int(11) NOT NULL,
  `CodDestinatario` int(11) NOT NULL,
  `CodVeiculo` int(11) NOT NULL,
  PRIMARY KEY (`Codigo`),
  KEY `fk_ordementrega_clientes_idx` (`CodCliente`),
  KEY `fk_ordementrega_destinatario1_idx` (`CodDestinatario`),
  KEY `fk_ordementrega_veiculo1_idx` (`CodVeiculo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=13 ;

--
-- Truncate table before insert `ordementrega`
--

TRUNCATE TABLE `ordementrega`;
--
-- Extraindo dados da tabela `ordementrega`
--

INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(1, 'ertert', 'ert', 'Eletronico', 'treterretrrertert', 'tertretre', '654', 'teste524outro teste', 1, 1, 2);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(2, 'Televisão', '5', 'eletronico', '35', '100', '3284', 'teste524testando agoratestando agoratestando agora123456Chegando em Belo HorizonteChegando em Belo Horizonte', 1, 1, 2);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(3, 'sdadASDASD', 'ASDA', 'ASDASD', 'ASDASD', 'ASDASDASD', 'ASDASD', 'teste524', 5, 2, 2);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(4, 'fghgfdhg', 'sadfsd', 'fdhfhfd', 'hdfgd', 'gdhdfd', 'fghdfg', 'teste524', 5, 2, 3);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(5, 'hgkhjkg', 'hjk', 'hgkhjk', 'hgkhjjh', 'hjkgh', 'kghjkhj', 'teste524', 5, 2, 3);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(7, 'televisão', '5', '654', '100', '300', '321654', 'teste524', 5, 2, 3);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(8, 'sdgdg', 'dfsgdf', 'dfg', 'dsfgd', 'dsfgsdsdf', 'dfgssdf', 'teste524', 5, 2, 3);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(9, 'hfghgdfgf', 'fgdhgf', 'hdd', 'fdhdfg', 'fgdhdf', 'fhfdgh', 'teste524', 5, 2, 1);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(10, 'bcvxbcvb', 'cvxbxcv', 'xcvbcxvb', 'cvb', 'cvxbcxvb', 'cvxbxcv', 'teste524', 5, 2, 3);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(11, 'ertert', 'ert', 'Eletronico', 'treterretrrertert', 'tertretre', '6542', 'teste524', 1, 2, 2);
INSERT DELAYED IGNORE INTO `ordementrega` (`Codigo`, `TipoMercadoria`, `QuantMercadoria`, `EspecieMerc`, `Peso`, `MetroCubico`, `NotaFiscal`, `Observacao`, `CodCliente`, `CodDestinatario`, `CodVeiculo`) VALUES(12, 'Forno Micro Ondas', '2', 'eletrodomestico', '80', '250', '321654', 'Saira 12:00 para entrega 16/04/2014', 5, 2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--
-- Criação: 20-Jun-2014 às 02:36
--

DROP TABLE IF EXISTS `veiculo`;
CREATE TABLE IF NOT EXISTS `veiculo` (
  `Codigo` int(11) NOT NULL AUTO_INCREMENT,
  `Placa` varchar(45) DEFAULT NULL,
  `TipoVeiculo` varchar(45) DEFAULT NULL,
  `Fabricacao` varchar(45) DEFAULT NULL,
  `Modelo` varchar(45) DEFAULT NULL,
  `Ano` varchar(45) DEFAULT NULL,
  `renavam` varchar(45) DEFAULT NULL,
  `Chassi` varchar(45) DEFAULT NULL,
  `TipoPneu` varchar(20) DEFAULT NULL,
  `TipoCombustivel` varchar(20) DEFAULT NULL,
  `Tara` varchar(20) DEFAULT NULL,
  `PesoLiquido` varchar(25) DEFAULT NULL,
  `Observacao` text,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Truncate table before insert `veiculo`
--

TRUNCATE TABLE `veiculo`;
--
-- Extraindo dados da tabela `veiculo`
--

INSERT DELAYED IGNORE INTO `veiculo` (`Codigo`, `Placa`, `TipoVeiculo`, `Fabricacao`, `Modelo`, `Ano`, `renavam`, `Chassi`, `TipoPneu`, `TipoCombustivel`, `Tara`, `PesoLiquido`, `Observacao`) VALUES(1, 'gjf1111', 'Carro', 'Chevrolet', 'Vectra', '1994', 'uuuuuuuuuuuuuuu', 'uuuuuuuuuuuu', 'uuuuuuuuuuuuuuuu', 'Gasolina', 'uuuuuuuuuuuuuuuuuuuu', 'uuuuuuuuuuuuuuuuuuu', 'uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu');
INSERT DELAYED IGNORE INTO `veiculo` (`Codigo`, `Placa`, `TipoVeiculo`, `Fabricacao`, `Modelo`, `Ano`, `renavam`, `Chassi`, `TipoPneu`, `TipoCombustivel`, `Tara`, `PesoLiquido`, `Observacao`) VALUES(2, 'mmmmm', 'Item 2', 'mmmmmm', 'mmmmmmm', 'mm', 'mmmmmmm', 'mmmmmmm', 'mmm', 'Item 1', 'mmmmm', 'mmmm', 'mmmmmmmmmmmmmmm');
INSERT DELAYED IGNORE INTO `veiculo` (`Codigo`, `Placa`, `TipoVeiculo`, `Fabricacao`, `Modelo`, `Ano`, `renavam`, `Chassi`, `TipoPneu`, `TipoCombustivel`, `Tara`, `PesoLiquido`, `Observacao`) VALUES(3, 'bbbb', 'Item 2', 'cccccccccc', 'dddddddddddddf', 'ffffffffffffe', 'eeeeeeeeeeeeh', 'sssss', 'hhhhhhhhhhhhh', 'Item 3', 'xxxxxxxxxxxx', 'vvvvvvvvvv', 'mmmmmmmmmmmmmmm');

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `controlecombustivel`
--
ALTER TABLE `controlecombustivel`
  ADD CONSTRAINT `fk_controlecombustivel_fornecedor1` FOREIGN KEY (`CodFornecedor`) REFERENCES `fornecedor` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_controlecombustivel_veiculo1` FOREIGN KEY (`CodVeiculo`) REFERENCES `veiculo` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `manutencaopneus`
--
ALTER TABLE `manutencaopneus`
  ADD CONSTRAINT `fk_manutencaopneus_fornecedor1` FOREIGN KEY (`Codfornecedor`) REFERENCES `fornecedor` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_manutencaopneus_veiculo1` FOREIGN KEY (`CodVeiculo`) REFERENCES `veiculo` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `manutencaoveiculo`
--
ALTER TABLE `manutencaoveiculo`
  ADD CONSTRAINT `fk_manutencaoveiculo_fornecedor1` FOREIGN KEY (`CodFornecedor`) REFERENCES `fornecedor` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_manutencaoveiculo_veiculo1` FOREIGN KEY (`CodVeiculo`) REFERENCES `veiculo` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `ordementrega`
--
ALTER TABLE `ordementrega`
  ADD CONSTRAINT `fk_ordementrega_clientes` FOREIGN KEY (`CodCliente`) REFERENCES `clientes` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ordementrega_destinatario1` FOREIGN KEY (`CodDestinatario`) REFERENCES `destinatario` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_ordementrega_veiculo1` FOREIGN KEY (`CodVeiculo`) REFERENCES `veiculo` (`Codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
