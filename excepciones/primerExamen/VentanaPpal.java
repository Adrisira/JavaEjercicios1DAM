package primerExamen;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import javax.swing.JCheckBox;

public class VentanaPpal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Principal controlador;
	private DialogoAltaAlumno dialogoAlta;

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTextArea textAreaConsultas;
	private JPanel panel_2;
	private JLabel lblAlumno;
	private JComboBox<Alumno> comboBoxAlumnos;
	private JPanel panel_3;
	private JCheckBox chckbxTodos;
	private JPanel panel_4;
	private JCheckBox chckbxMedia;
	private JCheckBox chckbxMatriculadoEnMas1Curso_1;
	private JButton btnNewButton;
	private JCheckBox chckbxConsultaSuspensas;
	private JButton btnListarAlumnosNotas;
	private JButton btnListarAsignaturas;
	private JPanel panel_5;
	private JLabel lblNewLabel;
	private JComboBox<Asignatura> comboBoxAsignaturas;
	private JButton btnEliminar;

	public VentanaPpal(Principal controlador) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}

		this.controlador = controlador;
		this.dialogoAlta = new DialogoAltaAlumno(controlador);

		setMinimumSize(new Dimension(680, 400));
		setTitle("Gesti\u00F3n del alumnado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Consultas",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Listados",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane, BorderLayout.CENTER);

		textAreaConsultas = new JTextArea();
		scrollPane.setViewportView(textAreaConsultas);

		panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Borrado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap()));

		lblNewLabel = new JLabel("Asignatura: ");

		comboBoxAsignaturas = new JComboBox<Asignatura>();

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonBorrarAsignaturaPulsado();
			}
		});
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
						.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_5.createSequentialGroup().addGap(49).addComponent(btnEliminar))
								.addGroup(gl_panel_5.createSequentialGroup().addGap(19).addComponent(lblNewLabel)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(comboBoxAsignaturas, 0, 215, Short.MAX_VALUE)))
						.addContainerGap()));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_5
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).addComponent(
						comboBoxAsignaturas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGap(15).addComponent(btnEliminar).addContainerGap(19, Short.MAX_VALUE)));
		panel_5.setLayout(gl_panel_5);

		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Informaci\u00F3n avanzada", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));

		lblAlumno = new JLabel("Alumno:");
		lblAlumno.setEnabled(false);

		comboBoxAlumnos = new JComboBox<Alumno>();
		comboBoxAlumnos.setEnabled(false);
		// comboBoxAlumnos.setModel(new DefaultComboBoxModel(new String[] {"seleccione
		// un alumno ..."}));

		chckbxTodos = new JCheckBox("Todos");
		chckbxTodos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				checkTodosMarcado();
			}
		});
		chckbxTodos.setSelected(true);

		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "\u00BFQu\u00E9 quieres saber?", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));

		btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonConsultarPulsado();
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel_2.createSequentialGroup().addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup().addGap(5).addComponent(lblAlumno).addGap(5)
								.addComponent(comboBoxAlumnos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(chckbxTodos, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
										.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 254,
												Short.MAX_VALUE)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))))
						.addGap(20)));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup().addGap(8).addComponent(lblAlumno))
								.addGroup(gl_panel_2.createSequentialGroup().addGap(5)
										.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
												.addComponent(comboBoxAlumnos, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(chckbxTodos))))
						.addGap(18).addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(58, Short.MAX_VALUE)));

		chckbxMatriculadoEnMas1Curso_1 = new JCheckBox("Matriculado en m\u00E1s de un curso");

		chckbxMedia = new JCheckBox("Media notas");

		chckbxConsultaSuspensas = new JCheckBox("Consulta asignaturas suspensas");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup().addGap(5)
								.addComponent(chckbxMatriculadoEnMas1Curso_1))
						.addGroup(gl_panel_4.createSequentialGroup().addContainerGap().addComponent(chckbxMedia))
						.addGroup(gl_panel_4.createSequentialGroup().addContainerGap().addComponent(
								chckbxConsultaSuspensas, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(30, Short.MAX_VALUE)));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addGap(5).addComponent(chckbxMatriculadoEnMas1Curso_1)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(chckbxMedia)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(chckbxConsultaSuspensas)
						.addContainerGap(29, Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);
		panel_2.setLayout(gl_panel_2);

		panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);

		btnListarAlumnosNotas = new JButton("Listar Alumnos Notas");
		btnListarAlumnosNotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonListarTodoPulsado();
			}
		});

		btnListarAsignaturas = new JButton("Listar Asignaturas");
		btnListarAsignaturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonListarAsignaturasPorCursosPulsado();
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup().addGap(67)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(btnListarAsignaturas, GroupLayout.PREFERRED_SIZE, 129,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnListarAlumnosNotas)))
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(panel_2,
								GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(btnListarAlumnosNotas)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnListarAsignaturas).addGap(28)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE).addGap(196)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)));
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
	}

	protected void botonBorrarAsignaturaPulsado() {
		if (this.comboBoxAsignaturas.getSelectedIndex() == 0) {
			this.error("Seleccione asignatura");
		} else {
			this.controlador.borrarAsignatura(this.comboBoxAsignaturas.getSelectedItem().toString());
			this.msg("Asignatura eliminada");
		}

	}

	protected void botonListarAsignaturasPorCursosPulsado() {
		this.textAreaConsultas.setText(this.controlador.listadoAsignaturasPorCursos());

	}

	protected void botonConsultarPulsado() {
		try {
			String grupoNombreAlumno = "";
			if (!this.chckbxTodos.isSelected()) {
				grupoNombreAlumno = this.comboBoxAlumnos.getSelectedItem().toString();
			}
			boolean consultaMasUnCurso = this.chckbxMatriculadoEnMas1Curso_1.isSelected();
			boolean consultaMedia = this.chckbxMedia.isSelected();
			boolean consultaSuspensas = this.chckbxConsultaSuspensas.isSelected();
			this.textAreaConsultas.setText(this.controlador.consultar(grupoNombreAlumno, consultaMasUnCurso,
					consultaMedia, consultaSuspensas));

		} catch (NullPointerException e) {
			this.error("Seleccione alumno a consultar");
		}

	}

	protected void checkTodosMarcado() {
		if (this.chckbxTodos.isSelected()) {
			this.lblAlumno.setEnabled(false);
			this.comboBoxAlumnos.setEnabled(false);
		} else {
			this.lblAlumno.setEnabled(true);
			this.comboBoxAlumnos.setEnabled(true);
		}

	}

	private void botonListarTodoPulsado() {
		this.textAreaConsultas.setText(this.controlador.getListadoCompleto());
	}

	public void actualizaCombos() {
		this.comboBoxAlumnos.removeAllItems();
		this.comboBoxAlumnos.addItem(new Alumno("seleccione un alumno ...", ""));
		for (Alumno a : this.controlador.getConjuntoAlumnos()) {
			this.comboBoxAlumnos.addItem(a);
		}

		this.comboBoxAsignaturas.removeAllItems();
		this.comboBoxAsignaturas.addItem(new Asignatura("seleccione una asignatura ...", 0));
		for (Asignatura as : this.controlador.getConjuntoAsignaturas()) {
			this.comboBoxAsignaturas.addItem(as);
		}
		this.dialogoAlta.actualizaComboCursos();
	}

	private void error(String msg) {
		JOptionPane.showMessageDialog(this, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
	}

	private void msg(String msg) {
		JOptionPane.showMessageDialog(this, msg, "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
	}
}

