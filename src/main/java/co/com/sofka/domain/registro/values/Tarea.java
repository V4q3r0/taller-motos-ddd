package co.com.sofka.domain.registro.values;

import co.com.sofka.domain.generic.ValueObject;

public class Tarea implements ValueObject<String> {
    private final String value;

    public Tarea(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }
}
