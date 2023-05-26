package com.example.sensor_temperatura;

public class App {
    public static void main(String[] args) {

        SensorDeTemperatura temperatureSensor = new SensorDeTemperatura();


        Ventilador fan = new Ventilador();
        Display display = new Display();


        temperatureSensor.addObserver(fan);
        temperatureSensor.addObserver(display);


        //temperatureSensor.setTemperature(25);


        temperatureSensor.setTemperature(35);
    }
}
