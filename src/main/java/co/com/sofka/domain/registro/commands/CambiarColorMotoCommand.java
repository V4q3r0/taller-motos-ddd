package co.com.sofka.domain.registro.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.registro.values.Color;
import co.com.sofka.domain.registro.values.MotoId;

public class CambiarColorMotoCommand extends Command {
    private final MotoId motoId;
    private final Color color;

    public CambiarColorMotoCommand(MotoId motoId, Color color) {
        this.motoId = motoId;
        this.color = color;
    }

    public MotoId getMotoId() {
        return motoId;
    }

    public Color getColor() {
        return color;
    }
}
