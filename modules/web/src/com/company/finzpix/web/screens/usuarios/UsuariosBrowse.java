package com.company.finzpix.web.screens.usuarios;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Usuarios;

@UiController("finzpix_Usuarios.browse")
@UiDescriptor("usuarios-browse.xml")
@LookupComponent("usuariosesTable")
@LoadDataBeforeShow
public class UsuariosBrowse extends StandardLookup<Usuarios> {
}