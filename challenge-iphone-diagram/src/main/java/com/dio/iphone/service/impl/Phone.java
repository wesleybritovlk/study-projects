package com.dio.iphone.service.impl;

import com.dio.iphone.service.Telephone;

import java.io.PrintWriter;

public class Phone implements Telephone {
    @Override
    public PrintWriter call() {
        return display("Calling someone...");
    }

    @Override
    public PrintWriter answer() {
        return display("Answering call...");
    }

    @Override
    public PrintWriter startMailVoice() {
        return display("Starting voicemail...");
    }
}