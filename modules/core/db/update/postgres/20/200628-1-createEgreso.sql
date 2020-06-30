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
);