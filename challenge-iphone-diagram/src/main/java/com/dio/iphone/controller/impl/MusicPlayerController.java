package com.dio.iphone.controller.impl;

import com.dio.iphone.controller.CommandController;
import com.dio.iphone.service.MusicPlayer;

import java.util.HashMap;
import java.util.Map;

class MusicPlayerController implements CommandController {
    private final Map<Number, CommandController> commandMap;

    MusicPlayerController(MusicPlayer musicPlayer) {
        commandMap = new HashMap<>();
        commandMap.put(1, musicPlayer::play);
        commandMap.put(2, musicPlayer::pause);
        commandMap.put(3, musicPlayer::selectMusic);
        commandMap.put(4, () -> display("Returning to the main menu..."));
    }

    @Override
    public void execute() {
        display("Welcome to iPod Music");
        while (true) {
            display("Your playback options are: ");
            display("1 - Play music");
            display("2 - Pause music");
            display("3 - Select music");
            display("4 - Back to main menu");
            if (select(keyboard(), commandMap)) return;
        }
    }
}