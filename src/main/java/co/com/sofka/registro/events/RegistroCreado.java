package co.com.sofka.registro.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.registro.Cliente;
import co.com.sofka.registro.Moto;
import co.com.sofka.registro.values.Fecha;

public class RegistroCreado extends DomainEvent {
    private final Fecha fecha;
    private final Moto moto;
    private final Cliente cliente;

    public RegistroCreado(Fecha fecha, Moto moto, Cliente cliente){
        super("sofka.registro.registrocreado");
        this.fecha = fecha;
        this.moto = moto;
        this.cliente = cliente;
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
