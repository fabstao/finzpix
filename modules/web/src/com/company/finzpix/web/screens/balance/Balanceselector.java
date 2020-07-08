package com.company.finzpix.web.screens.balance;

import com.company.finzpix.service.BalanceCalcService;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@UiController("finzpix_Balanceselector")
@UiDescriptor("BalanceSelector.xml")
public class Balanceselector extends Screen {
    @Inject
    private DateField<Date> fechaInicio;
    @Inject
    private BalanceCalcService balanceCalcService;

    @Inject
    private TextArea<String> balanceText;
    @Inject
    private DateField<Date> fechaTermino;

    @Subscribe("botonSelector")
    public void onBotonSelectorClick(Button.ClickEvent event) {
        fechaTerminoValidator(fechaTermino.getValue());
        LocalDateTime fein = LocalDateTime.ofInstant(fechaInicio.getValue().toInstant(), ZoneId.systemDefault());
        LocalDateTime fete = LocalDateTime.ofInstant(fechaTermino.getValue().toInstant(), ZoneId.systemDefault());
        double balance = balanceCalcService.regresaBalance(fein, fete);
        balanceText.setValue(Double.toString(balance));
    }

    @Install(to = "fechaTermino", subject = "validator")
    private void fechaTerminoValidator(Date date) {
        if(fechaInicio.getValue().compareTo(date) >0) {
            fechaTermino.clear();
        }
    }

    @Install(to = "fechaInicio", subject = "validator")
    private void fechaInicioValidator(Date date) {
        if(date == null) {
            fechaInicio.clear();
        }
    }





    @Subscribe("balanceText")
    public void onBalanceTextValueChange(HasValue.ValueChangeEvent<String> event) {

    }


    //@Subscribe("balanceselector")
    protected void balanceselector(Action.ActionPerformedEvent event) {


    }

}