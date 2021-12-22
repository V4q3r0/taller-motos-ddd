package co.com.sofka.domain.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.values.ClienteId;

public class TelefonoClienteActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final Telefono telefono;

    public TelefonoClienteActualizado(ClienteId clienteId, Telefono telefono){
        super("sofka.registro.telefonoclienteactualizado");
        this.clienteId = clienteId;
        this.telefono = telefono;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
