package com.todocode.ap.concesionaria.logica;

import com.todocode.ap.concesionaria.persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia persis = new ControladoraPersistencia();

    public void crearAuto(String modelo, String marca, String motor, String color, String patente, int puertas) {

        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);

        persis.crearAuto(auto);

    }

}
