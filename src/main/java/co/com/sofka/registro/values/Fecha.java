package co.com.sofka.registro.values;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public final class Fecha implements Serializable {
    private final Date value;

    public Fecha(Date value){
        this.value = Objects.requireNonNull(value);
        if(value.after(new Date(Instant.now().toEpochMilli()))){
            throw new IllegalArgumentException("No puede colocar una fecha del pasado");
        }
    }

    public Date getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return Objects.equals(value, fecha.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
