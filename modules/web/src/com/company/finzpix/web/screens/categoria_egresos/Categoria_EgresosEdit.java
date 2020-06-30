package com.company.finzpix.web.screens.categoria_egresos;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Categoria_Egresos;

@UiController("finzpix_Categoria_Egresos.edit")
@UiDescriptor("categoria_egresos-edit.xml")
@EditedEntityContainer("categoria_EgresosDc")
@LoadDataBeforeShow
public class Categoria_EgresosEdit extends StandardEditor<Categoria_Egresos> {
}