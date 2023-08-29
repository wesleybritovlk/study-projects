package com.dio.iphone.service;

import com.dio.iphone.util.TouchScreen;

import java.io.PrintWriter;

public interface MusicPlayer extends TouchScreen {
    PrintWriter play();

    PrintWriter pause();

    PrintWriter selectMusic();
}