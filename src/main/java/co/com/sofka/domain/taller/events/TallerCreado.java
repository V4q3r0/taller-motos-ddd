package co.com.sofka.domain.taller.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.taller.values.Direccion;
import co.com.sofka.domain.taller.values.TallerId;

public class TallerCreado extends DomainEvent {
    private final TallerId tallerId;
    private final Direccion direccion;

    public TallerCreado(TallerId tallerId, Direccion direccion){
        super("sofka.taller.tallercreado");
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
