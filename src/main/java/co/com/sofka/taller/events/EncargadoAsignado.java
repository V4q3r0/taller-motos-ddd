package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.generico.Nombre;
import co.com.sofka.generico.Telefono;
import co.com.sofka.taller.values.EncargadoId;

public class EncargadoAsignado extends DomainEvent {
    private final EncargadoId encargadoId;
    private final Nombre nombre;
    private final Telefono telefono;

    public EncargadoAsignado(EncargadoId encargadoId, Nombre nombre, Telefono telefono){
        super("sofka.taller.encargadoasignado");
        this.encargadoId = encargadoId;
        this.nombre = nombre;
        this.telefono = telefono;
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
