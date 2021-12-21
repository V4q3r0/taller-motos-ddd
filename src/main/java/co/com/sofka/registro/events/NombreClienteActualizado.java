package co.com.sofka.registro.events;

import co.com.sofka.generico.DomainEvent;

public class NombreClienteActualizado extends DomainEvent {
    private final String value;

    public NombreClienteActualizado(String value){
        super("sofka.registro.nombreclienteactualizado");
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
