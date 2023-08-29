package com.dio.iphone.controller.impl;

import com.dio.iphone.controller.CommandController;
import com.dio.iphone.service.InternetBrowser;

import java.util.HashMap;
import java.util.Map;

class InternetBrowserController implements CommandController {
    private final Map<Number, CommandController> commandMap;

    InternetBrowserController(InternetBrowser internetBrowser) {
        commandMap = new HashMap<>();
        commandMap.put(1, internetBrowser::addNewTab);
        commandMap.put(2, internetBrowser::displayPage);
        commandMap.put(3, internetBrowser::reloadPage);
        commandMap.put(4, () -> display("Returning to the main menu..."));
    }

    @Override
    public void execute() {
        display("Welcome to Safari Browser");
        while (true) {
            display("Your navigation options are: ");
            display("1 - New tab");
            display("2 - View page");
            display("3 - Reload page");
            display("4 - Back to main menu");
            if (select(keyboard(), commandMap)) return;
        }
    }
}