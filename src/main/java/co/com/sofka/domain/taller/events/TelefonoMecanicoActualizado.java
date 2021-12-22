package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.MecanicoId;

public class TelefonoMecanicoActualizado extends DomainEvent {
    private final MecanicoId mecanicoId;
    private final Telefono telefono;

    public TelefonoMecanicoActualizado(MecanicoId mecanicoId, Telefono telefono){
        super("sofka.taller.telefonomecanicoactualizado");
        this.mecanicoId = mecanicoId;
        this.telefono = telefono;
    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
