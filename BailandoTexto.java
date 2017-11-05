import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BailandoTexto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Se lanza la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Se crea la ventana principal
	 */
	public BailandoTexto() {
		//Declaración y caracteristicas Marco y Panel de contenido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Caja de texto izquierda
		textField = new JTextField();
		textField.setBounds(10, 117, 136, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Caja de texto derecha
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(288, 117, 136, 20);
		contentPane.add(textField_1);
		
		//Botón izquierda
		JButton button = new JButton("-->"); //Botón 1
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pasa el texto de la izquierda a la derecha
				textField_1.setText(textField.getText());
				textField.setText("");
			}
		});
		button.setBounds(57, 51, 89, 23);
		contentPane.add(button);
		
		//Botón derecha
		JButton button_1 = new JButton("<--"); //Botón 2
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Pasa el texto de la derecha a la izquierda
				textField.setText(textField_1.getText());
				textField_1.setText("");
			}
		});
		button_1.setBounds(288, 51, 89, 23);
		contentPane.add(button_1);
	}
}
