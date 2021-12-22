package co.com.sofka.domain.reparacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.reparacion.values.HerramientaId;

public class EstadoHerramientaActualizada extends DomainEvent {
    private final HerramientaId herramientaId;
    private final Estado estado;

    public EstadoHerramientaActualizada(HerramientaId herramientaId, Estado estado){
        super("sofka.reparacion.estadoherramientaactualizada");
        this.herramientaId = herramientaId;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public HerramientaId getHerramientaId() {
        return herramientaId;
    }
}
