alter table FINZPIX_EGRESO rename column fecha to fecha__u58914 ;
alter table FINZPIX_EGRESO alter column fecha__u58914 drop not null ;
alter table FINZPIX_EGRESO add column FECHA timestamp ^
update FINZPIX_EGRESO set FECHA = current_timestamp where FECHA is null ;
alter table FINZPIX_EGRESO alter column FECHA set not null ;
