package co.com.sofka.domain.reparacion;

import co.com.sofka.domain.generico.Estado;
import co.com.sofka.domain.generico.Marca;
import co.com.sofka.domain.reparacion.values.*;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class ReparacionTest {

    ReparacionId idReparacion = ReparacionId.of("Repa01");
    Duracion duracionReparacion = new Duracion("35 horas");
    Herramienta herramientaReparacion = new Herramienta(
            HerramientaId.of("Herr01"),
            new Tamanio("12"),
            new Estado(true),
            new Marca("Stanly")
    );
    Repuesto repuestoReparacion = new Repuesto(
            RepuestoId.of("Rep01"),
            new Estado(true),
            new Marca("KTM")
    );

    Reparacion reparacion = new Reparacion(idReparacion, herramientaReparacion, repuestoReparacion, duracionReparacion);

    @Test
    void crearReparacionTest(){
        var idReparacion = ReparacionId.of("Repa01");
        var duracionReparacion = new Duracion("35 horas");
        var herramientaReparacion = new Herramienta(
                HerramientaId.of("Herr01"),
                new Tamanio("12"),
                new Estado(true),
                new Marca("Stanly")
        );
        var repuestoReparacion = new Repuesto(
                RepuestoId.of("Rep01"),
                new Estado(true),
                new Marca("KTM")
        );

        var reparacion = new Reparacion(idReparacion, herramientaReparacion, repuestoReparacion, duracionReparacion);

        assert Objects.nonNull(reparacion.identity());
        assert Objects.nonNull(reparacion.herramienta);
        assert Objects.nonNull(reparacion.repuesto);
        assert Objects.nonNull(reparacion.duracion);
    }

    @Test
    void agregarHerramientaTest(){
        var idHerramienta = HerramientaId.of("Herr01");
        var tamanioHerramienta = new Tamanio("20");
        var estadoHerramienta = new Estado(true);
        var marcaHerramienta = new Marca("Stanly");

        reparacion.agregarHerramienta(idHerramienta, tamanioHerramienta, estadoHerramienta, marcaHerramienta);

        assert Objects.nonNull(reparacion.herramienta.identity());
        assert reparacion.herramienta.identity().value().equals("Herr01");
        assert Objects.nonNull(reparacion.herramienta.tamanio().value());
        assert reparacion.herramienta.tamanio().value().equals("20");
        assert Objects.nonNull(reparacion.herramienta.estado());
        assert reparacion.herramienta.estado().getValue().equals(true);
        assert Objects.nonNull(reparacion.herramienta.marca());
        assert reparacion.herramienta.marca().getValue().equals("Stanly");
    }

    @Test
    void agregarRepuestoTest(){
        var idRepuesto = RepuestoId.of("Repu01");
        var estado = new Estado(true);
        var marca = new Marca("Auteco");

        reparacion.agregarRepuesto(idRepuesto, estado, marca);

        assert Objects.nonNull(reparacion.repuesto.identity());
        assert reparacion.repuesto.identity().value().equals("Repu01");
        assert Objects.nonNull(reparacion.repuesto.estado());
        assert reparacion.repuesto.estado().getValue().equals(true);
        assert Objects.nonNull(reparacion.repuesto.marca());
        assert reparacion.repuesto.marca().getValue().equals("Auteco");
    }

    @Test
    void actualizarDuracionTest(){
        var duracion = new Duracion("40 horas");

        reparacion.actualizarDuracion(reparacion.identity(), duracion);

        assert reparacion.duracion.value().equals("40 horas");
    }

    @Test
    void actualizarEstadoHerramientaTest(){
        var estado = new Estado(false);

        reparacion.actualizarEstadoHerramienta(reparacion.herramienta.identity(), estado);

        assert reparacion.herramienta.estado().getValue().equals(false);
    }

    @Test
    void actualizarEstadoRepuestoTest(){
        var estado = new Estado(false);

        reparacion.actualizarEstadoRepuesto(reparacion.repuesto.identity(), estado);

        assert reparacion.repuesto.estado().getValue().equals(false);
    }
}
