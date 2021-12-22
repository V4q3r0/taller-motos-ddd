package co.com.sofka.domain.taller.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.taller.values.MecanicoId;

public class ActualizarNombreMecanicoCommand extends Command {
    private final MecanicoId mecanicoId;
    private final Nombre nombre;

    public ActualizarNombreMecanicoCommand(MecanicoId mecanicoId, Nombre nombre) {
        this.mecanicoId = mecanicoId;
        this.nombre = nombre;
    }

    public MecanicoId getMecanicoId() {
        return mecanicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
