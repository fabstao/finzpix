alter table FINZPIX_BALANCE add column FECHA_INICIO timestamp ^
update FINZPIX_BALANCE set FECHA_INICIO = current_timestamp where FECHA_INICIO is null ;
alter table FINZPIX_BALANCE alter column FECHA_INICIO set not null ;
alter table FINZPIX_BALANCE add column FECHA_TERMINO timestamp ^
update FINZPIX_BALANCE set FECHA_TERMINO = current_timestamp where FECHA_TERMINO is null ;
alter table FINZPIX_BALANCE alter column FECHA_TERMINO set not null ;
