create unique index IDX_FINZPIX_USUARIOS_UNQ on FINZPIX_USUARIOS (ID) where DELETE_TS is null ;
create unique index IDX_FINZPIX_USUARIOS_UK_NOMBRE on FINZPIX_USUARIOS (NOMBRE) where DELETE_TS is null ;
