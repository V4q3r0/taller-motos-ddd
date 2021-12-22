package co.com.sofka.domain.reparacion.values;

import co.com.sofka.domain.generic.Identity;

public final class ReparacionId extends Identity {
    private ReparacionId(String value) {
        super(value);
    }

    public ReparacionId(){

    }

    public static ReparacionId of(String value){
        return new ReparacionId(value);
    }
}
