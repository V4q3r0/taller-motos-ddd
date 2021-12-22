package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.registro.Cliente;
import co.com.sofka.domain.registro.Moto;
import co.com.sofka.domain.registro.Registro;
import co.com.sofka.domain.registro.values.Fecha;
import co.com.sofka.domain.registro.values.RegistroId;

public class RegistroAsignado extends DomainEvent {
    private final RegistroId registroId;
    private final Moto moto;
    private final Cliente cliente;
    private final Fecha fecha;

    public RegistroAsignado(RegistroId registroId, Moto moto, Cliente cliente, Fecha fecha){
        super("sofka.taller.registroasignado");
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
