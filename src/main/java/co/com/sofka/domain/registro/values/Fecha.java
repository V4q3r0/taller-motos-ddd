package co.com.sofka.domain.registro.values;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public final class Fecha implements ValueObject<Date> {
    private final Date value;

    public Fecha(Date value){
        this.value = Objects.requireNonNull(value);
        if(value.after(new Date(Instant.now().toEpochMilli()))){
            throw new IllegalArgumentException("No puede colocar una fecha del pasado");
        }
    }

    @Override
    public Date value() {
        return value;
    }
}
