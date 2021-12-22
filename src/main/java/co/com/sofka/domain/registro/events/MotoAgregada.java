package co.com.sofka.domain.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.registro.values.Color;
import co.com.sofka.domain.registro.values.MotoId;
import co.com.sofka.domain.registro.values.Orden;

public class MotoAgregada extends DomainEvent {
    private final MotoId motoId;
    private final Color color;
    private final Orden orden;
    private final Estado estado;
    private final Marca marca;

    public MotoAgregada(MotoId motoId, Color color, Estado estado, Marca marca, Orden orden){
        super("sofka.registro.motoagregada");
        this.motoId = motoId;
        this.color = color;
        this.estado = estado;
        this.marca = marca;
        this.orden = orden;
    }

    public MotoId getMotoId() {
        return motoId;
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

    public Orden getOrden() {
        return orden;
    }
}
