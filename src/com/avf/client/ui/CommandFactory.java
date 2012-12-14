package com.avf.client.ui;

import com.avf.client.model.CommandModel;
import com.avf.client.model.MetaCommand;
import com.avf.client.model.MetaValue;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 */
public class CommandFactory{

    private InputFieldManager inputFieldManager;
    private ValidatorManager validationManager;

    private CommandModel cmdModel;


    public CommandFactory(MetaCommand meta) {
        cmdModel = new CommandModel(meta);
        inputFieldManager = new InputFieldManager(cmdModel);
        validationManager = new ValidatorManager(cmdModel);
    }


    public InputField bind(MetaValue switchDate, Widget widget) {
        return null;
    }

    public InputField bind(MetaValue pct) {
        return null;
    }

    public CommandModel getModel() {
        return null;
    }


    public void addValidationChangedHandler(ValidationChangedHandler handler){
        validationManager.addValidationChangedHandler(handler);
    }

    public boolean isValid() {
        return false;  //To change body of created methods use File | Settings | File Templates.
    }
}
