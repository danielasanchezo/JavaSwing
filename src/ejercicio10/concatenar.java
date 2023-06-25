package ejercicio10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class concatenar extends JFrame {

	private JPanel contentPane;
	private JTextField textPalabra1;
	private JTextField txtPalabra2;
	private JLabel lblNewLabel;
	private JLabel lblPalabra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					concatenar frame = new concatenar();
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
	public concatenar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPalabra1 = new JTextField();
		textPalabra1.setBounds(154, 45, 134, 20);
		contentPane.add(textPalabra1);
		textPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(154, 89, 134, 20);
		contentPane.add(txtPalabra2);
		
		JLabel etiTexto = new JLabel("");
		etiTexto.setBounds(27, 215, 374, 14);
		contentPane.add(etiTexto);
		
		JButton btnConcatena = new JButton("Concatena");
		btnConcatena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setText(textPalabra1.getText() + " " + txtPalabra2.getText());
			}
		});
		btnConcatena.setBounds(154, 155, 134, 23);
		contentPane.add(btnConcatena);
		
		lblNewLabel = new JLabel("Palabra 1");
		lblNewLabel.setBounds(53, 48, 91, 14);
		contentPane.add(lblNewLabel);
		
		lblPalabra = new JLabel("Palabra 2");
		lblPalabra.setBounds(53, 92, 91, 14);
		contentPane.add(lblPalabra);
		
		
	}

}
