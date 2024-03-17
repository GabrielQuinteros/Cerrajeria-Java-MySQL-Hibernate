/* CREADO DE BASE DE DATOS
create database cerrajeria;
use cerrajeria;
*/
/* CREADO DE TABLAS
create table Marca
(
	id int primary key,
    nombre varchar(30)
)
create table Categoria
(
	id int primary key,
    nombre varchar(30)
)
create table Producto(
	id int primary key,
    nombre varchar(60),
    descripcion varchar(100),
    precio double,
    marca_id int,
    categoria_id int,
	foreign key(marca_id) references Marca( id ),
    foreign key(categoria_id) references Categoria( id )
)
*/

/* CREACION DE REGISTROS DE LAS TABLAS
insert into Marca ( id, nombre ) values (1,'PRIVE'), (2,'ABC'), (3,'ACYTRA'), (4,'ANUAC'), (5,'ANDIF'), (6,'CANDEX'), (7,'CANOA'),
(8,'DAC'), (9,'BRONZEN'), (10,'EVERLOCK'), (11,'GIACO'), (12,'KALLAY'), (13,'LUBER'), (14,'MAC'), (15,'8 BLOQ'), (16,'ROA'),
(17,'TRABEX'), (18,'VAN-2000'), (19,'SEKUR'), (20,'CANDADO 606'), (21,'CERRATEX'), (22,'YALTRES')

insert into categoria (id, nombre) VALUES (1,'CERROJO'), (2,'CERRADURA COMUN'),(3,'CANDADO'),(4,'CILINDRO'),(5,'PESTILLO ELECTRICO'),
(6,'CERRADURA CON CILINDRO'), (7,'CERRADURA DOBLE PALETA'), (8,'PASADOR'), (9,'CERRADURA DE MUEBLE')

*/





