package ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class mouse_posicionamiento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mouse_posicionamiento frame = new mouse_posicionamiento();
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
	public mouse_posicionamiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiNombre = new JLabel("Daniela");
		etiNombre.setForeground(new Color(128, 128, 255));
		etiNombre.setBounds(44, 147, 357, 14);
		etiNombre.setBackground(Color.yellow);
		etiNombre.setOpaque(true);
		contentPane.add(etiNombre);
		
		JButton btnEsquina = new JButton("Esquina");
		btnEsquina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnEsquina) {
					etiNombre.setLocation(400,0);
				}
			}
		});
		btnEsquina.setBounds(80, 24, 89, 23);
		contentPane.add(btnEsquina);
		
		JButton btnCentro = new JButton("Centro");
		btnCentro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnCentro) {
					etiNombre.setLocation(200,200);
				}
			}
		});
		btnCentro.setBounds(197, 24, 89, 23);
		contentPane.add(btnCentro);
		
		JButton btnAgrandar = new JButton("Agrandar");
		btnAgrandar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnAgrandar) {
					etiNombre.setSize(300, 30);
				}
			}
		});
		btnAgrandar.setBounds(80, 66, 89, 23);
		contentPane.add(btnAgrandar);
		
		JButton btnAchicar = new JButton("Achicar");
		btnAchicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource()==btnAchicar) {
					etiNombre.setSize(80, 20);
				}
			}
		});
		
		
		btnAchicar.setBounds(197, 58, 89, 23);
		contentPane.add(btnAchicar);
			
	}

}
