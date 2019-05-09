package com.company;

public class Coche extends Vehiculo {
    public Coche( String color) {
        super(50,color);
    }

    @Override
    public String toString() {
        return "Coche{}";
    }
}
