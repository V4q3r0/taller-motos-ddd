package co.com.sofka.domain.registro.values;

import co.com.sofka.domain.generic.Identity;

public final class MotoId extends Identity {

    private MotoId(String value) {
        super(value);
    }

    public MotoId(){

    }

    public static MotoId of(String value){
        return new MotoId(value);
    }

}
