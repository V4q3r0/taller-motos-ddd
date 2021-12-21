package co.com.sofka.taller.values;

import co.com.sofka.generico.Id;

public final class MecanicoId extends Id {

    private MecanicoId(String value) {
        super(value);
    }

    public MecanicoId(){

    }

    public static MecanicoId of(String value){
        return new MecanicoId(value);
    }
}
