package co.com.sofka.domain.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.registro.Cliente;
import co.com.sofka.domain.registro.Moto;
import co.com.sofka.domain.registro.values.Fecha;
import co.com.sofka.domain.registro.values.RegistroId;

public class RegistroCreado extends DomainEvent {
    private final RegistroId registroId;
    private final Fecha fecha;
    private final Moto moto;
    private final Cliente cliente;

    public RegistroCreado(RegistroId registroId, Moto moto, Cliente cliente, Fecha fecha){
        super("sofka.registro.registrocreado");
        this.registroId = registroId;
        this.fecha = fecha;
        this.moto = moto;
        this.cliente = cliente;
    }

    public RegistroId getRegistroId() {
        return registroId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Moto getMoto() {
        return moto;
    }
}
