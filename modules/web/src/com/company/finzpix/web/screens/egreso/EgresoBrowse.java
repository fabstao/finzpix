package com.company.finzpix.web.screens.egreso;

import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Egreso;

@UiController("finzpix_Egreso.browse")
@UiDescriptor("egreso-browse.xml")
@LookupComponent("egresoesTable")
@LoadDataBeforeShow
public class EgresoBrowse extends StandardLookup<Egreso> {
}