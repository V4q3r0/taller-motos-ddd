package co.com.sofka.domain.reparacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.reparacion.Herramienta;
import co.com.sofka.domain.reparacion.Repuesto;
import co.com.sofka.domain.reparacion.values.Duracion;
import co.com.sofka.domain.reparacion.values.ReparacionId;

public class ReparacionCreadaCommand extends Command {
    private final ReparacionId reparacionId;
    private final Herramienta herramienta;
    private final Repuesto repuesto;
    private final Duracion duracion;

    public ReparacionCreadaCommand(ReparacionId reparacionId, Herramienta herramienta, Repuesto repuesto, Duracion duracion) {
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
