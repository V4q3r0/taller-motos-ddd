package co.com.sofka.domain.reparacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.reparacion.values.RepuestoId;

public class ActualizarEstadoRepuestoCommand extends Command {
    private final RepuestoId repuestoId;
    private final Estado estado;

    public ActualizarEstadoRepuestoCommand(RepuestoId repuestoId, Estado estado) {
        this.repuestoId = repuestoId;
        this.estado = estado;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }

    public Estado getEstado() {
        return estado;
    }
}
