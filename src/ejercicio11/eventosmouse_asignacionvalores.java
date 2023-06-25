package ejercicio11;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class eventosmouse_asignacionvalores extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eventosmouse_asignacionvalores frame = new eventosmouse_asignacionvalores();
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
	public eventosmouse_asignacionvalores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiUno = new JLabel("1");
		etiUno.setBounds(35, 55, 46, 14);
		contentPane.add(etiUno);
		
		JLabel etiDos = new JLabel("2");
		etiDos.setBounds(35, 80, 46, 14);
		contentPane.add(etiDos);
		
		JLabel etiTres = new JLabel("3");
		etiTres.setBounds(35, 105, 46, 14);
		contentPane.add(etiTres);
		
		JLabel etiCuatro = new JLabel("4");
		etiCuatro.setBounds(35, 130, 46, 14);
		contentPane.add(etiCuatro);
		
		JLabel etiCinco = new JLabel("5");
		etiCinco.setBounds(142, 30, 46, 14);
		contentPane.add(etiCinco);
		
		JLabel etiSeis = new JLabel("6");
		etiSeis.setBounds(142, 55, 46, 14);
		contentPane.add(etiSeis);
		
		JLabel etiCero = new JLabel("0");
		etiCero.setBounds(35, 30, 46, 14);
		contentPane.add(etiCero);
		
		JLabel etiSiete = new JLabel("7");
		etiSiete.setBounds(142, 80, 46, 14);
		contentPane.add(etiSiete);
		
		JLabel etiOcho = new JLabel("8");
		etiOcho.setBounds(142, 105, 46, 14);
		contentPane.add(etiOcho);
		
		JLabel etiNueve = new JLabel("9");
		etiNueve.setBounds(142, 130, 46, 14);
		contentPane.add(etiNueve);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(227, 52, 139, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumero.setText("");
			}
		});
		btnBorrar.setBounds(227, 101, 139, 23);
		contentPane.add(btnBorrar);
		
		etiCero.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiCero.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
	
		etiUno.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiUno.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
		
		etiDos.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiDos.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
		
		etiTres.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiTres.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
		
		etiCuatro.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiCuatro.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
		
		etiCinco.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiCinco.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
		
		etiSeis.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiSeis.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
		
		etiSiete.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiSiete.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
		
		etiOcho.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiOcho.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
		
		etiNueve.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				String valorTxt = txtNumero.getText();
				
				txtNumero.setText(valorTxt + etiNueve.getText());
				super.mouseEntered(e);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				super.mouseExited(e);
			}
		});
	}

}
