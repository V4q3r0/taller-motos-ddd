package co.com.sofka.domain.registro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.events.*;
import co.com.sofka.domain.registro.values.*;

import java.util.Objects;

public class Registro extends AggregateEvent<RegistroId> {

    protected Fecha fecha;
    protected Moto moto;
    protected Cliente cliente;

    public Registro(RegistroId registroId, Moto moto, Cliente cliente, Fecha fecha){
        super(registroId);
        subscribe(new RegistroChangue(this));
        appendChange(new RegistroCreado(registroId, moto, cliente, fecha)).apply();
    }

    public void agregarCliente(ClienteId clienteId, Nombre nombre, Telefono telefono){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        appendChange(new ClienteAgregado(clienteId, nombre, telefono)).apply();
    }

    public void agregarMoto(MotoId motoId, Color color, Estado estado, Marca marca, Orden orden){
        Objects.requireNonNull(motoId);
        Objects.requireNonNull(color);
        Objects.requireNonNull(estado);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(orden);
        appendChange(new MotoAgregada(motoId, color, estado, marca, orden)).apply();
    }

    public void cambiarColorMoto(MotoId motoId, Color color){
        Objects.requireNonNull(motoId);
        Objects.requireNonNull(color);
        appendChange(new ColorMotoActualizado(motoId, color)).apply();
    }

    public void cambiarEstadoMoto(MotoId motoId, Estado estado){
        Objects.requireNonNull(motoId);
        Objects.requireNonNull(estado);
        appendChange(new EstadoMotoActualizado(motoId, estado)).apply();
    }

    public void cambiarNombreCliente(ClienteId clienteId, Nombre nombre){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreClienteActualizado(clienteId, nombre)).apply();
    }

    public void cambiarTelefonoCliente(ClienteId clienteId, Telefono telefono){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoClienteActualizado(clienteId, telefono)).apply();
    }

    public void cambiarOrdenMoto(MotoId motoId, Orden orden){
        Objects.requireNonNull(motoId);
        Objects.requireNonNull(orden);
        appendChange(new OrdenMotoActualizada(motoId, orden)).apply();
    }

    public Cliente cliente() {
        return cliente;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Moto moto() {
        return moto;
    }
}
