package com.dio.iphone.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import static java.lang.System.in;
import static java.lang.System.out;

public interface TouchScreen {
    default PrintWriter display(CharSequence text) {
        PrintWriter writer = new PrintWriter(out);
        writer.append(text).append("\n");
        writer.flush();
        return writer;
    }

    default CharSequence keyboard() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        CharSequence typeKeys;
        try {
            typeKeys = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return typeKeys;
    }
}