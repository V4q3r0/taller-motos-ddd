package co.com.sofka.generico;

import java.io.Serializable;
import java.util.Objects;

public abstract class Marca implements Serializable {
    private final String value;

    public Marca(String value){
        this.value = Objects.requireNonNull(value);
    }

    public String getValue(){
        return value;
    }
}
