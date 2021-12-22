package co.com.sofka.domain.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.registro.values.Color;
import co.com.sofka.domain.registro.values.MotoId;

public class ColorMotoActualizado extends DomainEvent {
    private final MotoId motoId;
    private final Color color;

    public ColorMotoActualizado(MotoId motoId, Color color){
        super("sofka.registro.colormotoactualizado");
        this.motoId = motoId;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public MotoId getMotoId() {
        return motoId;
    }
}
