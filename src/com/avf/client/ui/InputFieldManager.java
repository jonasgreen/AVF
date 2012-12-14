package com.avf.client.ui;

import com.avf.client.model.CommandModel;
import com.avf.client.model.Meta;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class InputFieldManager implements ValidationChangedHandler {

    private Map<Meta, HasData> bindingMap = new HashMap<Meta, HasData>();
    private CommandModel cmdModel;

    public InputFieldManager(CommandModel cmdModel) {
        this.cmdModel = cmdModel;
    }

    public void bind(Meta metaKey, HasData hasData){
        hasData.addDataChangedListener(this);
        bindingMap.put(metaKey, hasData);
    }


    public void onChange() {

    }
}
