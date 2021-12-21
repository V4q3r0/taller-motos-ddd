package co.com.sofka.reparacion;

import co.com.sofka.generico.AggregateRoot;
import co.com.sofka.generico.Estado;
import co.com.sofka.generico.Marca;
import co.com.sofka.reparacion.events.*;
import co.com.sofka.reparacion.values.*;

import java.util.Objects;

public class Reparacion extends AggregateRoot<ReparacionId> {
    private Duracion duracion;
    private Herramienta herramienta;
    private Repuesto repuesto;

    public Reparacion(ReparacionId reparacionId, Herramienta herramienta, Repuesto repuesto, Duracion duracion){
        super(reparacionId);
        this.herramienta = Objects.requireNonNull(herramienta);
        this.repuesto = Objects.requireNonNull(repuesto);
        this.duracion = Objects.requireNonNull(duracion);
        applyChange(new ReparacionCreada(reparacionId, herramienta, repuesto, duracion));
        agregarHerramienta(herramienta.getId(), herramienta.tamanio(), herramienta.estado(), herramienta.marca());
        agregarRepuesto(repuesto.getId(), repuesto.estado(), repuesto.marca());
    }

    public void agregarHerramienta(HerramientaId herramientaId, Tamanio tamanio, Estado estado, Marca marca){
        this.applyChange(new HerramientaAgregada(herramientaId, tamanio, estado, marca));
    }

    public void agregarRepuesto(RepuestoId repuestoId, Estado estado, Marca marca){
        this.applyChange(new RepuestoAgregado(repuestoId, estado, marca));
    }

    public void actualizarDuracion(Duracion duracion){
        this.applyChange(new DuracionActualizada(duracion.getValue()));
    }

    public void actualizarEstadoHerramienta(Estado estado){
        this.applyChange(new EstadoHerramientaActualizada(estado.getValue()));
    }

    public void actualizarEstadoRepuesto(Estado estado){
        this.applyChange(new EstadoRepuestoActualizado(estado.getValue()));
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
