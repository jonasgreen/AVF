package com.avf.client.model;

import java.util.List;

/**
 *
 */
public abstract class MetaCollection extends Meta{

    protected MetaCollection() {
    }

    protected MetaCollection(MetaCollection parent, String name, String clazz) {
        super(parent, name, clazz);
    }

    public abstract List<Meta> getChildren();
    abstract void add(Meta child);
}
