package com.company.finzpix.web.screens.usuarios;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Usuarios;

@UiController("finzpix_Usuarios.edit")
@UiDescriptor("usuarios-edit.xml")
@EditedEntityContainer("usuariosDc")
@LoadDataBeforeShow
public class UsuariosEdit extends StandardEditor<Usuarios> {
}