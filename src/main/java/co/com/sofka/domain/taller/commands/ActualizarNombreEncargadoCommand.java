package co.com.sofka.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.taller.values.EncargadoId;

public class ActualizarNombreEncargadoCommand extends Command {

    private final EncargadoId encargadoId;
    private final Nombre nombre;

    public ActualizarNombreEncargadoCommand(EncargadoId encargadoId, Nombre nombre) {
        this.encargadoId = encargadoId;
        this.nombre = nombre;
    }

    public EncargadoId getEncargadoId() {
        return encargadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
