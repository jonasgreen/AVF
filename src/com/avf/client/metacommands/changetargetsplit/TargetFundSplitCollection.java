package com.avf.client.metacommands.changetargetsplit;

import com.avf.client.model.MetaCollection;
import com.avf.client.model.MetaList;

/**
 *
 */
public class TargetFundSplitCollection extends MetaList<TargetFundSplit> {
    public TargetFundSplit targetFundSplit = new TargetFundSplit(this);

    protected TargetFundSplitCollection() {
    }

    public TargetFundSplitCollection(MetaCollection parent) {
        super(parent, "tagetFundSplitCollection", "java.util.list");
    }
}
