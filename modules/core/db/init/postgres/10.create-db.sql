-- begin FINZPIX_USUARIOS
create table FINZPIX_USUARIOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOMBRE varchar(255) not null,
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end FINZPIX_USUARIOS
-- begin FINZPIX_EGRESO
create table FINZPIX_EGRESO (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIPO_ID uuid not null,
    USUARIO_ID uuid not null,
    DESCRIPCION varchar(255) not null,
    CANTIDAD double precision not null,
    FECHA date not null,
    --
    primary key (ID)
)^
-- end FINZPIX_EGRESO
-- begin FINZPIX_BALANCE
create table FINZPIX_BALANCE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPCION varchar(255) not null,
    BALANCE double precision not null,
    --
    primary key (ID)
)^
-- end FINZPIX_BALANCE
-- begin FINZPIX_INGRESOS
create table FINZPIX_INGRESOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIPO varchar(150),
    USUARIO_ID uuid not null,
    CANTIDAD double precision not null,
    --
    primary key (ID)
)^
-- end FINZPIX_INGRESOS
-- begin FINZPIX_TIPO_EGRESOS
create table FINZPIX_TIPO_EGRESOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIPO varchar(150) not null,
    CATEGORIA_ID uuid not null,
    --
    primary key (ID)
)^
-- end FINZPIX_TIPO_EGRESOS
-- begin FINZPIX_CATEGORIA_EGRESOS
create table FINZPIX_CATEGORIA_EGRESOS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CATEGORIA varchar(100) not null,
    --
    primary key (ID)
)^
-- end FINZPIX_CATEGORIA_EGRESOS
