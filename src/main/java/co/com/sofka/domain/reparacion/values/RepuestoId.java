package co.com.sofka.domain.reparacion.values;

import co.com.sofka.domain.generic.Identity;

public class RepuestoId extends Identity {

    private RepuestoId(String value) {
        super(value);
    }

    public RepuestoId(){

    }

    public static RepuestoId of(String value){
        return new RepuestoId(value);
    }
}
