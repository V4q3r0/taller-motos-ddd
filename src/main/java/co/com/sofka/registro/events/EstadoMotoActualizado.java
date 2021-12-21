package co.com.sofka.registro.events;

import co.com.sofka.generico.DomainEvent;

public class EstadoMotoActualizado extends DomainEvent {
    private final Boolean value;

    public EstadoMotoActualizado(Boolean value){
        super("sofka.registro.estadomotoactualizado");
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }
}
