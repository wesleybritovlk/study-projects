package com.dio.iphone.controller.impl;

import com.dio.iphone.controller.CommandController;
import com.dio.iphone.service.InternetBrowser;
import com.dio.iphone.service.MusicPlayer;
import com.dio.iphone.service.Telephone;
import com.dio.iphone.service.impl.IPod;
import com.dio.iphone.service.impl.Phone;
import com.dio.iphone.service.impl.Safari;

import java.util.HashMap;
import java.util.Map;

public class IPhoneController implements CommandController {
    private final Map<Number, CommandController> commandMap;

    public IPhoneController() {
        InternetBrowser internetBrowser = new Safari();
        MusicPlayer musicPlayer = new IPod();
        Telephone telephone = new Phone();
        commandMap = new HashMap<>();
        commandMap.put(1, new InternetBrowserController(internetBrowser));
        commandMap.put(2, new MusicPlayerController(musicPlayer));
        commandMap.put(3, new TelephoneController(telephone));
        commandMap.put(4, () -> display("Shutting down the system..."));
    }

    @Override
    public void execute() {
        display("Initializing the system...");
        display("Welcome to iPhone 2007");
        while (true) {
            display("Your available apps are: ");
            display("1 - Safari Browser");
            display("2 - iPod Music");
            display("3 - Phone App");
            display("4 - Shut down the system");
            if (select(keyboard(), commandMap)) return;
        }
    }
}