package co.com.sofka.registro.values;

import java.util.Objects;

public final class Orden {
    private final String value;
    private final Fecha fecha;

    public Orden(String value, Fecha fecha){
        this.value = Objects.requireNonNull(value);
        this.fecha = Objects.requireNonNull(fecha);
    }

    public String getValue(){
        return value;
    }

    public Fecha fecha() {
        return fecha;
    }
}
