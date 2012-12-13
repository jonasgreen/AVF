package com.avf.client.ui;

import com.avf.client.model.Meta;
import com.avf.client.model.MetaCommand;
import com.avf.client.model.ModelComposite;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class InputFieldManager implements DataChangedHandler{

    private Map<Meta, HasData> bindingMap = new HashMap<Meta, HasData>();
    private ModelComposite model;
    private MetaCommand metaCommand;
    //private Frame commandFrame; TODO

    public InputFieldManager(MetaCommand metaCmd) {
        this.metaCommand = metaCmd;
        this.model = new ModelComposite(metaCmd);

    }

    public void bind(Meta metaKey, HasData hasData){
        hasData.addDataChangedListener(this);
        bindingMap.put(metaKey, hasData);
    }





    public void onChange(DataChangedEvent event) {

    }
}
