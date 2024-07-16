create table topicos(

    id bigint not null auto_increment,
    usuario varchar(100) not null unique,
    titulo varchar(100) not null,
    mensaje varchar(100) not null,
    fecha varchar(100) not null,
    status varchar(100) not null,
    autor varchar(100) not null unique,
    curso varchar(100) not null,

    primary key(id)
)