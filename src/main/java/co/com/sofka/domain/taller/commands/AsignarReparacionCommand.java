package co.com.sofka.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.reparacion.Herramienta;
import co.com.sofka.domain.reparacion.Repuesto;
import co.com.sofka.domain.reparacion.values.Duracion;
import co.com.sofka.domain.reparacion.values.ReparacionId;
import co.com.sofka.domain.taller.values.TallerId;

public class AsignarReparacionCommand extends Command {
    private final TallerId tallerId;
    private final ReparacionId reparacionId;
    private final Duracion duracion;
    private final Herramienta herramienta;
    private final Repuesto repuesto;

    public AsignarReparacionCommand(TallerId tallerId, ReparacionId reparacionId, Duracion duracion, Herramienta herramienta, Repuesto repuesto) {
        this.tallerId = tallerId;
        this.reparacionId = reparacionId;
        this.duracion = duracion;
        this.herramienta = herramienta;
        this.repuesto = repuesto;
    }

    public TallerId getTallerId() {
        return tallerId;
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
