package co.com.sofka.domain.taller;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.taller.values.EncargadoId;

import java.util.Objects;

public class Encargado extends Entity<EncargadoId> {

    private Telefono telefono;
    private Nombre nombre;

    public Encargado(EncargadoId encargadoId, Nombre nombre, Telefono telefono){
        super(encargadoId);
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
