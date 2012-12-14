package com.avf.client.ui;

import com.avf.client.model.Meta;

/**
 *
 */
public class DataChangedEvent {
    private Meta meta;
    private String value;

    public DataChangedEvent(Meta meta, String value) {
        this.meta = meta;
        this.value = value;
    }

    public Meta getMeta() {
        return meta;
    }

    public String getValue() {
        return value;
    }
}
