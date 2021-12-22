package co.com.sofka.domain.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.values.ClienteId;

public class CambiarTelefonoClienteCommand extends Command {
    private final ClienteId clienteId;
    private final Telefono telefono;

    public CambiarTelefonoClienteCommand(ClienteId clienteId, Telefono telefono) {
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
