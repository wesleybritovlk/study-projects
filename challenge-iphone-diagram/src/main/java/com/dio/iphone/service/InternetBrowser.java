package com.dio.iphone.service;

import com.dio.iphone.util.TouchScreen;

import java.io.PrintWriter;

public interface InternetBrowser extends TouchScreen {
    PrintWriter addNewTab();

    PrintWriter displayPage();

    PrintWriter reloadPage();
}