package com.company.finzpix.web.screens.balance;

import com.haulmont.cuba.gui.screen.*;
import com.company.finzpix.entity.Balance;

@UiController("finzpix_Balance.browse")
@UiDescriptor("balance-browse.xml")
@LookupComponent("balancesTable")
@LoadDataBeforeShow
public class BalanceBrowse extends StandardLookup<Balance> {
}