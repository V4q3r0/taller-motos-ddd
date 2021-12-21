package co.com.sofka.taller;

import co.com.sofka.generico.Entity;
import co.com.sofka.generico.Nombre;
import co.com.sofka.generico.Telefono;
import co.com.sofka.taller.values.MecanicoId;

import java.util.Objects;

public class Mecanico extends Entity<MecanicoId> {
    private Telefono telefono;
    private Nombre nombre;

    public Mecanico(MecanicoId mecanicoId, Nombre nombre, Telefono telefono){
        super(mecanicoId);
        this.nombre = Objects.requireNonNull(nombre);
        this.telefono = Objects.requireNonNull(telefono);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }
}
