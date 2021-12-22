package co.com.sofka.domain.taller.values;

import co.com.sofka.domain.generic.Identity;

public final class EncargadoId extends Identity {
    private EncargadoId(String value) {
        super(value);
    }

    public EncargadoId(){

    }

    public static EncargadoId of(String value){
        return new EncargadoId(value);
    }
}
