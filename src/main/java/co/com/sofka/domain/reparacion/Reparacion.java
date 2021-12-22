package co.com.sofka.domain.reparacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.reparacion.events.*;
import co.com.sofka.domain.reparacion.values.*;

import java.util.Objects;

public class Reparacion extends AggregateEvent<ReparacionId> {

    protected Duracion duracion;
    protected Herramienta herramienta;
    protected Repuesto repuesto;

    public Reparacion(ReparacionId reparacionId, Herramienta herramienta, Repuesto repuesto, Duracion duracion){
        super(reparacionId);
        subscribe(new ReparacionChangue(this));
        appendChange(new ReparacionCreada(reparacionId, herramienta, repuesto, duracion)).apply();
    }

    public void agregarHerramienta(HerramientaId herramientaId, Tamanio tamanio, Estado estado, Marca marca){
        Objects.requireNonNull(herramientaId);
        Objects.requireNonNull(tamanio);
        Objects.requireNonNull(estado);
        Objects.requireNonNull(marca);
        appendChange(new HerramientaAgregada(herramientaId, tamanio, estado, marca)).apply();
    }

    public void agregarRepuesto(RepuestoId repuestoId, Estado estado, Marca marca){
        Objects.requireNonNull(repuestoId);
        Objects.requireNonNull(estado);
        Objects.requireNonNull(marca);
        appendChange(new RepuestoAgregado(repuestoId, estado, marca)).apply();
    }

    public void actualizarDuracion(ReparacionId reparacionId, Duracion duracion){
        Objects.requireNonNull(reparacionId);
        Objects.requireNonNull(duracion);
        appendChange(new DuracionActualizada(reparacionId, duracion)).apply();
    }

    public void actualizarEstadoHerramienta(HerramientaId herramientaId, Estado estado){
        Objects.requireNonNull(herramientaId);
        Objects.requireNonNull(estado);
        appendChange(new EstadoHerramientaActualizada(herramientaId, estado)).apply();
    }

    public void actualizarEstadoRepuesto(RepuestoId repuestoId, Estado estado){
        Objects.requireNonNull(repuestoId);
        Objects.requireNonNull(estado);
        appendChange(new EstadoRepuestoActualizado(repuestoId, estado)).apply();
    }

    public Duracion duracion() {
        return duracion;
    }

    public Herramienta herramienta() {
        return herramienta;
    }

    public Repuesto repuesto() {
        return repuesto;
    }
}
