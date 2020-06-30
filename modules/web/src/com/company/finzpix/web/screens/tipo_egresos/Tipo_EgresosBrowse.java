package com.company.finzpix.web.screens.tipo_egresos;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Tipo_Egresos;

@UiController("finzpix_Tipo_Egresos.browse")
@UiDescriptor("tipo_egresos-browse.xml")
@LookupComponent("tipo_EgresosesTable")
@LoadDataBeforeShow
public class Tipo_EgresosBrowse extends StandardLookup<Tipo_Egresos> {
}