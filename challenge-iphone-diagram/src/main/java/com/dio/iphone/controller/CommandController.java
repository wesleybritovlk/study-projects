package com.dio.iphone.controller;

import com.dio.iphone.util.TouchScreen;

import java.util.Map;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public interface CommandController extends TouchScreen {
    void execute();

    default boolean select(CharSequence keyboard,
                           Map<Number, CommandController> commandMap) {
        Number selected;
        try {
            selected = parseInt(valueOf(keyboard));
        } catch (NumberFormatException e) {
            display("Invalid option, some numbers");
            return false;
        }
        if (commandMap.containsKey(selected)) {
            commandMap.get(selected).execute();
            return selected.equals(commandMap.size());
        } else display("Invalid option");
        return false;
    }
}