package co.com.sofka.domain.registro;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.registro.events.*;

public class RegistroChangue extends EventChange {
    public RegistroChangue(Registro registro){
        apply((RegistroCreado event) -> {
            registro.cliente = event.getCliente();
            registro.moto = event.getMoto();
            registro.fecha = event.getFecha();
        });

        apply((ClienteAgregado event) -> {
            registro.cliente = new Cliente(
                    event.getClienteId(),
                    event.getTelefono(),
                    event.getNombre()
            );
        });

        apply((MotoAgregada event) -> {
            registro.moto = new Moto(
                    event.getMotoId(),
                    event.getColor(),
                    event.getEstado(),
                    event.getMarca(),
                    event.getOrden()
            );
        });

        apply((ColorMotoActualizado event) -> {
            registro.moto = new Moto(
                    event.getMotoId(),
                    event.getColor(),
                    registro.moto.estado(),
                    registro.moto.marca(),
                    registro.moto.orden()
            );
        });

        apply((EstadoMotoActualizado event) -> {
            registro.moto = new Moto(
                    event.getMotoId(),
                    registro.moto.color(),
                    event.getEstado(),
                    registro.moto.marca(),
                    registro.moto.orden()
            );
        });

        apply((NombreClienteActualizado event) -> {
            registro.cliente = new Cliente(
                    event.getClienteId(),
                    registro.cliente.telefono(),
                    event.getNombre()
            );
        });

        apply((TelefonoClienteActualizado event) -> {
            registro.cliente = new Cliente(
                    event.getClienteId(),
                    event.getTelefono(),
                    registro.cliente.nombre()
            );
        });

        apply((OrdenMotoActualizada event) -> {
            registro.moto = new Moto(
                    event.getMotoId(),
                    registro.moto.color(),
                    registro.moto.estado(),
                    registro.moto.marca(),
                    event.getOrden()
            );
        });
    }
}
