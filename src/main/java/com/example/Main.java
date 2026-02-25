package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CamionDeReparto camion = new CamionDeReparto("CAM123", 100, 500, true);
        BuqueCarga buque = new BuqueCarga("BUQ456", 200, 5000, 50);

        
        camion.setCombustible(-20);
        System.out.println("Combustible actual: " + camion.getCombustible());

       
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            t.viajar(100);
            t.mostrarDatos();
            System.out.println("--------------------");
        }
    }
}