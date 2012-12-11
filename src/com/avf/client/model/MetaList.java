package com.avf.client.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class MetaList<M extends Meta> extends MetaCollection{
    private M content;
    private List<Meta> list = new ArrayList<Meta>();

    protected MetaList() {
    }

    public MetaList(MetaCollection parent, String name, String clazz) {
        super(parent, name, clazz);
    }

    @Override
    public List<Meta> getChildren() {
        return new ArrayList<Meta>(list);
    }

    @Override
    void add(Meta child) {
        list.add(child);
    }


}
