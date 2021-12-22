package co.com.sofka.domain.reparacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.reparacion.values.Duracion;
import co.com.sofka.domain.reparacion.values.ReparacionId;

public class DuracionActualizada extends DomainEvent {
    private final ReparacionId reparacionId;
    private final Duracion duracion;

    public DuracionActualizada(ReparacionId reparacionId, Duracion duracion){
        super("sofka.reparacion.duracionactualizada");
        this.reparacionId = reparacionId;
        this.duracion = duracion;
    }

    public ReparacionId getReparacionId() {
        return reparacionId;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
