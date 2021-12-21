package co.com.sofka.taller.values;

import co.com.sofka.generico.Id;

public final class EncargadoId extends Id {
    private EncargadoId(String value) {
        super(value);
    }

    public EncargadoId(){

    }

    public static EncargadoId of(String value){
        return new EncargadoId(value);
    }
}
