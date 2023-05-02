package primerExamen;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class DialogoAltaAlumno extends JDialog {

	private static final long serialVersionUID = 1L;
	private Principal controlador;

	public DialogoAltaAlumno(Principal controlador) {
		super();
		this.controlador = controlador;
	}

	// A�ade un alumno con los datos de los campos anteriores.
	// Una vez a�adido, debe salir un mensaje de confirmaci�n y cerrarse el di�logo.
	// Si no hay curso seleccionado, debe salir un mensaje de error.
	private void botonAltaAlumnoPulsado() {

	}

	// Carga los cursos en el combo de cursos.
	// Este m�todo es llamado tras cargarse los datos iniciales (esta llamada ya
	// est� realizada).
	public void actualizaComboCursos() {

	}

	private void error(String msg) {
		JOptionPane.showMessageDialog(this, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	private void msg(String msg) {
		JOptionPane.showMessageDialog(this, msg, "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
	}
}
