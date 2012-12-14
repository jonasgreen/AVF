package com.avf.client.ui;

import com.avf.client.model.CommandModel;

/**
 *
 */
public class ValidatorManager {
    private CommandModel cmdModel;

    public ValidatorManager(CommandModel cmdModel) {
        this.cmdModel = cmdModel;
    }

    public void addValidationChangedHandler(ValidationChangedHandler handler) {

    }
}
