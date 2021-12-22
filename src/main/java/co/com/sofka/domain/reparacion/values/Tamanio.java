package co.com.sofka.domain.reparacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Tamanio implements ValueObject<String> {
    private final String value;

    public Tamanio(String value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
