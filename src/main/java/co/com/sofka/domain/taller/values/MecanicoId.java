package co.com.sofka.domain.taller.values;

import co.com.sofka.domain.generic.Identity;

public final class MecanicoId extends Identity {

    private MecanicoId(String value) {
        super(value);
    }

    public MecanicoId(){

    }

    public static MecanicoId of(String value){
        return new MecanicoId(value);
    }
}
