package co.com.sofka.reparacion.events;

import co.com.sofka.generico.DomainEvent;

public class DuracionActualizada extends DomainEvent {
    private final String value;

    public DuracionActualizada(String value){
        super("sofka.reparacion.duracionactualizada");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
