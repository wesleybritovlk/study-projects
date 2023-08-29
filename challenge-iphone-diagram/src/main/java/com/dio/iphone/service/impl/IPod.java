package com.dio.iphone.service.impl;

import com.dio.iphone.service.MusicPlayer;

import java.io.PrintWriter;

public class IPod implements MusicPlayer {
    @Override
    public PrintWriter play() {
        return display("Playing music...");
    }

    @Override
    public PrintWriter pause() {
        return display("Pausing music...");
    }

    @Override
    public PrintWriter selectMusic() {
        return display("Selecting music...");
    }
}