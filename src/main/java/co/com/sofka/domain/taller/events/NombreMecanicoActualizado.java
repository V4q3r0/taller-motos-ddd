package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.taller.values.MecanicoId;

public class NombreMecanicoActualizado extends DomainEvent {
    private final MecanicoId mecanicoId;
    private final Nombre nombre;

    public NombreMecanicoActualizado(MecanicoId mecanicoId, Nombre nombre){
        super("sofka.taller.nombremecanicoactualizado");
        this.mecanicoId = mecanicoId;
        this.nombre = nombre;
    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
