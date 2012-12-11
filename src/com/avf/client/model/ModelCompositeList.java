package com.avf.client.model;

/**
 *
 */
public class ModelCompositeList extends Model<MetaList>{
    private ModelCompositeList() {

    }

    public ModelCompositeList(MetaList meta) {
        super(meta);
    }

    public ModelCompositeList(ModelId id, MetaList meta) {
        super(id, meta);
    }
}
