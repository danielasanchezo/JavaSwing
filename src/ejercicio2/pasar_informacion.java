
package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pasar_informacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pasar_informacion frame = new pasar_informacion();
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
	public pasar_informacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(156, 45, 147, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel etiTexto1 = new JLabel("");
		etiTexto1.setBounds(23, 51, 117, 14);
		contentPane.add(etiTexto1);
		
		JLabel etiTexto2 = new JLabel("");
		etiTexto2.setBounds(23, 76, 117, 14);
		contentPane.add(etiTexto2);
		
		JButton btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto1.setText(txtTexto.getText());
			}
		});
		btnTraspasa1.setBounds(156, 87, 147, 23);
		contentPane.add(btnTraspasa1);
		
		JButton btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiTexto2.setText(txtTexto.getText());
			}
		});
		btnTraspasa2.setBounds(156, 124, 147, 23);
		contentPane.add(btnTraspasa2);
	}
}
