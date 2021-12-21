package co.com.sofka.reparacion.events;

import co.com.sofka.generico.DomainEvent;

public class EstadoHerramientaActualizada extends DomainEvent {
    private final Boolean value;

    public EstadoHerramientaActualizada(Boolean value){
        super("sofka.reparacion.estadoherramientaactualizada");
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }
}
