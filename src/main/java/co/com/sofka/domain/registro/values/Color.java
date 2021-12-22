package co.com.sofka.domain.registro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Color implements ValueObject<String> {
    private final String value;

    public Color(String value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
