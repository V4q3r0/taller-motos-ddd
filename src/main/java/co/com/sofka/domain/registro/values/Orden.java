package co.com.sofka.domain.registro.values;

import java.util.Set;

public final class Orden {
    private final Fecha fecha;
    private final Set<Tarea> tareas;
    private final Precio precio;

    public Orden(Fecha fecha, Set<Tarea> tareas, Precio precio){
        this.fecha = fecha;
        this.tareas = tareas;
        this.precio = precio;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Set<Tarea> getTareas() {
        return tareas;
    }
}
