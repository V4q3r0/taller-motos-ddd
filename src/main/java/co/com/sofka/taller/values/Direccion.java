package co.com.sofka.taller.values;

import java.util.Objects;

public final class Direccion {
    private final String value;

    public Direccion(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getValue(){
        return value;
    }
}
