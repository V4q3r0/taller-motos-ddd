package co.com.sofka.domain.taller;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.Cliente;
import co.com.sofka.domain.registro.Moto;
import co.com.sofka.domain.registro.Registro;
import co.com.sofka.domain.registro.values.Fecha;
import co.com.sofka.domain.reparacion.Herramienta;
import co.com.sofka.domain.reparacion.Reparacion;
import co.com.sofka.domain.reparacion.Repuesto;
import co.com.sofka.domain.reparacion.values.Duracion;
import co.com.sofka.domain.taller.events.*;
import co.com.sofka.domain.taller.values.Direccion;
import co.com.sofka.domain.registro.values.RegistroId;
import co.com.sofka.domain.reparacion.values.ReparacionId;
import co.com.sofka.domain.taller.values.EncargadoId;
import co.com.sofka.domain.taller.values.MecanicoId;
import co.com.sofka.domain.taller.values.TallerId;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Taller extends AggregateEvent<TallerId> {

    protected ReparacionId reparacionId;
    protected RegistroId registroId;

    protected Direccion direccion;
    protected Encargado encargado;
    protected Set<Mecanico> mecanicos;

    public Taller(TallerId tallerId, Direccion direccion) {
        super(tallerId);
        subscribe(new TallerChangue(this));
        appendChange(new TallerCreado(tallerId, direccion)).apply();
    }

    public void asignarEncargado(EncargadoId encargadoId, Nombre nombre, Telefono telefono){
        Objects.requireNonNull(encargadoId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        appendChange(new EncargadoAsignado(encargadoId, nombre, telefono)).apply();
    }

    public void agregarMecanico(MecanicoId mecanicoId, Nombre nombre, Telefono telefono){
        Objects.requireNonNull(mecanicoId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        appendChange(new MecanicoAgregado(mecanicoId, nombre, telefono)).apply();
    }

    public void asignarReparacion(ReparacionId reparacionId, Duracion duracion, Herramienta herramienta, Repuesto repuesto){
        Objects.requireNonNull(reparacionId);
        Objects.requireNonNull(duracion);
        Objects.requireNonNull(herramienta);
        Objects.requireNonNull(repuesto);
        appendChange(new ReparacionAsignada(reparacionId, duracion, herramienta, repuesto)).apply();
    }

    public void asignarRegistro(RegistroId registroId, Moto moto, Cliente cliente, Fecha fecha){
        Objects.requireNonNull(registroId);
        Objects.requireNonNull(moto);
        Objects.requireNonNull(cliente);
        Objects.requireNonNull(fecha);
        appendChange(new RegistroAsignado(registroId, moto, cliente, fecha)).apply();
    }

    public void actualizarNombreEncargado(EncargadoId encargadoId, Nombre nombre){
        Objects.requireNonNull(encargadoId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreEncargadoActualizado(encargadoId, nombre)).apply();
    }

    public void actualizarTelefonoEncargado(EncargadoId encargadoId, Telefono telefono){
        Objects.requireNonNull(encargadoId);
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoEncargadoActualizado(encargadoId, telefono)).apply();
    }

    public void actualizarNombreMecanico(MecanicoId mecanicoId, Nombre nombre){
        Objects.requireNonNull(mecanicoId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreMecanicoActualizado(mecanicoId, nombre)).apply();
    }

    public void actualizarTelefonoMecanico(MecanicoId mecanicoId, Telefono telefono){
        Objects.requireNonNull(mecanicoId);
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoMecanicoActualizado(mecanicoId, telefono)).apply();
    }

    public Optional<Mecanico> getMecanicoById(MecanicoId mecanicoId){
        Objects.requireNonNull(mecanicoId);
        return mecanicos.stream().filter(mecanico -> mecanico.identity().equals(mecanicoId)).findFirst();
    }

    public ReparacionId reparacionId() {
        return reparacionId;
    }

    public Direccion direccion() {
        return direccion;
    }

    public Encargado encargado() {
        return encargado;
    }

    public RegistroId registroId() {
        return registroId;
    }

    public Set<Mecanico> mecanicos() {
        return mecanicos;
    }
}
