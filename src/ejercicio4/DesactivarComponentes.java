package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DesactivarComponentes extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesactivarComponentes frame = new DesactivarComponentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DesactivarComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(160, 33, 178, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(160, 73, 178, 20);
		contentPane.add(txtCiudad);
		
		JLabel txtFrase = new JLabel("");
		txtFrase.setBounds(45, 221, 366, 29);
		contentPane.add(txtFrase);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrase.setText("Usted se llama " + txtNombre.getText()+
						" y vive en " + txtCiudad.getText());
			}
		});
		btnAceptar.setBounds(157, 115, 181, 23);
		contentPane.add(btnAceptar);
		
		JButton btnDesactivar = new JButton("Desactivar");
		btnDesactivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrase.setEnabled(false);
				txtNombre.setEnabled(false);
				txtCiudad.setEnabled(false);
			}
		});
		btnDesactivar.setBounds(160, 183, 181, 23);
		contentPane.add(btnDesactivar);
		
		JButton btnActivar = new JButton("Activar");
		btnActivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrase.setEnabled(true);
				txtNombre.setEnabled(true);
				txtCiudad.setEnabled(true);
			}
		});
		btnActivar.setBounds(160, 149, 178, 23);
		contentPane.add(btnActivar);
	}
}
