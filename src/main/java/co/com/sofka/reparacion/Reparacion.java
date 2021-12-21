package co.com.sofka.reparacion;

import co.com.sofka.generico.AggregateRoot;
import co.com.sofka.reparacion.events.CrearReparacion;
import co.com.sofka.reparacion.values.Duracion;
import co.com.sofka.reparacion.values.ReparacionId;

import java.util.Objects;

public class Reparacion extends AggregateRoot<ReparacionId> {
    private Duracion duracion;
    private Herramienta herramienta;
    private Repuesto repuesto;

    public Reparacion(ReparacionId reparacionId, Herramienta herramienta, Repuesto repuesto, Duracion duracion){
        super(reparacionId);
        this.herramienta = Objects.requireNonNull(herramienta);
        this.repuesto = Objects.requireNonNull(repuesto);
        this.duracion = Objects.requireNonNull(duracion);
        applyChange(new CrearReparacion(reparacionId, herramienta, repuesto, duracion));
    }

    public Duracion duracion() {
        return duracion;
    }

    public Herramienta herramienta() {
        return herramienta;
    }

    public Repuesto repuesto() {
        return repuesto;
    }
}
