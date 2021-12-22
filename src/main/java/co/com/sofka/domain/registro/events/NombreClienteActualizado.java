package co.com.sofka.domain.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.registro.values.ClienteId;

public class NombreClienteActualizado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;

    public NombreClienteActualizado(ClienteId clienteId, Nombre nombre){
        super("sofka.registro.nombreclienteactualizado");
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
