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
);