package co.com.sofka.domain.registro.values;

import co.com.sofka.domain.generic.Identity;

public class RegistroId extends Identity {

    private RegistroId(String value) {
        super(value);
    }

    public RegistroId(){

    }

    public static RegistroId of(String value){
        return new RegistroId(value);
    }
}
