package co.com.sofka.registro.values;

import co.com.sofka.generico.Id;

public final class MotoId extends Id {

    private MotoId(String value) {
        super(value);
    }

    public MotoId(){

    }

    public static MotoId of(String value){
        return new MotoId(value);
    }

}
