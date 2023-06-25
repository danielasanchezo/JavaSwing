package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaoperaciones extends JFrame{

	private JPanel panelPrincipal;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ventanaoperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
		setTitle("VENTANA DATOS");
		setResizable(false);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel etiNombre = new JLabel("Daniela");
		etiNombre.setBounds(63, 11, 92, 14);
		panelPrincipal.add(etiNombre);
		
		JLabel etiCiudad = new JLabel("Armenia");
		etiCiudad.setBounds(63, 36, 92, 14);
		panelPrincipal.add(etiCiudad);
		
		JButton btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				etiNombre.setVisible(false);
			}
		});
		btnOcultarNombre.setBounds(63, 61, 164, 23);
		panelPrincipal.add(btnOcultarNombre);
		
		JButton btnVisualizarNombre = new JButton("Visualizar Nombre");
		btnVisualizarNombre.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				etiNombre.setVisible(true);
			}
		});
		btnVisualizarNombre.setBounds(63, 95, 164, 23);
		panelPrincipal.add(btnVisualizarNombre);
		
		JButton btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiCiudad.setVisible(false);
			}
		});
		btnOcultarCiudad.setBounds(63, 129, 164, 23);
		panelPrincipal.add(btnOcultarCiudad);
		
		JButton btnVisualizarCiudad = new JButton("Visualizar Ciudad");
		btnVisualizarCiudad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiCiudad.setVisible(true);
			}
		});
		btnVisualizarCiudad.setBounds(63, 163, 164, 23);
		panelPrincipal.add(btnVisualizarCiudad);
		
	}
}
