package com.avf.client.metacommands.changetargetsplit;

import com.avf.client.model.MetaCollection;
import com.avf.client.model.MetaMap;
import com.avf.client.model.MetaValue;

/**
 *
 */
public class TargetFundSplit extends MetaMap {

    public MetaValue pct = new MetaValue(this, "pct", "java.lang.Double");
    public MetaValue id = new MetaValue(this, "id", "java.lang.String");

    protected TargetFundSplit(MetaCollection parent) {
        super(parent, "TargetFundSplit", "com.schantz.foundation.command.TargetFundSplit");

    }
}
