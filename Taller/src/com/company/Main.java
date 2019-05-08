package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Vehiculo> vehiculoList = new ArrayList<>();
        vehiculoList.add(new Coche("rojo"));
        vehiculoList.add(new Coche("rojo"));
        vehiculoList.add(new Coche("rojo"));
        vehiculoList.add(new Coche("rojo"));
        vehiculoList.add(new Moto("rojo"));
        vehiculoList.add(new Coche("rojo"));

        List<ParteReparacion> parteReparacionsList = new ArrayList<>();
        parteReparacionsList.add(new ParteReparacion(vehiculoList.get(0)));
        parteReparacionsList.add(new ParteReparacion(vehiculoList.get(2)));
        parteReparacionsList.add(new ParteReparacion(vehiculoList.get(4)));
        parteReparacionsList.add(new ParteReparacion(vehiculoList.get(1)));

        parteReparacionsList.forEach(parteReparacion -> System.out.println(parteReparacion.toString()));
        double resultado = parteReparacionsList.stream().mapToDouble(ParteReparacion::precioTotalReparacion).sum();

        System.out.println("total facturado");
        System.out.println(resultado);
        System.out.println("numero reparaciones moto");
        long lista = parteReparacionsList.stream().
                filter(parteReparacion -> parteReparacion.getVehiculo() instanceof Moto).count();


        System.out.println(lista);
        System.out.println("media");
        double average = parteReparacionsList
                .stream()
                .mapToDouble(ParteReparacion::precioTotalReparacion)
                .average()
                .getAsDouble();
        System.out.println(average);

        System.out.println("coste total reparaciones de coche");
    Stream<ParteReparacion>list = parteReparacionsList.stream().filter(parteReparacion -> parteReparacion.getVehiculo()instanceof Coche);
        double resultado2 = list.mapToDouble(ParteReparacion::precioTotalReparacion).sum();;
        System.out.println(resultado2);
        System.out.println("coste total reparaciones de moto");
        Stream<ParteReparacion>listaMoto = parteReparacionsList.stream().filter(parteReparacion -> parteReparacion.getVehiculo()instanceof Moto);
        double resultado3 = listaMoto.mapToDouble(ParteReparacion::precioTotalReparacion).sum();;
        System.out.println(resultado3);



}
  }


