package com.gradle.processing;

import processing.core.PApplet;

public class Frame extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

}
