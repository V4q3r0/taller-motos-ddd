package co.com.sofka.domain.registro.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.registro.values.MotoId;

public class EstadoMotoActualizado extends DomainEvent {
    private final MotoId motoId;
    private final Estado estado;

    public EstadoMotoActualizado(MotoId motoId, Estado estado){
        super("sofka.registro.estadomotoactualizado");
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
