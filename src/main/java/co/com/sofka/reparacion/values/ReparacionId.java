package co.com.sofka.reparacion.values;

import co.com.sofka.generico.Id;

public final class ReparacionId extends Id {
    private ReparacionId(String value) {
        super(value);
    }

    public ReparacionId(){

    }

    public static ReparacionId of(String value){
        return new ReparacionId(value);
    }
}
