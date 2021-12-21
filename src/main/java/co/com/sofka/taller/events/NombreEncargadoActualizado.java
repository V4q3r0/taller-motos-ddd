package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;

public class NombreEncargadoActualizado extends DomainEvent {
    private final String value;

    public NombreEncargadoActualizado(String value){
        super("sofka.taller.nombreencargadoactualizado");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
