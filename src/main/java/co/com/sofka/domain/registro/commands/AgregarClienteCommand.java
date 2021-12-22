package co.com.sofka.domain.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.values.ClienteId;
import co.com.sofka.domain.registro.values.RegistroId;

public class AgregarClienteCommand extends Command {
    private final RegistroId registroId;
    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Telefono telefono;

    public AgregarClienteCommand(RegistroId registroId, ClienteId clienteId, Nombre nombre, Telefono telefono) {
        this.registroId = registroId;
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public RegistroId getRegistroId() {
        return registroId;
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
