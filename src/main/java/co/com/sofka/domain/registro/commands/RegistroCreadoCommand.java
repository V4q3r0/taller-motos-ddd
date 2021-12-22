package co.com.sofka.domain.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.registro.Cliente;
import co.com.sofka.domain.registro.Moto;
import co.com.sofka.domain.registro.values.Fecha;
import co.com.sofka.domain.registro.values.RegistroId;

public class RegistroCreadoCommand extends Command {
    private final RegistroId registroId;
    private final Moto moto;
    private final Cliente cliente;
    private final Fecha fecha;

    public RegistroCreadoCommand(RegistroId registroId, Moto moto, Cliente cliente, Fecha fecha) {
        this.registroId = registroId;
        this.moto = moto;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public Moto getMoto() {
        return moto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
