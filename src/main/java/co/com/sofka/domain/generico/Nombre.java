package co.com.sofka.domain.generico;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;
import java.util.Objects;

public class Nombre implements Serializable {

    private final String name;
    private final String apellido;

    public Nombre(String name, String apellido){
        this.name = Objects.requireNonNull(name);
        this.apellido = Objects.requireNonNull(apellido);
    }

    public String getApellido() {
        return apellido;
    }

    public String getName() {
        return name;
    }
}
