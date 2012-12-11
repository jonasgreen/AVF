package com.avf.client.model;

/**
 *
 */
public abstract class Model<M extends Meta> {
    private ModelId id;
    private M meta;

    protected Model() {
    }

    protected Model(M meta) {
        this.meta = meta;
    }

    protected Model(ModelId id, M meta) {
        this.id = id;
        this.meta = meta;
    }

    public ModelId getId() {
        return id;
    }

    public M getMeta() {
        return meta;
    }
}
