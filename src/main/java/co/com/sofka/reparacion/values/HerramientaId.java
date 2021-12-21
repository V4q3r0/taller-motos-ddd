package co.com.sofka.reparacion.values;

import co.com.sofka.generico.Id;

public final class HerramientaId extends Id {
    private HerramientaId(String value) {
        super(value);
    }

    public HerramientaId(){

    }

    public static HerramientaId of(String value){
        return new HerramientaId(value);
    }
}
