package co.com.sofka.domain.generico;

import java.io.Serializable;
import java.util.Objects;

public class Telefono implements Serializable {

    private final String value;

    public Telefono(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getValue(){
        return value;
    }
}
