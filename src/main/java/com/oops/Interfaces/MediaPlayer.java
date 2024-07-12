package com.oops.Interfaces;

public class MediaPlayer implements Media {

    @Override
    public void start() {
        System.out.println("MUsic Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }

}
