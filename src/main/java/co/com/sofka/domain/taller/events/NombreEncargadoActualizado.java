package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.taller.values.EncargadoId;

public class NombreEncargadoActualizado extends DomainEvent {
    private final EncargadoId encargadoId;
    private final Nombre nombre;

    public NombreEncargadoActualizado(EncargadoId encargadoId, Nombre nombre){
        super("sofka.taller.nombreencargadoactualizado");
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
