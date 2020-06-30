package com.company.finzpix.web.screens.egreso;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Egreso;

@UiController("finzpix_Egreso.edit")
@UiDescriptor("egreso-edit.xml")
@EditedEntityContainer("egresoDc")
@LoadDataBeforeShow
public class EgresoEdit extends StandardEditor<Egreso> {
}