package co.com.sofka.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.MecanicoId;
import co.com.sofka.domain.taller.values.TallerId;

public class AgregarMecanicoCommand extends Command {

    private final TallerId tallerId;
    private final MecanicoId mecanicoId;
    private final Nombre nombre;
    private final Telefono telefono;

    public AgregarMecanicoCommand(TallerId tallerId, MecanicoId mecanicoId, Nombre nombre, Telefono telefono){
        this.tallerId = tallerId;
        this.mecanicoId = mecanicoId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public TallerId getTallerId() {
        return tallerId;
    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
