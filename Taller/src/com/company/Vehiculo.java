package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
   private int precioReparacion;
   private String color;
   private List<Vehiculo>vehiculoList;





    protected Vehiculo(int precioReparacion,String color){
        this.precioReparacion=precioReparacion;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "precioReparacion=" + precioReparacion +
                ", color='" + color + '\'' +
                '}';
    }

    public int getPrecioReparacion() {
        return precioReparacion;
    }

    public void setPrecioReparacion(int precioReparacion) {
        this.precioReparacion = precioReparacion;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
