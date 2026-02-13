package calculadorGrafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculadora2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField pantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora2 frame = new Calculadora2();
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
	public Calculadora2() {
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 262);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 221, 218));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setMinimumSize(new Dimension(400, 500));
		contentPane.setMaximumSize(new Dimension(400,500));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 24));
		lblNewLabel.setBounds(64, 12, 166, 41);
		contentPane.add(lblNewLabel);
		
		pantalla = new JTextField();
		pantalla.setEditable(false);
		pantalla.setBounds(41, 71, 225, 21);
		contentPane.add(pantalla);
		pantalla.setColumns(10);
		
		JButton bntNum7 = new JButton("7");
		bntNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bntNum7.setBounds(51, 104, 41, 27);
		contentPane.add(bntNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setBounds(104, 104, 41, 27);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setBounds(157, 104, 41, 27);
		contentPane.add(btnNum9);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(104, 143, 41, 27);
		contentPane.add(button_3);
		
		JButton button_3_1 = new JButton("6");
		button_3_1.setBounds(157, 143, 41, 27);
		contentPane.add(button_3_1);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setBounds(51, 143, 41, 27);
		contentPane.add(btnNum4);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setText(pantalla.getText()+ 1);
			}
		});
		btnNum1.setBounds(51, 182, 41, 27);
		contentPane.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setBounds(104, 182, 41, 27);
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setBounds(157, 182, 41, 27);
		contentPane.add(btnNum3);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setBounds(51, 221, 41, 27);
		contentPane.add(btnNum0);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(233, 104, 60, 27);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(233, 143, 60, 27);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.setBounds(233, 182, 60, 27);
		contentPane.add(button_2);
		
		JButton button_4 = new JButton("÷");
		button_4.setBounds(233, 221, 60, 27);
		contentPane.add(button_4);
		
		JButton button_4_1 = new JButton("=");
		button_4_1.setBounds(104, 221, 60, 27);
		contentPane.add(button_4_1);
		
		JButton button_4_2 = new JButton("C");
		button_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4_2.setBounds(176, 221, 42, 27);
		contentPane.add(button_4_2);

	}
}
