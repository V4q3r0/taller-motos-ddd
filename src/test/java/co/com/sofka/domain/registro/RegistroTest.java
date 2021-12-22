package co.com.sofka.domain.registro;

import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.values.*;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RegistroTest {

    Set<Tarea> tareas = new HashSet<>();

    RegistroId idRegistro = RegistroId.of("Reg01");
    Moto motoRegistro = new Moto(
            MotoId.of("Mo01"),
            new Color("Azul"),
            new Estado(true),
            new Marca("Triump"),
            new Orden(
                    new Fecha(new Date()),
                    tareas,
                    new Precio(100000.0)
            )
    );
    Cliente clienteRegistro = new Cliente(
            ClienteId.of("Cli01"),
            new Telefono("123321"),
            new Nombre("Andrea", "Monsalve")
    );
    Fecha fechaRegistro = new Fecha(new Date());

    Registro registro = new Registro(idRegistro, motoRegistro, clienteRegistro, fechaRegistro);

    @Test
    void crearRegistroTest(){
        tareas.add(new Tarea("Reparar cupula"));
        tareas.add(new Tarea("Calibrar valvulas"));
        tareas.add(new Tarea("Cambiar pastas y liquido de freno"));

        var idRegistro = RegistroId.of("Reg01");
        var motoRegistro = new Moto(
                MotoId.of("Mo01"),
                new Color("Azul"),
                new Estado(true),
                new Marca("Triump"),
                new Orden(
                        new Fecha(new Date()),
                        tareas,
                        new Precio(100000.0)
                )
        );
        var clienteRegistro = new Cliente(
                ClienteId.of("Cli01"),
                new Telefono("123321"),
                new Nombre("Andrea", "Monsalve")
        );
        var fechaRegistro = new Fecha(new Date());

        var registro = new Registro(idRegistro, motoRegistro, clienteRegistro, fechaRegistro);

        assert Objects.nonNull(registro.identity());
        assert registro.identity().value().equals("Reg01");
        assert Objects.nonNull(registro.moto);
        assert registro.moto.equals(motoRegistro);
        assert Objects.nonNull(registro.cliente);
        assert registro.cliente.equals(clienteRegistro);
        assert Objects.nonNull(registro.fecha);
        assert registro.fecha.equals(fechaRegistro);
    }

    @Test
    void agregarClienteTest(){
        tareas.add(new Tarea("Reparar cupula"));
        tareas.add(new Tarea("Calibrar valvulas"));
        tareas.add(new Tarea("Cambiar pastas y liquido de freno"));

        var idCliente = ClienteId.of("Clien02");
        var nombreCliente = new Nombre("Pablo", "Montoya");
        var telefonoCliente = new Telefono("5432112345");

        registro.agregarCliente(idCliente, nombreCliente, telefonoCliente);

        assert Objects.nonNull(registro.cliente.identity());
        assert registro.cliente.identity().value().equals("Clien02");
        assert Objects.nonNull(registro.cliente.nombre());
        assert registro.cliente.nombre().equals(nombreCliente);
        assert Objects.nonNull(registro.cliente.telefono());
        assert registro.cliente.telefono().getValue().equals("5432112345");
    }

    @Test
    void agregarMotoTest(){
        var idMoto = MotoId.of("Mot02");
        var colorMoto = new Color("Gris");
        var ordenMoto = new Orden(
                new Fecha(new Date()),
                tareas,
                new Precio(100000.0)
        );
        var estadoMoto = new Estado(true);
        var marcaMoto = new Marca("Suzuki");

        registro.agregarMoto(idMoto, colorMoto, estadoMoto, marcaMoto, ordenMoto);

        assert Objects.nonNull(registro.moto.identity());
        assert registro.moto.identity().value().equals("Mot02");
        assert Objects.nonNull(registro.moto.color());
        assert registro.moto.color().value().equals("Gris");
        assert Objects.nonNull(registro.moto.orden());
        assert registro.moto.orden().equals(ordenMoto);
        assert Objects.nonNull(registro.moto.estado());
        assert registro.moto.estado().getValue().equals(true);
        assert Objects.nonNull(registro.moto.marca());
        assert registro.moto.marca().getValue().equals("Suzuki");
    }

    @Test
    void cambiarColorMotoTest(){
        var color = new Color("Rojo");

        registro.cambiarColorMoto(registro.moto.identity(), color);

        assert registro.moto.color().value().equals("Rojo");
    }

    @Test
    void cambiarEstadoMotoTest(){
        var estado = new Estado(false);

        registro.cambiarEstadoMoto(registro.moto.identity(), estado);

        assert registro.moto.estado().getValue().equals(false);
    }

    @Test
    void cambiarNombreClienteTest(){
        var nombre = new Nombre("Karen", "Molina");

        registro.cambiarNombreCliente(registro.cliente.identity(), nombre);

        assert registro.cliente.nombre().equals(nombre);
    }

    @Test
    void cambiarTelefonoClienteTest(){
        var telefono = new Telefono("123321");

        registro.cambiarTelefonoCliente(registro.cliente.identity(), telefono);

        assert registro.cliente.telefono().getValue().equals("123321");
    }

    @Test
    void cambiarOrdenMotoTest(){
        tareas.add(new Tarea("Calibrar valvulas"));
        tareas.add(new Tarea("Revisar luz direccionales"));

        var orden = new Orden(
                new Fecha(new Date()),
                tareas,
                new Precio(200000.0)
        );

        registro.cambiarOrdenMoto(registro.moto.identity(), orden);

        assert registro.moto.orden().equals(orden);
    }
}
