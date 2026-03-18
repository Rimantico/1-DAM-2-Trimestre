package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import metodos.Metodos;
import usuario.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazGrafica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel informacionPanel;
	private JScrollPane panelScroll;
	private JLabel etiquetaId;
	private JLabel etiquetaNombre;
	private JLabel etiquetaEdad;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTable table;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica frame = new InterfazGrafica();
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
	public InterfazGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		informacionPanel = new JPanel();
		informacionPanel.setBounds(10, 10, 230, 307);
		contentPane.add(informacionPanel);
		informacionPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introducir Informacion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 195, 32);
		informacionPanel.add(lblNewLabel);
		
		etiquetaId = new JLabel("ID");
		etiquetaId.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiquetaId.setBounds(10, 52, 73, 32);
		informacionPanel.add(etiquetaId);
		
		etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiquetaNombre.setBounds(10, 94, 73, 32);
		informacionPanel.add(etiquetaNombre);
		
		etiquetaEdad = new JLabel("Edad");
		etiquetaEdad.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiquetaEdad.setBounds(10, 140, 73, 32);
		informacionPanel.add(etiquetaEdad);
		
		txtId = new JTextField();
		txtId.setBounds(109, 61, 96, 18);
		informacionPanel.add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(109, 103, 96, 18);
		informacionPanel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(109, 149, 96, 18);
		informacionPanel.add(txtEdad);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				Usuario usuario = new Usuario();
				usuario.setNombre(txtNombre.getText());
				usuario.setEdad(Integer.parseInt(txtEdad.getText()));
				
		                       Metodos metodo = new Metodos();			
				if (metodo.insertar(usuario)) {
				       JOptionPane.showMessageDialog(null, "Se ha agregado correctamente");
				}else {
				       JOptionPane.showMessageDialog(null, "Se ha producido un error");
							}
				}catch (Exception ex) {
				       JOptionPane.showMessageDialog(null, "Se ha producido un error");
						}
					}
				});


		btnGuardar.setBounds(66, 196, 84, 20);
		informacionPanel.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(66, 226, 84, 20);
		informacionPanel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(66, 256, 84, 20);
		informacionPanel.add(btnEliminar);
		
		panelScroll = new JScrollPane();
		panelScroll.setBounds(264, 10, 211, 309);
		contentPane.add(panelScroll);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Edad"
			}
		));
		panelScroll.setViewportView(table);

	}
}
