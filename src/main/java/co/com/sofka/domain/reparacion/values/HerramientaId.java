package co.com.sofka.domain.reparacion.values;

import co.com.sofka.domain.generic.Identity;

public final class HerramientaId extends Identity {
    private HerramientaId(String value) {
        super(value);
    }

    public HerramientaId(){

    }

    public static HerramientaId of(String value){
        return new HerramientaId(value);
    }
}
