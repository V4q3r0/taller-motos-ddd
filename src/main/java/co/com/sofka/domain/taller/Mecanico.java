package co.com.sofka.domain.taller;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.MecanicoId;

import java.util.Objects;

public class Mecanico extends Entity<MecanicoId> {
    private Telefono telefono;
    private Nombre nombre;

    public Mecanico(MecanicoId mecanicoId, Nombre nombre, Telefono telefono){
        super(mecanicoId);
        this.nombre = Objects.requireNonNull(nombre);
        this.telefono = Objects.requireNonNull(telefono);
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarTelefono(Telefono telefono){
        this.telefono = Objects.requireNonNull(telefono);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }
}
