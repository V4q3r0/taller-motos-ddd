package co.com.sofka.registro.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.registro.values.Fecha;
import co.com.sofka.registro.values.Orden;

import java.util.Set;

public class OrdenMotoActualizada extends DomainEvent {
    private final Set<Orden> ordenes;

    public OrdenMotoActualizada(Set<Orden> ordenes){
        super("sofka.registro.ordenmotoactualizada");
        this.ordenes = ordenes;
    }

    public Set<Orden> getOrdenes() {
        return ordenes;
    }
}
