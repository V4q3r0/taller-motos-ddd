package co.com.sofka.domain.registro;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.values.ClienteId;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {
    private final Telefono telefono;
    private final Nombre nombre;

    public Cliente(ClienteId clienteId, Telefono telefono, Nombre nombre){
        super(clienteId);
        this.telefono = Objects.requireNonNull(telefono);
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Telefono telefono() {
        return telefono;
    }

    public Nombre nombre() {
        return nombre;
    }
}
