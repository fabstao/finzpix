-- alter table FINZPIX_TIPO_EGRESOS add column CATEGORIA_ID uuid ^
-- update FINZPIX_TIPO_EGRESOS set CATEGORIA_ID = <default_value> ;
-- alter table FINZPIX_TIPO_EGRESOS alter column CATEGORIA_ID set not null ;
alter table FINZPIX_TIPO_EGRESOS add column CATEGORIA_ID uuid not null ;
