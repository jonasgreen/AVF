package com.avf.client.ui;

/**
 *
 */
public interface HasData {


    public void addDataChangedListener(ValidationChangedHandler handler);
    public String getData();

}
