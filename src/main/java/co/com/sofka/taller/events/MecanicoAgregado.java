package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.generico.Nombre;
import co.com.sofka.generico.Telefono;
import co.com.sofka.taller.values.MecanicoId;

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
