package com.company;


public class ParteReparacion {
   private  int PRECIOBASE=30;
   private Vehiculo vehiculo;
   private Tipo tipo;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPRECIOBASE() {
        return PRECIOBASE;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public ParteReparacion( Vehiculo vehiculo,Tipo tipo) {
        this.tipo=tipo;

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
    public int precioTotalReparacion(){
        int result=getPRECIOBASE()+vehiculo.getPrecioReparacion();
        return result;
    }

}
