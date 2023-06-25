package ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class eventos_mouse extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eventos_mouse frame = new eventos_mouse();
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
	public eventos_mouse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiPal1 = new JLabel("text 1");
		etiPal1.setBounds(24, 26, 155, 14);
		contentPane.add(etiPal1);
		
		JLabel etiPal2 = new JLabel("text 2");
		etiPal2.setBounds(24, 51, 155, 14);
		contentPane.add(etiPal2);
		
		JLabel etiPal3 = new JLabel("text 3");
		etiPal3.setBounds(24, 77, 155, 14);
		contentPane.add(etiPal3);
		
		JLabel etiPal4 = new JLabel("text 4");
		etiPal4.setBounds(24, 102, 155, 14);
		contentPane.add(etiPal4);
		
		JLabel etiOcultar = new JLabel("Ocultar");
		etiOcultar.setBackground(new Color(255, 128, 255));
		etiOcultar.setForeground(new Color(128, 128, 255));
		etiOcultar.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiOcultar.setBounds(24, 142, 155, 14);
		contentPane.add(etiOcultar);

		etiOcultar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				etiPal1.setVisible(false);
				etiPal2.setVisible(false);
				etiPal3.setVisible(false);
				etiPal4.setVisible(false);
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				etiPal1.setVisible(true);
				etiPal2.setVisible(true);
				etiPal3.setVisible(true);
				etiPal4.setVisible(true);
				super.mouseExited(e);
			}
		});
	}

}
