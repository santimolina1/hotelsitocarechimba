package tests;

import org.junit.jupiter.api.Test;

import logica_.Reserva;

import static org.junit.jupiter.api.Assertions.*;

public class reserva_integracion {

    @Test
    public void testRealizarReserva() {
        // Parámetros de la reserva
        String fechaInicio = "2023-06-10";
        String fechaSalida = "2023-06-12";
        String nombre = "John Doe";
        String cedula = "123456789";
        String tipoHabitacion = "Doble";

        // Realizar la reserva
        Reserva reserva = new Reserva(null, null, null, 0, 0, 0, false, tipoHabitacion);
        boolean reservaExitosa = reserva.Reserva(fechaInicio, fechaSalida, nombre, cedula, tipoHabitacion);

        // Verificar que la reserva se haya realizado correctamente
        assertTrue(reservaExitosa);
    }
}
