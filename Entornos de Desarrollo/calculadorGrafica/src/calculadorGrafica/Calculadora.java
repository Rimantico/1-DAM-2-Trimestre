package calculadorGrafica;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import javax.swing.border.EmptyBorder;



public class Calculadora extends JFrame {



private JTextField txtNum1;

private JTextField txtNum2;

private JTextField txtResultado;



public static void main(String[] args) {

EventQueue.invokeLater(() -> {

try {

Calculadora frame = new Calculadora();

frame.setVisible(true);

} catch (Exception e) {

e.printStackTrace();

}

});

}



public Calculadora() {

setTitle("Calculadora Gráfica");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setBounds(100, 100, 420, 380);

setLocationRelativeTo(null);



JPanel contentPane = new JPanel();

contentPane.setBackground(new Color(240, 248, 255));

contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));

setContentPane(contentPane);

contentPane.setLayout(null);



JLabel lblTitulo = new JLabel("CALCULADORA");

lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 22));

lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);

lblTitulo.setBounds(80, 10, 240, 30);

contentPane.add(lblTitulo);



JLabel lblNum1 = new JLabel("Número 1:");

lblNum1.setBounds(40, 70, 100, 20);

contentPane.add(lblNum1);



txtNum1 = new JTextField();

txtNum1.setBounds(150, 70, 180, 25);

contentPane.add(txtNum1);



JLabel lblNum2 = new JLabel("Número 2:");

lblNum2.setBounds(40, 110, 100, 20);

contentPane.add(lblNum2);



txtNum2 = new JTextField();

txtNum2.setBounds(150, 110, 180, 25);

contentPane.add(txtNum2);



JLabel lblResultado = new JLabel("Resultado:");

lblResultado.setBounds(40, 150, 100, 20);

contentPane.add(lblResultado);



txtResultado = new JTextField();

txtResultado.setEditable(false);

txtResultado.setFont(new Font("Segoe UI", Font.BOLD, 14));

txtResultado.setBackground(Color.WHITE);

txtResultado.setBounds(150, 150, 180, 30);

contentPane.add(txtResultado);



JButton btnSuma = new JButton("+");

btnSuma.setBounds(40, 210, 70, 40);

contentPane.add(btnSuma);



JButton btnResta = new JButton("-");

btnResta.setBounds(120, 210, 70, 40);

contentPane.add(btnResta);



JButton btnMulti = new JButton("×");

btnMulti.setBounds(200, 210, 70, 40);

contentPane.add(btnMulti);



JButton btnDiv = new JButton("÷");

btnDiv.setBounds(280, 210, 70, 40);

contentPane.add(btnDiv);



JButton btnSalir = new JButton("Salir");

btnSalir.setBackground(new Color(220, 20, 60));

btnSalir.setForeground(Color.WHITE);

btnSalir.setBounds(150, 270, 120, 35);

contentPane.add(btnSalir);



// Eventos

btnSuma.addActionListener(e -> calcular('+'));

btnResta.addActionListener(e -> calcular('-'));

btnMulti.addActionListener(e -> calcular('*'));

btnDiv.addActionListener(e -> calcular('/'));



btnSalir.addActionListener(e -> System.exit(0));

}



private void calcular(char operacion) {

try {

double n1 = Double.parseDouble(txtNum1.getText());

double n2 = Double.parseDouble(txtNum2.getText());

double resultado = 0;



switch (operacion) {

case '+':

resultado = n1 + n2;

break;

case '-':

resultado = n1 - n2;

break;

case '*':

resultado = n1 * n2;

break;

case '/':

if (n2 == 0) {

JOptionPane.showMessageDialog(this,

"No se puede dividir entre cero",

"Error",

JOptionPane.ERROR_MESSAGE);

return;

}

resultado = n1 / n2;

break;

}



txtResultado.setText(String.valueOf(resultado));



} catch (NumberFormatException ex) {

JOptionPane.showMessageDialog(this,

"Introduce valores numéricos válidos",

"Error",

JOptionPane.ERROR_MESSAGE);

}

}

}
