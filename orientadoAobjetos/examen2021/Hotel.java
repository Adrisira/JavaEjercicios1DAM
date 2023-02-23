package examen2021;

import java.util.Arrays;

public class Hotel {
	private Reserva tReservas[];
	private Cliente tClientes[];
	private Habitacion tHabitaciones[];

	public Hotel() {
		this.tClientes = new Cliente[0];
		this.tHabitaciones = new Habitacion[0];
		this.tReservas = new Reserva[0];
	}

	public void anyadeCliente(Cliente cliente) {
		Cliente tNueva[] = new Cliente[this.tClientes.length + 1];
		for (int i = 0; i < this.tClientes.length; i++)
			tNueva[i] = this.tClientes[i];
		tNueva[this.tClientes.length] = cliente;
		this.tClientes = tNueva;
	}

	public void anyadeHabitacion(Habitacion habitacion) {
		Habitacion tNueva[] = new Habitacion[this.tHabitaciones.length + 1];
		for (int i = 0; i < this.tHabitaciones.length; i++)
			tNueva[i] = this.tHabitaciones[i];
		tNueva[this.tHabitaciones.length] = habitacion;
		this.tHabitaciones = tNueva;
	}

	public void anyadeReserva(Reserva reserva) {
		Reserva tNueva[] = new Reserva[this.tReservas.length + 1];
		for (int i = 0; i < this.tReservas.length; i++)
			tNueva[i] = this.tReservas[i];
		tNueva[this.tReservas.length] = reserva;
		this.tReservas = tNueva;
	}

	// A
	public Reserva[] getReservasDeHabitacion(Habitacion habitacion) {
		Reserva[] reservaHabitacion = new Reserva[0];
		for (int i = 0; i < this.tReservas.length; i++) {
			if (this.tReservas[i].getHabitacion().equals(habitacion)) {
				reservaHabitacion = Arrays.copyOf(reservaHabitacion, reservaHabitacion.length + 1);
				reservaHabitacion[reservaHabitacion.length - 1] = tReservas[i];
			}
		}
		return reservaHabitacion;
	}

	// B
	public Habitacion[] habitacionesOcupadasElDia(Fecha fecha) {
		Habitacion[] habitacionesOcupadasDia = new Habitacion[0];
		for (int i = 0; i < this.tReservas.length; i++) {
			if (this.tReservas[i].getFechaInicio().compareTo(fecha) <= 0
					&& this.tReservas[i].getFechaFin().compareTo(fecha) >= 0) {
				habitacionesOcupadasDia = Arrays.copyOf(habitacionesOcupadasDia, habitacionesOcupadasDia.length + 1);
				habitacionesOcupadasDia[habitacionesOcupadasDia.length - 1] = tReservas[i].getHabitacion();
			}
		}
		return habitacionesOcupadasDia;
	}

	// C
	public boolean habitacionDisponible(Habitacion habitacion, Fecha inicio, Fecha fin) {
		boolean estaOcupada = true;
		for (int i = 0; i < this.tReservas.length; i++) {
			if (this.tReservas[i].getHabitacion().equals(habitacion)
					&& this.tReservas[i].getFechaInicio().compareTo(inicio) >= 0
					&& this.tReservas[i].getFechaFin().compareTo(inicio) >= 0) {
				estaOcupada = false;
			}
		}
		return estaOcupada;
	}

	// D
	public boolean hayErroresEnReservas() {
		boolean hayErrores = false;
		for (int i = 0; i < this.tReservas.length && !hayErrores; i++) {
			for (int j = 1; j < this.tReservas.length; j++) {
				if (this.tReservas[i].getCliente().equals(this.tReservas[j].getCliente())) {
					if (this.tReservas[i].getFechaInicio().compareTo(this.tReservas[j].getFechaInicio()) == 0) {
						hayErrores = true;
					}
				}
			}
		}
		return hayErrores;
	}
}
