package co.com.sofka.reparacion.values;

import co.com.sofka.generico.Id;

public class RepuestoId extends Id {
    private RepuestoId(String value) {
        super(value);
    }

    public RepuestoId(){

    }

    public static RepuestoId of(String value){
        return new RepuestoId(value);
    }
}
