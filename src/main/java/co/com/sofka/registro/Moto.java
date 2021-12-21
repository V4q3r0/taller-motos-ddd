package co.com.sofka.registro;

import co.com.sofka.generico.*;
import co.com.sofka.registro.values.Color;
import co.com.sofka.registro.values.MotoId;
import co.com.sofka.registro.values.Orden;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Moto extends Entity<MotoId> {

    private final Color color;
    private final Set<Orden> ordenes;
    private final Estado estado;
    private final Marca marca;

    public Moto(MotoId motoId, Color color, Estado estado, Marca marca){
        super(motoId);
        this.color = Objects.requireNonNull(color);
        this.estado = Objects.requireNonNull(estado);
        this.marca = Objects.requireNonNull(marca);
        this.ordenes = new HashSet<>();
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

    public Set<Orden> ordenes() {
        return ordenes;
    }
}
