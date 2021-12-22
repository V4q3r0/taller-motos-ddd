package co.com.sofka.domain.reparacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.reparacion.values.Duracion;
import co.com.sofka.domain.reparacion.values.ReparacionId;

public class ActualizarDuracionCommand extends Command {
    private final ReparacionId reparacionId;
    private final Duracion duracion;

    public ActualizarDuracionCommand(ReparacionId reparacionId, Duracion duracion) {
        this.reparacionId = reparacionId;
        this.duracion = duracion;
    }

    public ReparacionId getReparacionId() {
        return reparacionId;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
