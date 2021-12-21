package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;

public class TelefonoEncargadoActualizado extends DomainEvent {
    private final String value;

    public TelefonoEncargadoActualizado(String value){
        super("sofka.taller.telefonoencargadoactualizado");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
