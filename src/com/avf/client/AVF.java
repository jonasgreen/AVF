package com.avf.client;

import com.avf.client.metacommands.changetargetsplit.ChangeTargetSplitCommandMeta;
import com.avf.client.model.CommandModel;
import com.avf.client.ui.CommandFactory;
import com.avf.client.ui.InputField;
import com.avf.client.ui.ValidationChangedHandler;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class AVF implements EntryPoint {
    public void onModuleLoad() {

        FlowPanel panel = new FlowPanel();
        RootPanel.get("panel").add(panel);


        ChangeTargetSplitCommandMeta cmdMeta = new ChangeTargetSplitCommandMeta();
        CommandFactory cf = new CommandFactory(cmdMeta);

        //Different ways to create input fields
        TextBox textBox = new TextBox();
        InputField inputField = cf.bind(cmdMeta.switchDate, textBox);

        //Generic creation
        InputField pctWidget = cf.bind(cmdMeta.targetFundSplit.pct);


        cf.addValidationChangedHandler(new ValidationChangedHandler() {
            public void onChange() {
                onValidationChange();
            }
        });

        if (cf.isValid()) {
            CommandModel model = cf.getModel();
            //BackendService.getInstance.executeCommand(model);
        }


    }

    private void onValidationChange() {

    }
}
