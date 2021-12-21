package co.com.sofka.registro.values;

import java.util.Objects;

public final class Color {
    private final String value;

    public Color(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getValue(){
        return value;
    }
}
