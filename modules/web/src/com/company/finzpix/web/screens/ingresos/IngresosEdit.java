package com.company.finzpix.web.screens.ingresos;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Ingresos;

@UiController("finzpix_Ingresos.edit")
@UiDescriptor("ingresos-edit.xml")
@EditedEntityContainer("ingresosDc")
@LoadDataBeforeShow
public class IngresosEdit extends StandardEditor<Ingresos> {
}