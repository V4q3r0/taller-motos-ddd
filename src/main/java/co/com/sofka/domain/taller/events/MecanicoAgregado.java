package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.MecanicoId;

public class MecanicoAgregado extends DomainEvent {
    private final MecanicoId mecanicoId;
    private final Nombre nombre;
    private final Telefono telefono;

    public MecanicoAgregado(MecanicoId mecanicoId, Nombre nombre, Telefono telefono){
        super("sofka.taller.mecanicoagregado");
        this.mecanicoId = mecanicoId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
