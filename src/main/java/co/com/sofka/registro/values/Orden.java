package co.com.sofka.registro.values;

import java.util.Objects;

public final class Orden {
    private final String value;

    public Orden(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getValue(){
        return value;
    }
}
