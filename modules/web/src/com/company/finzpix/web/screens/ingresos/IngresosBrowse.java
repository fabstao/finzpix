package com.company.finzpix.web.screens.ingresos;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Ingresos;

@UiController("finzpix_Ingresos.browse")
@UiDescriptor("ingresos-browse.xml")
@LookupComponent("ingresosesTable")
@LoadDataBeforeShow
public class IngresosBrowse extends StandardLookup<Ingresos> {
}