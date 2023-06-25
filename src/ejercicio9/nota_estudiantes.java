package ejercicio9;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nota_estudiantes extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nota_estudiantes frame = new nota_estudiantes();
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
	public nota_estudiantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setBounds(144, 25, 86, 20);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.setBounds(144, 69, 86, 20);
		contentPane.add(txtSegundoTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(144, 108, 86, 20);
		contentPane.add(txtTercerTrimestre);
		
		JLabel etiNotaFinal = new JLabel("");
		etiNotaFinal.setBounds(34, 192, 350, 14);
		contentPane.add(etiNotaFinal);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(34, 217, 350, 14);
		contentPane.add(etiResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double suma, promedio, nota1, nota2, nota3;
				
				nota1 = Double.parseDouble(txtPrimerTrimestre.getText());
				nota2 = Double.parseDouble(txtSegundoTrimestre.getText());
				nota3 = Double.parseDouble(txtTercerTrimestre.getText());
				
				suma = nota1 + nota2 + nota3;
				promedio = suma/3;
				
				etiNotaFinal.setText("Su nota final es: " + promedio);
				
				if (promedio < 5) {
					etiResultado.setText("SUSPENSO");
					etiResultado.setForeground(Color.red);
					etiNotaFinal.setForeground(Color.red);
				}else if(promedio>=5) {
					etiResultado.setText("APROBADO");
					etiResultado.setForeground(Color.black);
					etiNotaFinal.setForeground(Color.black);
				}
			
			}
		});
		
		btnCalcular.setBounds(141, 158, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel = new JLabel("Nota 1");
		lblNewLabel.setBounds(53, 28, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNota = new JLabel("Nota 2");
		lblNota.setBounds(53, 72, 46, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota_1 = new JLabel("Nota 3");
		lblNota_1.setBounds(53, 111, 46, 14);
		contentPane.add(lblNota_1);
	}
}
