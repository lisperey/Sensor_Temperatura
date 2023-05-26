package com.example.sensor_temperatura;

public class Ventilador implements Observer{

    @Override
    public void update(int temperature) {
        if (temperature >= 30) {
            System.out.println("Ventilador: Está ficando quente! Ligando o ventilador.");
        } else {
            System.out.println("Ventilador: Está frio. Desligando o ventilador.");
        }
    }
}
