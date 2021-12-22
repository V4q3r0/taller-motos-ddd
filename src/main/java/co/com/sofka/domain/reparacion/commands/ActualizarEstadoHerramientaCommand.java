package co.com.sofka.domain.reparacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.reparacion.values.HerramientaId;

public class ActualizarEstadoHerramientaCommand extends Command {
    private final HerramientaId herramientaId;
    private final Estado estado;

    public ActualizarEstadoHerramientaCommand(HerramientaId herramientaId, Estado estado) {
        this.herramientaId = herramientaId;
        this.estado = estado;
    }

    public HerramientaId getHerramientaId() {
        return herramientaId;
    }

    public Estado getEstado() {
        return estado;
    }
}
