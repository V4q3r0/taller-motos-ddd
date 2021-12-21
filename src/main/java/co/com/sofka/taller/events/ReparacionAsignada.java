package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reparacion.Reparacion;

public class ReparacionAsignada extends DomainEvent {
    private final Reparacion reparacion;

    public ReparacionAsignada(Reparacion reparacion){
        super("sofka.taller.reparacionasignada");
        this.reparacion = reparacion;
    }

    public Reparacion getReparacion() {
        return reparacion;
    }
}
