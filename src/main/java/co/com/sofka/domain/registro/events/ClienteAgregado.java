package co.com.sofka.domain.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.values.ClienteId;

public class ClienteAgregado extends DomainEvent {
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Telefono telefono;

    public ClienteAgregado(ClienteId clienteId, Nombre nombre, Telefono telefono){
        super("sofka.registro.clienteagregado");
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
