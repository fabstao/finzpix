package com.company.finzpix.service;

import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Random;

@Service(BalanceCalcService.NAME)
public class BalanceCalcServiceBean implements BalanceCalcService {
    @Inject
    private DataManager dataManager;

    @Override
    public double regresaBalance(LocalDateTime fechaInicio, LocalDateTime fechaTermino) {
        double sumaIngresos;
        double sumaEgresos;
        sumaIngresos = dataManager.loadValue("select sum(s.cantidad) from finzpix_Ingresos s where (s.fecha between :fechaInicio and :fechaTermino)", Double.class )
                .parameter("fechaInicio", fechaInicio)
                .parameter("fechaTermino", fechaTermino)
                .one();
        sumaEgresos = dataManager.loadValue("select sum(s.cantidad) from finzpix_Egreso s where (s.fecha between :fechaInicio and :fechaTermino)", Double.class )
                .parameter("fechaInicio", fechaInicio)
                .parameter("fechaTermino", fechaTermino)
                .one();
        return sumaIngresos-sumaEgresos;
    }

    public double gastoPorCategoria(String categoria,LocalDateTime fechaInicio, LocalDateTime fechaTermino) {
        Random tid = new Random();
        int ntid = tid.nextInt(9999);
        String temptable = "temp_" + String.valueOf(ntid);
        double gasto = 0;
        dataManager.loadValues("select tipos.id into :tableName from finzpix_tipo_egresos as tipos left join finzpix_categoria_egresos as cats on tipos.categoria_id=cats.id\n" +
                "where cats.categoria=:categoria")
                .parameter("categoria", categoria)
                .parameter("tableName", temptable);
        gasto = dataManager.loadValue("select sum(s.cantidad) from finzpix_egreso as s " +
                        "where (s.fecha between :fechaInicio and :fechaTermino) and s.tipo_id=(select tipos.id "+
                        " from finzpix_tipo_egresos as tipos where  tipos.categoria_id=(select cats.id from " +
                        "finzpix_categoria_egresos as cats where cats.categoria='CASA'))",
                Double.class )
                .parameter("fechaInicio", fechaInicio)
                .parameter("fechaTermino", fechaTermino)
                .parameter("categoria", categoria)
                .one();
        dataManager.loadValues("drop table temp_123");
        return gasto;
    }
}