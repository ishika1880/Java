package com.oops.Interfaces;

public class NewCar  {
    private Engine engine;
    private Media player;
    private Brake brakes;

    public NewCar(){
        engine = new PowerEngine();
        player = new MediaPlayer();
        brakes = new PowerBreaks();
    }
    public void start(){
        engine.start();
    }

    public void startMusic(){
        player.start();
    }

    public void brake(){
        brakes.brake();
    }

}
