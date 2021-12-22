package co.com.sofka.domain.reparacion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.reparacion.values.HerramientaId;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.reparacion.values.Tamanio;

import java.util.Objects;

public class Herramienta extends Entity<HerramientaId> {
    private final Tamanio tamanio;
    private final Estado estado;
    private final Marca marca;

    public Herramienta(HerramientaId herramientaId, Tamanio tamanio, Estado estado, Marca marca){
        super(herramientaId);
        this.tamanio = Objects.requireNonNull(tamanio);
        this.estado = Objects.requireNonNull(estado);
        this.marca = Objects.requireNonNull(marca);
    }

    public Estado estado() {
        return estado;
    }

    public Marca marca() {
        return marca;
    }

    public Tamanio tamanio() {
        return tamanio;
    }
}
