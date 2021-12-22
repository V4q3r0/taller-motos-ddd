package co.com.sofka.domain.reparacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.reparacion.values.ReparacionId;
import co.com.sofka.domain.reparacion.values.RepuestoId;

public class AgregarRepuestoCommand extends Command {
    private final ReparacionId reparacionId;
    private final RepuestoId repuestoId;
    private final Estado estado;
    private final Marca marca;

    public AgregarRepuestoCommand(ReparacionId reparacionId, RepuestoId repuestoId, Estado estado, Marca marca) {
        this.reparacionId = reparacionId;
        this.repuestoId = repuestoId;
        this.estado = estado;
        this.marca = marca;
    }

    public ReparacionId getReparacionId() {
        return reparacionId;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }

    public Estado getEstado() {
        return estado;
    }

    public Marca getMarca() {
        return marca;
    }
}
