package co.com.sofka.domain.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.registro.values.ClienteId;

public class CambiarNombreClienteCommand extends Command {
    private final ClienteId clienteId;
    private final Nombre nombre;

    public CambiarNombreClienteCommand(ClienteId clienteId, Nombre nombre) {
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
