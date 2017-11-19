import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Jugador.Jugador;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblApellidos;
	private JTextField textField_1;
	private JLabel lblEdad;
	private JTextField textField_2;
	private JLabel lblPuntos;
	private JTextField textField_3;

	/**
	 * Lanzamos la aplicación
	 */
	public static void main(String[] args) { //Creamos la clase principal
		//Generamos al Jugador
		
		Jugador jugador1 = new Jugador();
		jugador1.setNombre("Pepe");
		jugador1.setApellidos("Pérez Menéndez");
		jugador1.setEdad(20);
		System.out.println(jugador1.toString());
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Definimos la ventana principal
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300); //Coordenadas de la ventana
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField(); //Campo de texto NOMBRE
		textField.setBounds(105, 28, 294, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText("Pepe");
		
		JLabel lblNombre = new JLabel("Nombre"); //Etiqueta NOMBRE
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNombre.setBounds(10, 29, 85, 14);
		contentPane.add(lblNombre);
		
		lblApellidos = new JLabel("Apellidos"); //Etiqueta APELLIDOS
		lblApellidos.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblApellidos.setBounds(10, 68, 85, 20);
		contentPane.add(lblApellidos);
		
		textField_1 = new JTextField(); //Campo de texto APELLIDOS
		textField_1.setColumns(10);
		textField_1.setBounds(105, 70, 294, 20);
		contentPane.add(textField_1);
		textField_1.setText("Pérez Menéndez");
		
		lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblEdad.setBounds(10, 116, 46, 14);
		contentPane.add(lblEdad);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(105, 110, 46, 20);
		contentPane.add(textField_2);
		textField_2.setText("20");
		
		lblPuntos = new JLabel("Puntos");
		lblPuntos.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblPuntos.setBounds(239, 118, 64, 14);
		contentPane.add(lblPuntos);
		
		textField_3 = new JTextField();
		textField_3.setBounds(313, 115, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setText(" ");
	}
}
