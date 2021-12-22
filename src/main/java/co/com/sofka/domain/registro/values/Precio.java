package co.com.sofka.domain.registro.values;

import co.com.sofka.domain.generic.ValueObject;

public class Precio implements ValueObject<Double> {
    private final Double value;

    public Precio(Double value){
        this.value = value;
    }

    @Override
    public Double value() {
        return value;
    }
}
