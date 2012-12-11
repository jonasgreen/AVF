package com.avf.client.model;

/**
 *
 */
public class ModelComposite extends Model<MetaMap>{

    private ModelComposite() {
    }

    public ModelComposite(MetaMap meta) {
        super(meta);
    }

    public ModelComposite(ModelId id, MetaMap meta) {
        super(id, meta);
    }

}
