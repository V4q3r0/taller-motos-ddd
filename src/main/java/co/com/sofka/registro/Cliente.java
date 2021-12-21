package co.com.sofka.registro;

import co.com.sofka.generico.Entity;
import co.com.sofka.generico.Nombre;
import co.com.sofka.generico.Telefono;
import co.com.sofka.registro.values.ClienteId;

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
