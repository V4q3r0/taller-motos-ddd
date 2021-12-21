package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.taller.values.Direccion;
import co.com.sofka.taller.values.TallerId;

public class TallerCreado extends DomainEvent {
    private final TallerId tallerId;
    private Direccion direccion;

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
