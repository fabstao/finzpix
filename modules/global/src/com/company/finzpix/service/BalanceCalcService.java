package com.company.finzpix.service;

import java.time.LocalDateTime;

public interface BalanceCalcService {
    String NAME = "finzpix_BalanceCalcService";
    double regresaBalance(LocalDateTime fechaInicio, LocalDateTime fechaTermino);

    double gastoPorCategoria(String categoria,LocalDateTime fechaInicio, LocalDateTime fechaTermino);

}