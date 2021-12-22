package co.com.sofka.domain.generico;

import java.io.Serializable;
import java.util.Objects;

public class Estado implements Serializable {
    private final boolean value;

    public Estado(Boolean value){
        this.value = Objects.requireNonNull(value);
    }

    public Boolean getValue(){
        return value;
    }
}
