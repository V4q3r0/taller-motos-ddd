package co.com.sofka.registro.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.generico.Estado;
import co.com.sofka.generico.Marca;
import co.com.sofka.registro.values.Color;
import co.com.sofka.registro.values.MotoId;
import co.com.sofka.registro.values.Orden;

import java.util.Set;

public class MotoAgregada extends DomainEvent {
    private final MotoId motoId;
    private final Color color;
    private final Set<Orden> ordenes;
    private final Estado estado;
    private final Marca marca;

    public MotoAgregada(MotoId motoId, Color color, Estado estado, Marca marca, Set<Orden> ordenes){
        super("sofka.registro.motoagregada");
        this.motoId = motoId;
        this.color = color;
        this.estado = estado;
        this.marca = marca;
        this.ordenes = ordenes;
    }

    public Color getColor() {
        return color;
    }

    public Estado getEstado() {
        return estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public Set<Orden> getOrdenes() {
        return ordenes;
    }
}
