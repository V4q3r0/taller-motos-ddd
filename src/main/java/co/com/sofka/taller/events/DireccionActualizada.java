package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;

public class DireccionActualizada extends DomainEvent {
    private final String value;

    public DireccionActualizada(String value){
        super("sofka.taller.direccionactualizada");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
