package co.com.sofka.domain.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.registro.values.MotoId;
import co.com.sofka.domain.registro.values.Orden;

public class CambiarOrdenMotoCommand extends Command {
    private final MotoId motoId;
    private final Orden orden;

    public CambiarOrdenMotoCommand(MotoId motoId, Orden orden) {
        this.motoId = motoId;
        this.orden = orden;
    }

    public MotoId getMotoId() {
        return motoId;
    }

    public Orden getOrden() {
        return orden;
    }
}
