package co.com.sofka.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.taller.values.Direccion;
import co.com.sofka.domain.taller.values.TallerId;

public class CrearTallerCommand extends Command {

    private final TallerId tallerId;
    private final Direccion direccion;

    public CrearTallerCommand(TallerId tallerId, Direccion direccion){
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
