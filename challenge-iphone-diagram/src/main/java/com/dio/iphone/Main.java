package com.dio.iphone;

import com.dio.iphone.controller.CommandController;
import com.dio.iphone.controller.impl.IPhoneController;

public class Main {
    public static void main(String[] args) {
        CommandController iPhone = new IPhoneController();
        iPhone.execute();
    }
}