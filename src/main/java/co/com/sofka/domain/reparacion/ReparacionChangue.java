package co.com.sofka.domain.reparacion;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.reparacion.events.*;

public class ReparacionChangue extends EventChange {

    public ReparacionChangue(Reparacion reparacion){
        apply((ReparacionCreada event) -> {
            reparacion.duracion = event.getDuracion();
            reparacion.repuesto = event.getRepuesto();
            reparacion.herramienta = event.getHerramienta();
        });

        apply((HerramientaAgregada event) -> {
            reparacion.herramienta = new Herramienta(
                    event.getHerramientaId(),
                    event.getTamanio(),
                    event.getEstado(),
                    event.getMarca()
            );
        });

        apply((RepuestoAgregado event) -> {
            reparacion.repuesto = new Repuesto(
                    event.getRepuestoId(),
                    event.getEstado(),
                    event.getMarca()
            );
        });

        apply((DuracionActualizada event) -> {
            reparacion.duracion = event.getDuracion();
        });

        apply((EstadoHerramientaActualizada event) -> {
            reparacion.herramienta = new Herramienta(
                    event.getHerramientaId(),
                    reparacion.herramienta.tamanio(),
                    event.getEstado(),
                    reparacion.herramienta.marca()
            );
        });

        apply((EstadoRepuestoActualizado event) -> {
            reparacion.repuesto = new Repuesto(
                    event.getRepuestoId(),
                    event.getEstado(),
                    reparacion.repuesto.marca()
            );
        });
    }
}
