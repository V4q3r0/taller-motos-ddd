package co.com.sofka.domain.taller;

import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.generico.Nombre;
import co.com.sofka.domain.generico.Telefono;
import co.com.sofka.domain.registro.Cliente;
import co.com.sofka.domain.registro.Moto;
import co.com.sofka.domain.registro.values.*;
import co.com.sofka.domain.reparacion.Herramienta;
import co.com.sofka.domain.reparacion.Reparacion;
import co.com.sofka.domain.reparacion.Repuesto;
import co.com.sofka.domain.reparacion.values.*;
import co.com.sofka.domain.taller.values.Direccion;
import co.com.sofka.domain.taller.values.EncargadoId;
import co.com.sofka.domain.taller.values.MecanicoId;
import co.com.sofka.domain.taller.values.TallerId;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TallerTest {

    TallerId tallerId = TallerId.of("zzz-zzz");
    Direccion direccion = new Direccion("Calle 50 # 95-102");

    Taller taller = new Taller(tallerId, direccion);

    @Test
    void crearTallerTest(){
        //Arrange
        var id = TallerId.of("abcd-dcba");
        var direccion = new Direccion("Calle 38 # 85-90");

        //Act
        var taller = new Taller(id, direccion);

        //Assert
        assert Objects.nonNull(taller.identity());
        assert Objects.nonNull(taller.direccion);
    }

    @Test
    void asignarEncargadoTest(){
        //Arrange
        var idEncargado = EncargadoId.of("E01");
        var nombreEncargado = new Nombre("Jose", "Garcia");
        var telefonoEncargado = new Telefono("3125647654");

        //Act
        taller.asignarEncargado(idEncargado, nombreEncargado, telefonoEncargado);

        //Assert
        assert Objects.nonNull(taller.encargado.identity());
        assert taller.encargado.identity().value().equals("E01");
        assert Objects.nonNull(taller.encargado.nombre());
        assert taller.encargado.nombre().getName().equals("Jose");
        assert taller.encargado.nombre().getApellido().equals("Garcia");
        assert Objects.nonNull(taller.encargado.telefono());
        assert taller.encargado.telefono().getValue().equals("3125647654");
    }

    @Test
    void agregarMecanicoTest(){
        //Arrange
        var idMecanico = MecanicoId.of("M01");
        var nombreMecanico = new Nombre("Javier", "Bonnet");
        var telefonoMecanico = new Telefono("123321");

        //Act
        taller.agregarMecanico(idMecanico, nombreMecanico, telefonoMecanico);

        //Assert
        assert taller.mecanicos.size() > 0;
    }

    @Test
    void asignarReparacionTest(){
        //Arrange
        var idReparacion = ReparacionId.of("Rep01");
        var duracionReparacion = new Duracion("15 horas");
        var herramientaReparacion = new Herramienta(
                HerramientaId.of("He01"),
                new Tamanio("10"),
                new Estado(true),
                new Marca("Stanly")
        );
        var repuestoReparacion = new Repuesto(
                RepuestoId.of("Repu01"),
                new Estado(true),
                new Marca("Yamaha")
        );

        //Act
        taller.asignarReparacion(idReparacion, duracionReparacion, herramientaReparacion, repuestoReparacion);

        //Assert
        assert Objects.nonNull(taller.reparacionId);
    }

    @Test
    void asignarRegistroTest(){
        Set<Tarea> tareas = new HashSet<>();
        tareas.add(new Tarea("Reparar cupula"));
        tareas.add(new Tarea("Calibrar valvulas"));
        tareas.add(new Tarea("Cambiar pastas y liquido de freno"));

        //Arrange
        var idRegistro = RegistroId.of("Reg01");
        var motoRegistro = new Moto(
                MotoId.of("Mot01"),
                new Color("Blanca"),
                new Estado(true),
                new Marca("Yamaha"),
                new Orden(
                        new Fecha(new Date()),
                        tareas,
                        new Precio(100000.0)
                        )
                );
        var clienteRegistro = new Cliente(
                ClienteId.of("Cli01"),
                new Telefono("98766789"),
                new Nombre("Manuel", "Velez")
        );

        //Act
        taller.asignarRegistro(idRegistro, motoRegistro, clienteRegistro, new Fecha(new Date()));

        //Assert
        assert Objects.nonNull(taller.registroId);
    }

    @Test
    void actualizarNombreEncargadoTest(){
        //Arrange
        var idEncargado = EncargadoId.of("Enc02");
        var nombreEncargado = new Nombre("Mario", "Gotze");
        var telefonoEncargado = new Telefono("12332121");

        //Act
        taller.asignarEncargado(idEncargado, nombreEncargado, telefonoEncargado);
        taller.actualizarNombreEncargado(idEncargado, new Nombre("Jorge", "Gonzales"));

        //Assert
        assert taller.encargado.nombre().getName().equals("Jorge");
        assert taller.encargado.nombre().getApellido().equals("Gonzales");
    }

    @Test
    void actualizarTelefonoEncargadoTest(){
        //Arrange
        var idEncargado = EncargadoId.of("Enc03");
        var nombreEncargado = new Nombre("Felipe", "Blanco");
        var telefonoEncargado = new Telefono("1234554321");

        //Act
        taller.asignarEncargado(idEncargado, nombreEncargado,telefonoEncargado);
        taller.actualizarTelefonoEncargado(idEncargado, new Telefono("5432112345"));

        //Assert
        assert taller.encargado.telefono().getValue().equals("5432112345");
    }

    @Test
    void actualizarNombreMecanicoTest(){
        //Arrange
        var idMecanico = MecanicoId.of("Mec02");
        var nombreMecanico = new Nombre("Victor", "Gomez");
        var telefonoMecanico = new Telefono("0987667890");

        //Act
        taller.agregarMecanico(idMecanico, nombreMecanico, telefonoMecanico);
        taller.actualizarNombreMecanico(idMecanico, new Nombre("Andres", "Serna"));

        var mecanico = taller.getMecanicoById(idMecanico).get();

        //Assert
        assert mecanico.nombre().getName().equals("Andres");
        assert mecanico.nombre().getApellido().equals("Serna");
    }

    @Test
    void actualizarTelefonoMecanicoTest(){
        //Arrange
        var idMecanico = MecanicoId.of("Mec02");
        var nombreMecanico = new Nombre("Victor", "Luna");
        var telefonoMecanico = new Telefono("0987667890");

        //Act
        taller.agregarMecanico(idMecanico, nombreMecanico, telefonoMecanico);
        taller.actualizarTelefonoMecanico(idMecanico, new Telefono("6789009876"));

        var mecanico = taller.getMecanicoById(idMecanico).get();

        //Assert
        assert mecanico.telefono().getValue().equals("6789009876");
    }
}
