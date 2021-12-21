package co.com.sofka.taller;

import co.com.sofka.generico.Entity;
import co.com.sofka.generico.Nombre;
import co.com.sofka.generico.Telefono;
import co.com.sofka.taller.values.EncargadoId;

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
