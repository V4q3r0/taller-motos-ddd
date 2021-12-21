package co.com.sofka.reparacion.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.generico.Estado;
import co.com.sofka.generico.Marca;
import co.com.sofka.reparacion.values.RepuestoId;

public class RepuestoAgregado extends DomainEvent {
    private final RepuestoId repuestoId;
    private final Estado estado;
    private final Marca marca;

    public RepuestoAgregado(RepuestoId repuestoId, Estado estado, Marca marca){
        super("sofka.reparacion.repuestoagregado");
        this.repuestoId = repuestoId;
        this.estado = estado;
        this.marca = marca;
    }

    public Estado getEstado() {
        return estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }
}
