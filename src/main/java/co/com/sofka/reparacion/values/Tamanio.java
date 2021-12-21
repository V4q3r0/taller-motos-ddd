package co.com.sofka.reparacion.values;

import java.util.Objects;

public final class Tamanio {
    private final String value;

    public Tamanio(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getValue(){
        return value;
    }
}
