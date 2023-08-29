package com.dio.iphone.controller.impl;

import com.dio.iphone.controller.CommandController;
import com.dio.iphone.service.Telephone;

import java.util.HashMap;
import java.util.Map;

class TelephoneController implements CommandController {
    private final Map<Number, CommandController> commandMap;

    TelephoneController(Telephone telephone) {
        commandMap = new HashMap<>();
        commandMap.put(1, telephone::call);
        commandMap.put(2, telephone::answer);
        commandMap.put(3, telephone::startMailVoice);
        commandMap.put(4, () -> display("Returning to the main menu..."));
    }

    @Override
    public void execute() {
        display("Welcome to Phone App");
        while (true) {
            display("Your phone options are: ");
            display("1 - Make a Call");
            display("2 - Receive call");
            display("3 - Start voicemail");
            display("4 - Back to main menu");
            if (select(keyboard(), commandMap)) return;
        }
    }
}