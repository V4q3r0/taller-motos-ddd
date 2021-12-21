package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;

public class TelefonoMecanicoActualizado extends DomainEvent {
    private final String value;

    public TelefonoMecanicoActualizado(String value){
        super("sofka.taller.telefonomecanicoactualizado");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
