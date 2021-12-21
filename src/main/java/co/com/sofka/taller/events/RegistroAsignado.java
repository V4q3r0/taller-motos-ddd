package co.com.sofka.taller.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.registro.Registro;

public class RegistroAsignado extends DomainEvent {
    private final Registro registro;

    public RegistroAsignado(Registro registro){
        super("sofka.taller.registroasignado");
        this.registro = registro;
    }

    public Registro getRegistro() {
        return registro;
    }
}
