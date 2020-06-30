package com.company.finzpix.web.screens.tipo_egresos;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Tipo_Egresos;

@UiController("finzpix_Tipo_Egresos.edit")
@UiDescriptor("tipo_egresos-edit.xml")
@EditedEntityContainer("tipo_EgresosDc")
@LoadDataBeforeShow
public class Tipo_EgresosEdit extends StandardEditor<Tipo_Egresos> {
}