package co.com.sofka.registro.events;

import co.com.sofka.generico.DomainEvent;

public class TelefonoClienteActualizado extends DomainEvent {
    private final String value;

    public TelefonoClienteActualizado(String value){
        super("sofka.registro.telefonoclienteactualizado");
        this.value = value;
    }
}
