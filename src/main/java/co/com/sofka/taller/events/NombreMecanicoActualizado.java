package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;

public class NombreMecanicoActualizado extends DomainEvent {
    private final String value;

    public NombreMecanicoActualizado(String value){
        super("sofka.taller.nombremecanicoactualizado");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
