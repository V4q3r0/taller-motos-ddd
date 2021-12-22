package co.com.sofka.domain.reparacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.reparacion.values.HerramientaId;
import co.com.sofka.domain.reparacion.values.ReparacionId;
import co.com.sofka.domain.reparacion.values.Tamanio;

public class AgregarHerramientaCommand extends Command {
    private final ReparacionId reparacionId;
    private final HerramientaId herramientaId;
    private final Tamanio tamanio;
    private final Estado estado;
    private final Marca marca;

    public AgregarHerramientaCommand(ReparacionId reparacionId, HerramientaId herramientaId, Tamanio tamanio, Estado estado, Marca marca) {
        this.reparacionId = reparacionId;
        this.herramientaId = herramientaId;
        this.tamanio = tamanio;
        this.estado = estado;
        this.marca = marca;
    }

    public ReparacionId getReparacionId() {
        return reparacionId;
    }

    public HerramientaId getHerramientaId() {
        return herramientaId;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public Estado getEstado() {
        return estado;
    }

    public Marca getMarca() {
        return marca;
    }
}
