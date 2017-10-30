import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import java.awt.TextField;
import java.awt.Label;
import javax.swing.JLabel;

public class MiPerfil extends JFrame {

	private JPanel contentPane;	//Definimos el contenedor con todos sus elementos
	private JTextField textFieldNombre; //ETIQUETAS Y CAJAS DE TEXTO
	private JLabel lblDni; 
	private JTextField textFieldDNI;
	private JLabel lblEmail;
	private JTextField textFieldEmail;
	private JLabel lblEdad;
	private JTextField textField;
	private JLabel lblFechaDeNacimiento;
	private JTextField textField_1;
	private JLabel lblSexo;
	private JTextField txtH;

	/**
	 * Lanza la ventana
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPerfil frame = new MiPerfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Configura la ventana
	 */
	public MiPerfil() {
		//Configuración de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300); //Coord X, Coord Y, Alto, Ancho
		//Configuración del contenedor
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Etiqueta NOMBRE
		JLabel lblNombre = new JLabel("Nombre y Apellidos");
		lblNombre.setBounds(10, 13, 109, 14);
		contentPane.add(lblNombre);
		//Caja de texto NOMBRE
		textFieldNombre = new JTextField();
		textFieldNombre.setText("Ignacio Lorenzo Warleta");
		textFieldNombre.setBounds(10, 38, 321, 20);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		//Etiqueta DNI
		lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 149, 46, 14);
		contentPane.add(lblDni);
		//Caja de texto DNI
		textFieldDNI = new JTextField();
		textFieldDNI.setText("48677520K");
		textFieldDNI.setColumns(10);
		textFieldDNI.setBounds(10, 174, 114, 20);
		contentPane.add(textFieldDNI);
		//Etiqueta e-mail
		lblEmail = new JLabel("e-mail");
		lblEmail.setBounds(10, 205, 46, 14);
		contentPane.add(lblEmail);
		//Caja de texto e-mail
		textFieldEmail = new JTextField();
		textFieldEmail.setText("nlorenzow@gmail.com");
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(10, 230, 321, 20);
		contentPane.add(textFieldEmail);
		//Etiqueta EDAD
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(341, 13, 46, 14);
		contentPane.add(lblEdad);
		//Caja de texto EDAD
		textField = new JTextField();
		textField.setText("20");
		textField.setBounds(341, 38, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		//Etiqueta FECHA DE NACIMIENTO
		lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(10, 69, 125, 14);
		contentPane.add(lblFechaDeNacimiento);
		//Caja de texto FECHA DE NACIMIENTO
		textField_1 = new JTextField();
		textField_1.setText("04/07/1996");
		textField_1.setColumns(10);
		textField_1.setBounds(10, 94, 321, 20);
		contentPane.add(textField_1);
		//Etiqueta SEXO
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(341, 69, 46, 14);
		contentPane.add(lblSexo);
		//Caja de texto SEXO
		txtH = new JTextField();
		txtH.setText("H");
		txtH.setBounds(341, 94, 46, 20);
		contentPane.add(txtH);
		txtH.setColumns(10);
	}
}
