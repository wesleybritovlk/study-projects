package com.dio.iphone.service.impl;

import com.dio.iphone.service.InternetBrowser;

import java.io.PrintWriter;
public class Safari implements InternetBrowser {
    @Override
    public PrintWriter addNewTab() {
        return display("Adding a new tab...");
    }

    @Override
    public PrintWriter displayPage() {
        return display("Displaying the page...");
    }

    @Override
    public PrintWriter reloadPage() {
        return display("Reloading the page...");
    }
}