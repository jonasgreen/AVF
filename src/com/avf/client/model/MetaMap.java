package com.avf.client.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class MetaMap extends MetaCollection{

    private Set<Meta> children = new HashSet<Meta>();

    protected MetaMap() {
    }

    @Override
    public List<Meta> getChildren() {
        return new ArrayList<Meta>(children);
    }

    @Override
    void add(Meta child) {
        children.add(child);
    }

    protected MetaMap(MetaCollection parent, String name, String clazz) {
        super(parent, name, clazz);
    }

}
