package com.dio.iphone.service;

import com.dio.iphone.util.TouchScreen;

import java.io.PrintWriter;

public interface Telephone extends TouchScreen {
    PrintWriter call();

    PrintWriter answer();

    PrintWriter startMailVoice();
}