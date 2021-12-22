package co.com.sofka.domain.registro;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.*;
import co.com.sofka.domain.registro.values.Color;
import co.com.sofka.domain.registro.values.MotoId;
import co.com.sofka.domain.registro.values.Orden;

import java.util.Objects;

public class Moto extends Entity<MotoId> {

    private final Color color;
    private final Orden orden;
    private final Estado estado;
    private final Marca marca;

    public Moto(MotoId motoId, Color color, Estado estado, Marca marca, Orden orden){
        super(motoId);
        this.color = Objects.requireNonNull(color);
        this.estado = Objects.requireNonNull(estado);
        this.marca = Objects.requireNonNull(marca);
        this.orden = Objects.requireNonNull(orden);
    }

    public Color color() {
        return color;
    }

    public Estado estado() {
        return estado;
    }

    public Marca marca() {
        return marca;
    }

    public Orden orden() {
        return orden;
    }
}
