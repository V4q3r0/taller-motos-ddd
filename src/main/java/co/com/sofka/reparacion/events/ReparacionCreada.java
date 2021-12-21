package co.com.sofka.reparacion.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reparacion.Herramienta;
import co.com.sofka.reparacion.Repuesto;
import co.com.sofka.reparacion.values.Duracion;
import co.com.sofka.reparacion.values.ReparacionId;

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
