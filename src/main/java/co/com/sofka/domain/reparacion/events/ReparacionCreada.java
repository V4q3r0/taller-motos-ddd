package co.com.sofka.domain.reparacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.reparacion.Herramienta;
import co.com.sofka.domain.reparacion.Repuesto;
import co.com.sofka.domain.reparacion.values.Duracion;
import co.com.sofka.domain.reparacion.values.ReparacionId;

public class ReparacionCreada extends DomainEvent {
    private final ReparacionId reparacionId;
    private final Herramienta herramienta;
    private final Repuesto repuesto;
    private final Duracion duracion;

    public ReparacionCreada(ReparacionId reparacionId, Herramienta herramienta, Repuesto repuesto, Duracion duracion){
        super("sofka.reparacion.reparacioncreada");
        this.reparacionId = reparacionId;
        this.herramienta = herramienta;
        this.repuesto = repuesto;
        this.duracion = duracion;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public ReparacionId getReparacionId() {
        return reparacionId;
    }
}
