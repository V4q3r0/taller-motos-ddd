package co.com.sofka.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.EncargadoId;
import co.com.sofka.domain.taller.values.TallerId;

public class AsignarEncargadoCommand extends Command {
    private final TallerId tallerId;
    private final EncargadoId encargadoId;
    private final Nombre nombre;
    private final Telefono telefono;

    public AsignarEncargadoCommand(TallerId tallerId, EncargadoId encargadoId, Nombre nombre, Telefono telefono){
        this.tallerId = tallerId;
        this.encargadoId = encargadoId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public EncargadoId getEncargadoId() {
        return encargadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
