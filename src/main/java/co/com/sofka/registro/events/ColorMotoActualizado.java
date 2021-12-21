package co.com.sofka.registro.events;

import co.com.sofka.generico.DomainEvent;

public class ColorMotoActualizado extends DomainEvent {
    private final String value;

    public ColorMotoActualizado(String value){
        super("sofka.registro.colormotoactualizado");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
