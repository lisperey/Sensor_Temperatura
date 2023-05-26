package com.example.sensor_temperatura;

public class Display implements Observer{

    @Override
    public void update(int temperature) {
        System.out.println("Display: A temperatura atual é " + temperature + "°C");
    }
}
