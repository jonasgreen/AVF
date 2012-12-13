package com.avf.client.ui;

/**
 *
 */
public interface HasData {


    public void addDataChangedListener(DataChangedHandler handler);
    public String getData();

}
