create database LOG_EXPRESS;
USE LOG_EXPRESS;
CREATE TABLE CADFUNCIONARIO
 (    codfuncionario int primary key auto_increment,
		nome varchar(30) not null,
		cpf varchar (11) not null,
		rg varchar (9) not null,
		datanascimento varchar(10), 
		cathabilitacao varchar (2),
		cnh varchar (11),
		ctps varchar (7),
		pis varchar (13),
		telresidencial varchar (12),
		celular varchar (11),
		endereco varchar (60),
		numero varchar (5),
		bairro varchar (30),
		cidade varchar (20),
		estado varchar (25),
		cep varchar (8),
		observacoes varchar (80)
);

create table cadveiculo
( 
	codveiculo int primary key not null auto_increment,
	placa varchar (8) not null,
	tipoveiculo varchar (10),
	fabricante varchar (12),
	modelo varchar (12),
	ano	varchar (4),
	renavan varchar (10),
	chassi varchar (19),
	observacoes varchar (80)
);

create table cadfornecedor 
(
	codfornecedor int primary Key not null auto_increment,
	nomerazaosocial varchar (30) not null,
	nomefantasia varchar (16) not null,
	cnpjcpf varchar (21) not null,
	inscestadual varchar (25) not null,
	telefone1 varchar (12),
	telefone2 varchar (12),
	fax varchar (12),
	email varchar (45),
	site varchar (14),
	endereco varchar (60),
	numero varchar (5),
	bairro varchar (30),
	cidade varchar (20),
	estado varchar (25),
	cep varchar (8),
	observacoes varchar (80)
);

create table cadcliente(
 nomerazaosocial int primary Key not null auto_increment,



);



