package co.com.sofka.reparacion.events;

import co.com.sofka.generico.DomainEvent;

public class EstadoRepuestoActualizado extends DomainEvent {

    private final Boolean value;

    public EstadoRepuestoActualizado(Boolean value){
        super("sofka.reparacion.estadorepuestoactualizado");
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }
}
