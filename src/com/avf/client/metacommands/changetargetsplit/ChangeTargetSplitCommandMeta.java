package com.avf.client.metacommands.changetargetsplit;

import com.avf.client.model.*;

/**
 *
 */
public class ChangeTargetSplitCommandMeta extends MetaCommand {

    public MetaValue uniqueId = new MetaValue(this, "uniqueId", "com.schantz.foundation.UniqueId");
    public MetaValue switchDate = new MetaValue(this, "switchDate", "com.schantz.foundation.SdDate");

    public TargetFundSplit targetFundSplit = new TargetFundSplit(this);

    public TargetFundSplitCollection targetFundSplitCollection = new TargetFundSplitCollection(this);


    public ChangeTargetSplitCommandMeta() {
        super("TargetSplitCommand", "com.schantz.foundation.command.TargetSplitCommand");
    }


    public static void main(String[] args){
        ChangeTargetSplitCommandMeta command = new ChangeTargetSplitCommandMeta();
        System.out.println(command.uniqueId);
        System.out.println(command.switchDate);
        System.out.println(command.targetFundSplitCollection.targetFundSplit.id);
    }
}
