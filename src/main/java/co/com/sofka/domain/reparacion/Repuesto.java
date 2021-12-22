package co.com.sofka.domain.reparacion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.reparacion.values.RepuestoId;

import java.util.Objects;

public class Repuesto extends Entity<RepuestoId> {
    private final Estado estado;
    private final Marca marca;

    public Repuesto(RepuestoId repuestoId, Estado estado, Marca marca){
        super(repuestoId);
        this.estado = Objects.requireNonNull(estado);
        this.marca = Objects.requireNonNull(marca);
    }

    public Estado estado() {
        return estado;
    }

    public Marca marca() {
        return marca;
    }
}
