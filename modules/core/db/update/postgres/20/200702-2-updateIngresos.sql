alter table FINZPIX_INGRESOS add column FECHA timestamp ^
update FINZPIX_INGRESOS set FECHA = current_timestamp where FECHA is null ;
alter table FINZPIX_INGRESOS alter column FECHA set not null ;
