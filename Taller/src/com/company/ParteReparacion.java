package com.company;


import java.util.List;

public class ParteReparacion {
   private  int PRECIOBASE=30;
   private Vehiculo vehiculo;

    public int getPRECIOBASE() {
        return PRECIOBASE;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ParteReparacion( Vehiculo vehiculo) {

        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "ParteReparacion{" +
                "PRECIOBASE=" + PRECIOBASE +
                ", vehiculo=" + vehiculo +
                "totalReparacion="+(PRECIOBASE+vehiculo.getPrecioReparacion())+
                '}';
    }
    public double precioTotalReparacion(){
        double result=getPRECIOBASE()+vehiculo.getPrecioReparacion();
        return result;
    }

}
