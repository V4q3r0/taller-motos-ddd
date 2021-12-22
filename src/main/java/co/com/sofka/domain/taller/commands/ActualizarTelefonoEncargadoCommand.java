package co.com.sofka.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.EncargadoId;

public class ActualizarTelefonoEncargadoCommand extends Command {

    private final EncargadoId encargadoId;
    private final Telefono telefono;

    public ActualizarTelefonoEncargadoCommand(EncargadoId encargadoId, Telefono telefono) {
        this.encargadoId = encargadoId;
        this.telefono = telefono;
    }

    public EncargadoId getEncargadoId() {
        return encargadoId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
