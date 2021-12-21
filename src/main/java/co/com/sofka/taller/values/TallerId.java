package co.com.sofka.taller.values;

import co.com.sofka.generico.Id;

public final class TallerId extends Id{

    private TallerId(String value) {
        super(value);
    }

    public TallerId(){

    }

    public static TallerId of(String value){
        return new TallerId(value);
    }
}
