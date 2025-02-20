create database ProjetoFinal;

use ProjetoFinal;

create table cadastrarlivro(
ISBN varChar(100) primary key not null,
Titulo varChar(100),
Autor varChar(100),
Genero varChar(100)
);
select * from cadastrarlivro;

create table cadastrarexemplar(
Codigo varChar(100) primary key not null,
ISBN varChar(100)
);
select * from cadastrarexemplar;

create table cadastrarusuario(
Nome varChar(100) primary key not null,
Email varChar(100),
Telefone varChar(100),
DataNascimento varChar(100),
Endereco varChar(100),
TipoUsuario varChar(100),
Senha varChar(100)
);
select * from cadastrarusuario;

create table emprestarlivro(
codigo varChar(100) primary key not null,
nomeUsuario varChar(100),
dataemprestimo varChar(100),
datadevolucao varChar(100),
statusEmprestimo varChar(100),
senha varChar(100)
);
select * from emprestarlivro;