package co.com.sofka.domain.taller.values;

import co.com.sofka.domain.generic.Identity;

public final class TallerId extends Identity {

    private TallerId(String value) {
        super(value);
    }

    public TallerId(){

    }

    public static TallerId of(String value){
        return new TallerId(value);
    }
}
