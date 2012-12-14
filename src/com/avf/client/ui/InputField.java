package com.avf.client.ui;

import com.google.gwt.user.client.ui.InsertPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 */
public interface InputField extends InsertPanel.ForIsWidget {

    public Widget getWidget();
    public Label getLabel();

}
