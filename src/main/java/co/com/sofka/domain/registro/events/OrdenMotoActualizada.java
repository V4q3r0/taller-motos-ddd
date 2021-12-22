package co.com.sofka.domain.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.registro.values.MotoId;
import co.com.sofka.domain.registro.values.Orden;

public class OrdenMotoActualizada extends DomainEvent {
    private final MotoId motoId;
    private final Orden orden;

    public OrdenMotoActualizada(MotoId motoId, Orden orden){
        super("sofka.registro.ordenmotoactualizada");
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
