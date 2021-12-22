package co.com.sofka.domain.reparacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.reparacion.values.HerramientaId;
import co.com.sofka.domain.reparacion.values.ReparacionId;
import co.com.sofka.domain.reparacion.values.Tamanio;

public class HerramientaAgregada extends DomainEvent {
    private final HerramientaId herramientaId;
    private final Tamanio tamanio;
    private final Estado estado;
    private final Marca marca;

    public HerramientaAgregada(HerramientaId herramientaId, Tamanio tamanio, Estado estado, Marca marca){
        super("sofka.reparacion.herramientaagregada");
        this.herramientaId = herramientaId;
        this.tamanio = tamanio;
        this.estado = estado;
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }

    public Estado getEstado() {
        return estado;
    }

    public HerramientaId getHerramientaId() {
        return herramientaId;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }
}
