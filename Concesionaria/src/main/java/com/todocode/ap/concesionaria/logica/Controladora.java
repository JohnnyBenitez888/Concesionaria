package com.todocode.ap.concesionaria.logica;

import com.todocode.ap.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia persis = new ControladoraPersistencia();

    public void crearAuto(String modelo, String marca, String motor, String color, String patente, String puertas) {

        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);

        persis.crearAuto(auto);

    }

    public List<Automovil> traerAutos() {
        return persis.traerAutos();
    }

    public void eliminarAuto(int idAuto) {
        persis.eliminarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return persis.traerAuto(idAuto);
    }

    public void editarAuto(Automovil auto, String modelo, String marca, String motor, String color,
            String patente, String puertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(puertas);
        
        persis.editarAuto(auto);
    }

    

}
