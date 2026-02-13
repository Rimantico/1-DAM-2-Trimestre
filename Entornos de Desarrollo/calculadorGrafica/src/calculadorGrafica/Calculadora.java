package calculadorGrafica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtResultado;

    // Campo activo actual
    private JTextField campoActivo;

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
        setBounds(100, 100, 617, 401);
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
        txtNum1.setEditable(false);
        txtNum1.setBounds(150, 70, 180, 25);
        contentPane.add(txtNum1);

        JLabel lblNum2 = new JLabel("Número 2:");
        lblNum2.setBounds(40, 110, 100, 20);
        contentPane.add(lblNum2);

        txtNum2 = new JTextField();
        txtNum2.setEditable(false);
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

        // Botones de operaciones
        JButton btnSuma = new JButton("+"); btnSuma.setBounds(40, 210, 70, 40); contentPane.add(btnSuma);
        JButton btnResta = new JButton("-"); btnResta.setBounds(120, 210, 70, 40); contentPane.add(btnResta);
        JButton btnMulti = new JButton("×"); btnMulti.setBounds(200, 210, 70, 40); contentPane.add(btnMulti);
        JButton btnDiv = new JButton("÷"); btnDiv.setBounds(280, 210, 70, 40); contentPane.add(btnDiv);

        JButton btnSalir = new JButton("Salir");
        btnSalir.setBackground(new Color(220, 20, 60));
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setBounds(150, 270, 120, 35);
        contentPane.add(btnSalir);

        // Botones numéricos
        JButton btnNum7 = new JButton("7"); btnNum7.setBounds(416, 79, 41, 27); contentPane.add(btnNum7);
        JButton btnNum8 = new JButton("8"); btnNum8.setBounds(488, 79, 41, 27); contentPane.add(btnNum8);
        JButton btnNum9 = new JButton("9"); btnNum9.setBounds(561, 80, 41, 27); contentPane.add(btnNum9);
        JButton btnNum4 = new JButton("4"); btnNum4.setBounds(416, 114, 41, 27); contentPane.add(btnNum4);
        JButton btnNum5 = new JButton("5"); btnNum5.setBounds(488, 115, 41, 27); contentPane.add(btnNum5);
        JButton btnNum6 = new JButton("6"); btnNum6.setBounds(561, 115, 41, 27); contentPane.add(btnNum6);
        JButton btnNum1 = new JButton("1"); btnNum1.setBounds(416, 152, 41, 27); contentPane.add(btnNum1);
        JButton btnNum2 = new JButton("2"); btnNum2.setBounds(488, 152, 41, 27); contentPane.add(btnNum2);
        JButton btnNum3 = new JButton("3"); btnNum3.setBounds(561, 152, 41, 27); contentPane.add(btnNum3);
        JButton btnNum0 = new JButton("0"); btnNum0.setBounds(488, 185, 41, 27); contentPane.add(btnNum0);

        // Eventos numéricos
        btnNum0.addActionListener(e -> agregarNumero("0"));
        btnNum1.addActionListener(e -> agregarNumero("1"));
        btnNum2.addActionListener(e -> agregarNumero("2"));
        btnNum3.addActionListener(e -> agregarNumero("3"));
        btnNum4.addActionListener(e -> agregarNumero("4"));
        btnNum5.addActionListener(e -> agregarNumero("5"));
        btnNum6.addActionListener(e -> agregarNumero("6"));
        btnNum7.addActionListener(e -> agregarNumero("7"));
        btnNum8.addActionListener(e -> agregarNumero("8"));
        btnNum9.addActionListener(e -> agregarNumero("9"));

        // Eventos operaciones
        btnSuma.addActionListener(e -> calcular('+'));
        btnResta.addActionListener(e -> calcular('-'));
        btnMulti.addActionListener(e -> calcular('*'));
        btnDiv.addActionListener(e -> calcular('/'));
        btnSalir.addActionListener(e -> System.exit(0));

        // Configurar foco de campos
        txtNum1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                campoActivo = txtNum1;
            }
        });
        txtNum2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                campoActivo = txtNum2;
            }
        });

        txtNum1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                campoActivo = txtNum1;
            }
        });
        txtNum2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                campoActivo = txtNum2;
            }
        });
    }

    // Método para agregar números al campo activo
    private void agregarNumero(String numero) {
        if (campoActivo != null) {
            campoActivo.setText(campoActivo.getText() + numero);
        } else {
            txtNum1.setText(txtNum1.getText() + numero);
            campoActivo = txtNum1;
        }
    }

    // Método para calcular
    private void calcular(char operacion) {
        try {
            double n1 = Double.parseDouble(txtNum1.getText());
            double n2 = Double.parseDouble(txtNum2.getText());
            double resultado = 0;

            switch (operacion) {
                case '+': resultado = n1 + n2; break;
                case '-': resultado = n1 - n2; break;
                case '*': resultado = n1 * n2; break;
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
