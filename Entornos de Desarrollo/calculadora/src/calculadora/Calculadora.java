package calculadora;

// Importacion de los paquetes
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import javax.swing.JButton;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;



public class Calculadora extends JFrame {



private static final long serialVersionUID = 1L;

private JPanel contentPane;

private JTextField textField;

private JTextField textField_1;

private JTextField textField_2;



public static void main(String[] args) {

EventQueue.invokeLater(new Runnable() {

public void run() {

try {

Calculadora frame = new Calculadora();

frame.setVisible(true);

} catch (Exception e) {

e.printStackTrace();

}

}

});

}



// Parte del fondo de la calculadora

public Calculadora() {

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(100, 100, 761, 642);

contentPane = new JPanel();

contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);

contentPane.setLayout(null);

// Titulo de la calculadora

JLabel lblNewLabel = new JLabel("Calculadora");

lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));

lblNewLabel.setBounds(225, 35, 308, 75);

contentPane.add(lblNewLabel);

// Introducir el primer numero

textField = new JTextField();

textField.setHorizontalAlignment(SwingConstants.RIGHT);

textField.setBounds(40, 182, 86, 20);

contentPane.add(textField);

textField.setColumns(10);

// Introducir el segundo numero

textField_1 = new JTextField();

textField_1.setHorizontalAlignment(SwingConstants.RIGHT);

textField_1.setBounds(248, 182, 86, 20);

contentPane.add(textField_1);

textField_1.setColumns(10);

// Resultado de la operacion que hallamos hecho

textField_2 = new JTextField();

textField_2.setHorizontalAlignment(SwingConstants.RIGHT);

textField_2.setEditable(false);

textField_2.setBounds(387, 182, 86, 20);

contentPane.add(textField_2);

textField_2.setColumns(10);



// BOTÓN SUMAR

JButton btnSumar = new JButton("+");

btnSumar.setBounds(137, 155, 89, 23);

contentPane.add(btnSumar);



btnSumar.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

try {

double n1 = Double.parseDouble(textField.getText());

double n2 = Double.parseDouble(textField_1.getText());

double resultado = n1 + n2;

textField_2.setText(String.valueOf(resultado));

} catch (NumberFormatException ex) {

JOptionPane.showMessageDialog(null,

"Introduce números válidos",

"Error",

JOptionPane.ERROR_MESSAGE);

}

}

});



// BOTÓN MULTIPLICAR

JButton btnMultiplicar = new JButton("*");

btnMultiplicar.setBounds(136, 196, 89, 23);

contentPane.add(btnMultiplicar);



btnMultiplicar.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

try {

double n1 = Double.parseDouble(textField.getText());

double n2 = Double.parseDouble(textField_1.getText());

double resultado = n1 * n2;

textField_2.setText(String.valueOf(resultado));

} catch (NumberFormatException ex) {

JOptionPane.showMessageDialog(null,

"Introduce números válidos antes de pulsar en la operación",

"Error",

JOptionPane.ERROR_MESSAGE);

}

}

});



// BOTÓN SALIR

JButton btnSalir = new JButton("Salir");

btnSalir.setBounds(301, 253, 89, 23);

contentPane.add(btnSalir);
JButton btnNewButton = new JButton("-");
btnNewButton.setBounds(137, 230, 89, 23);
contentPane.add(btnNewButton);

// Con esto saldremos del programa

btnSalir.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent e) {

System.exit(0);
}
});
}
}