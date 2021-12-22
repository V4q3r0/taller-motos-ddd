package co.com.sofka.domain.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.registro.values.MotoId;

public class CambiarEstadoMotoCommand extends Command {
    private final MotoId motoId;
    private final Estado estado;

    public CambiarEstadoMotoCommand(MotoId motoId, Estado estado) {
        this.motoId = motoId;
        this.estado = estado;
    }

    public MotoId getMotoId() {
        return motoId;
    }

    public Estado getEstado() {
        return estado;
    }
}
