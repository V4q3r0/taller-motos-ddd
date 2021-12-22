package co.com.sofka.domain.taller;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.reparacion.values.ReparacionId;
import co.com.sofka.domain.taller.events.*;

import java.util.HashSet;

public class TallerChangue extends EventChange {

    public TallerChangue(Taller taller){
        apply((TallerCreado event) -> {
            taller.direccion = event.getDireccion();
            taller.mecanicos = new HashSet<>();
        });

        apply((EncargadoAsignado event) -> {
            var encargado = new Encargado(event.getEncargadoId(), event.getNombre(), event.getTelefono());
            taller.encargado = encargado;
        });

        apply((MecanicoAgregado event) -> {
            taller.mecanicos.add(new Mecanico(
                    event.getMecanicoId(),
                    event.getNombre(),
                    event.getTelefono()
            ));
        });

        apply((ReparacionAsignada event) -> {
            taller.reparacionId = event.getReparacionId();
        });

        apply((RegistroAsignado event) -> {
            taller.registroId = event.getRegistroId();
        });

        apply((NombreEncargadoActualizado event) -> {
            taller.encargado = new Encargado(
                    event.getEncargadoId(),
                    event.getNombre(),
                    taller.encargado.telefono()
            );
        });

        apply((TelefonoEncargadoActualizado event) -> {
            taller.encargado = new Encargado(
                    event.getEncargadoId(),
                    taller.encargado.nombre(),
                    event.getTelefono()
            );
        });

        apply((NombreMecanicoActualizado event) -> {
            var mecanico = taller.getMecanicoById(event.getMecanicoId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el mecanico"));
            mecanico.actualizarNombre(event.getNombre());
        });

        apply((TelefonoMecanicoActualizado event) -> {
            var mecanico = taller.getMecanicoById(event.getMecanicoId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el mecanico"));
            mecanico.actualizarTelefono(event.getTelefono());
        });
    }
}
