package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.reparacion.Herramienta;
import co.com.sofka.domain.reparacion.Repuesto;
import co.com.sofka.domain.reparacion.values.Duracion;
import co.com.sofka.domain.reparacion.values.ReparacionId;

public class ReparacionAsignada extends DomainEvent {
    private final ReparacionId reparacionId;
    private final Duracion duracion;
    private final Herramienta herramienta;
    private final Repuesto repuesto;

    public ReparacionAsignada(ReparacionId reparacionId, Duracion duracion, Herramienta herramienta, Repuesto repuesto){
        super("sofka.taller.reparacionasignada");
        this.reparacionId = reparacionId;
        this.duracion = duracion;
        this.herramienta = herramienta;
        this.repuesto = repuesto;
    }

    public ReparacionId getReparacionId() {
        return reparacionId;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }
}
