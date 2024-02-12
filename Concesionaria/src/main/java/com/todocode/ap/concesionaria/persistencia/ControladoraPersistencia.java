package com.todocode.ap.concesionaria.persistencia;

import com.todocode.ap.concesionaria.logica.Automovil;
import java.util.List;

public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void crearAuto(Automovil auto) {
        
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }
    
}
