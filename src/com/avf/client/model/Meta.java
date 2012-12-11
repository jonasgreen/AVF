package com.avf.client.model;

/**
 *
 */
public abstract class Meta {
    private MetaCollection parent;
    private String name;
    private String clazz;

    protected Meta() {
    }

    protected Meta(MetaCollection parent, String name, String clazz) {
        this.parent = parent;
        this.name = name;
        this.clazz = clazz;
        parent.add(this);
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }
}
