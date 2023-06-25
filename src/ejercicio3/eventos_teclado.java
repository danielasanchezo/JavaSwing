package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;

public class eventos_teclado extends JFrame {

	private JPanel contentPane;
	private JTextField txtTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eventos_teclado frame = new eventos_teclado();
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
	public eventos_teclado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(111, 30, 103, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel etiTexto = new JLabel("");
		etiTexto.setBounds(224, 33, 126, 14);
		contentPane.add(etiTexto);
		
		JButton btnVaciar = new JButton("vaciar");
		btnVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTexto.setText("");
				etiTexto.setText("");
			}
		});
		
		txtTexto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent evento) {
				if (evento.getKeyCode() == KeyEvent.VK_ENTER) {
					etiTexto.setText(txtTexto.getText());
				}
			}
		});
		
		btnVaciar.setBounds(111, 75, 103, 23);
		contentPane.add(btnVaciar);
	}

}
