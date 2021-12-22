package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.EncargadoId;

public class TelefonoEncargadoActualizado extends DomainEvent {
    private final EncargadoId encargadoId;
    private final Telefono telefono;

    public TelefonoEncargadoActualizado(EncargadoId encargadoId, Telefono telefono){
        super("sofka.taller.telefonoencargadoactualizado");
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
