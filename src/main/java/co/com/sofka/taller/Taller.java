package co.com.sofka.taller;

import co.com.sofka.generico.AggregateRoot;
import co.com.sofka.generico.Nombre;
import co.com.sofka.generico.Telefono;
import co.com.sofka.registro.Registro;
import co.com.sofka.reparacion.Reparacion;
import co.com.sofka.taller.events.*;
import co.com.sofka.taller.values.Direccion;
import co.com.sofka.registro.values.RegistroId;
import co.com.sofka.reparacion.values.ReparacionId;
import co.com.sofka.taller.values.EncargadoId;
import co.com.sofka.taller.values.MecanicoId;
import co.com.sofka.taller.values.TallerId;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Taller extends AggregateRoot<TallerId> {

    private ReparacionId reparacionId;
    private RegistroId registroId;

    private Direccion direccion;
    private Encargado encargado;
    private Set<Mecanico> mecanicos;

    public Taller(TallerId tallerId, Direccion direccion) {
        super(tallerId);
        this.direccion = Objects.requireNonNull(direccion);
        this.mecanicos = new HashSet<>();
        this.applyChange(new TallerCreado(tallerId, direccion));
    }

    public void asignarEncargado(Nombre nombre, Telefono telefono){
        var id = new EncargadoId();
        encargado = new Encargado(id, nombre, telefono);
        this.applyChange(new EncargadoAsignado(id, nombre, telefono));
    }

    public void agregarMecanico(Nombre nombre, Telefono telefono){
        var id = new MecanicoId();
        mecanicos.add(new Mecanico(id, nombre, telefono));
        this.applyChange(new MecanicoAgregado(id, nombre, telefono));
    }

    public void asignarReparacion(Reparacion reparacion){
        this.applyChange(new ReparacionAsignada(reparacion));
    }

    public void asignarRegistro(Registro registro){
        this.applyChange(new RegistroAsignado(registro));
    }

    public void actualizarNombreEncargado(String nombre){
        this.applyChange(new NombreEncargadoActualizado(nombre));
    }

    public void actualizarTelefonoEncargado(String telefono){
        this.applyChange(new TelefonoEncargadoActualizado(telefono));
    }

    public void actualizarNombreMecanico(String nombre){
        this.applyChange(new NombreMecanicoActualizado(nombre));
    }

    public void actualizarTelefonoMecanico(String telefono){
        this.applyChange(new TelefonoMecanicoActualizado(telefono));
    }
}
