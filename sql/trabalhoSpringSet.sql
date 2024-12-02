create database trabalhoSpring;
use trabalhoSpring;

create table produto (id INT(4) auto_increment, 
nome varchar(30) not null, 
descricao varchar(60) not null, 
preco double(4, 2) not null, 
estoque int(4) not null,   
PRIMARY KEY(id));