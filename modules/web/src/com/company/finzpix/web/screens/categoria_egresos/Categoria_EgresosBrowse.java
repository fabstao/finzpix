package com.company.finzpix.web.screens.categoria_egresos;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Categoria_Egresos;

@UiController("finzpix_Categoria_Egresos.browse")
@UiDescriptor("categoria_egresos-browse.xml")
@LookupComponent("categoria_EgresosesTable")
@LoadDataBeforeShow
public class Categoria_EgresosBrowse extends StandardLookup<Categoria_Egresos> {
}