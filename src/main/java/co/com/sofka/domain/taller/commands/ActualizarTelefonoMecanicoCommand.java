package co.com.sofka.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.MecanicoId;

public class ActualizarTelefonoMecanicoCommand extends Command {

    private final MecanicoId mecanicoId;
    private final Telefono telefono;

    public ActualizarTelefonoMecanicoCommand(MecanicoId mecanicoId, Telefono telefono) {
        this.mecanicoId = mecanicoId;
        this.telefono = telefono;
    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
