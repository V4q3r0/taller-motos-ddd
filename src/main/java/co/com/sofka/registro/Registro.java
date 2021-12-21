package co.com.sofka.registro;

import co.com.sofka.generico.AggregateRoot;
import co.com.sofka.registro.values.Fecha;
import co.com.sofka.registro.values.RegistroId;

import java.util.Objects;

public class Registro extends AggregateRoot<RegistroId> {
    private final Fecha fecha;

    private Moto moto;
    private Cliente cliente;

    public Registro(RegistroId registroId, Moto moto, Cliente cliente, Fecha fecha){
        super(registroId);
        this.moto = Objects.requireNonNull(moto);
        this.cliente = Objects.requireNonNull(cliente);
        this.fecha = Objects.requireNonNull(fecha);
    }
}
