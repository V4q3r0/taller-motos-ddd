package co.com.sofka.domain.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.registro.values.Color;
import co.com.sofka.domain.registro.values.MotoId;
import co.com.sofka.domain.registro.values.Orden;
import co.com.sofka.domain.registro.values.RegistroId;

public class AgregarMotoCommand extends Command {
    private final RegistroId registroId;
    private final MotoId motoId;
    private final Color color;
    private final Estado estado;
    private final Marca marca;
    private final Orden orden;

    public AgregarMotoCommand(RegistroId registroId, MotoId motoId, Color color, Estado estado, Marca marca, Orden orden) {
        this.registroId = registroId;
        this.motoId = motoId;
        this.color = color;
        this.estado = estado;
        this.marca = marca;
        this.orden = orden;
    }

    public RegistroId getRegistroId() {
        return registroId;
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
