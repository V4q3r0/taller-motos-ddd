package co.com.sofka.reparacion.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reparacion.Herramienta;
import co.com.sofka.reparacion.Repuesto;
import co.com.sofka.reparacion.values.Duracion;
import co.com.sofka.reparacion.values.ReparacionId;

public class CrearReparacion extends DomainEvent {
    private final ReparacionId reparacionId;
    private final Herramienta herramienta;
    private final Duracion duracion;
    private final Repuesto repuesto;

    public CrearReparacion(ReparacionId reparacionId, Herramienta herramienta, Repuesto repuesto, Duracion duracion){
        super("sofka.taller.reparacioncreada");
        this.reparacionId = reparacionId;
        this.herramienta = herramienta;
        this.repuesto = repuesto;
        this.duracion = duracion;
    }

    public ReparacionId getReparacionId() {
        return reparacionId;
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public Repuesto getRepuesto() {
        return repuesto;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
