create table FINZPIX_TEST_CATEGORIA (
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
    CATEGORIA_ID uuid not null,
    CAMPO double precision not null,
    --
    primary key (ID)
);