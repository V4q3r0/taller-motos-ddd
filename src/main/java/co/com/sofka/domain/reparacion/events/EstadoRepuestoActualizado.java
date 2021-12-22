package co.com.sofka.domain.reparacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.reparacion.values.RepuestoId;

public class EstadoRepuestoActualizado extends DomainEvent {

    private final RepuestoId repuestoId;
    private final Estado estado;

    public EstadoRepuestoActualizado(RepuestoId repuestoId, Estado estado){
        super("sofka.reparacion.estadorepuestoactualizado");
        this.repuestoId = repuestoId;
        this.estado = estado;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }

    public Estado getEstado() {
        return estado;
    }
}
