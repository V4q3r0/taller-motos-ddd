package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.taller.values.Direccion;
import co.com.sofka.domain.taller.values.TallerId;

public class DireccionActualizada extends DomainEvent {
    private final TallerId tallerId;
    private final Direccion direccion;

    public DireccionActualizada(TallerId tallerId, Direccion direccion){
        super("sofka.taller.direccionactualizada");
        this.tallerId = tallerId;
        this.direccion = direccion;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
