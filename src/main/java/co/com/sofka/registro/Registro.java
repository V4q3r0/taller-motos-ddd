package co.com.sofka.registro;

import co.com.sofka.generico.AggregateRoot;
import co.com.sofka.generico.Estado;
import co.com.sofka.generico.Nombre;
import co.com.sofka.generico.Telefono;
import co.com.sofka.registro.events.*;
import co.com.sofka.registro.values.*;

import java.util.Objects;
import java.util.Set;

public class Registro extends AggregateRoot<RegistroId> {
    private final Fecha fecha;

    private Moto moto;
    private Cliente cliente;

    public Registro(RegistroId registroId, Moto moto, Cliente cliente, Fecha fecha){
        super(registroId);
        this.moto = Objects.requireNonNull(moto);
        this.cliente = Objects.requireNonNull(cliente);
        this.fecha = Objects.requireNonNull(fecha);
        this.applyChange(new RegistroCreado(fecha, moto, cliente));
        agregarCliente();
        agregarMoto();
    }

    public void agregarCliente(){
        this.applyChange(new ClienteAgregado(cliente.getId(), cliente.nombre(), cliente.telefono()));
    }

    public void agregarMoto(){
        this.applyChange(new MotoAgregada(moto.getId(), moto.color(), moto.estado(), moto.marca(), moto.ordenes()));
    }

    public void cambiarColorMoto(Color color){
        this.applyChange(new ColorMotoActualizado(color.getValue()));
    }

    public void cambiarEstadoMoto(Estado estado){
        this.applyChange(new EstadoMotoActualizado(estado.getValue()));
    }

    public void cambiarNombreCliente(Nombre nombre){
        this.applyChange(new NombreClienteActualizado(nombre.getValue()));
    }

    public void cambiarTelefonoCliente(Telefono telefono){
        this.applyChange(new TelefonoClienteActualizado(telefono.getValue()));
    }

    public void cambiarOrdenMoto(Set<Orden> ordenes){
        this.applyChange(new OrdenMotoActualizada(ordenes));
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
