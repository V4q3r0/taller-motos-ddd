package co.com.sofka.reparacion.values;

import java.util.Objects;

public final class Duracion {
    private final String value;

    public Duracion(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getValue(){
        return value;
    }
}
