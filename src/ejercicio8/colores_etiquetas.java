package ejercicio8;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class colores_etiquetas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					colores_etiquetas frame = new colores_etiquetas();
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
	public colores_etiquetas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiTexto = new JLabel("HOLA MUNDO");
		etiTexto.setBounds(160, 167, 107, 68);
		contentPane.add(etiTexto);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setForeground(Color.blue);
			}
		});
		btnAzul.setBounds(21, 23, 89, 23);
		contentPane.add(btnAzul);
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setForeground(Color.red);
			}
		});
		btnRojo.setBounds(21, 57, 89, 23);
		contentPane.add(btnRojo);
		
		JButton btnAzul_1_1 = new JButton("Verde");
		btnAzul_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setForeground(Color.green);
			}
		});
		btnAzul_1_1.setBounds(21, 91, 89, 23);
		contentPane.add(btnAzul_1_1);
		
		JButton btnFondoAzul = new JButton("Fondo azul");
		btnFondoAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setBackground(Color.blue);
				etiTexto.setOpaque(true);
			}
		});
		btnFondoAzul.setBounds(138, 23, 129, 23);
		contentPane.add(btnFondoAzul);
		
		JButton btnFondoRojo = new JButton("Fondo rojo");
		btnFondoRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setBackground(Color.red);
				etiTexto.setOpaque(true);
			}
		});
		btnFondoRojo.setBounds(138, 57, 129, 23);
		contentPane.add(btnFondoRojo);
		
		JButton btnFondoVerde = new JButton("Fondo verde");
		btnFondoVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setBackground(Color.green);
				etiTexto.setOpaque(true);
			}
		});
		btnFondoVerde.setBounds(138, 91, 129, 23);
		contentPane.add(btnFondoVerde);
		
		JButton btnTransparente = new JButton("Transparente");
		btnTransparente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setBackground(Color.white);
				etiTexto.setOpaque(false);
			}
		});
		btnTransparente.setBounds(292, 23, 118, 23);
		contentPane.add(btnTransparente);
		
		JButton btnAzul_1_2 = new JButton("Opaca");
		btnAzul_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto.setOpaque(true);
			}
		});
		btnAzul_1_2.setBounds(292, 57, 118, 23);
		contentPane.add(btnAzul_1_2);
	}

}
