package ventanas;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import usuario.Usuario;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import metodos.Metodos;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FrameBD extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTable tblDatos;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblEdad;


	int fila = -1;
	ArrayList <Usuario> lista = new ArrayList<Usuario>();
	Usuario usuario = new Usuario();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBD frame = new FrameBD();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void actualizarTabla() {
		DefaultTableModel modelo = new DefaultTableModel();
	//	ArrayList <Usuario> lista = new ArrayList<Usuario>();
		Metodos metodos = new Metodos();
		
		modelo.addColumn("ID");
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		
		while(modelo.getRowCount()>0) {
			modelo.removeRow(0);
		}
		
		lista = metodos.listaDeUsuarios();
		for (Usuario u : lista) {
			String usuario[] = new String[4];
			usuario[0] = Integer.toString(u.getId());
			usuario[1] = u.getNombre();
			usuario[2] = Integer.toString(u.getEdad());
			modelo.addRow(usuario);
		}
		tblDatos.setModel(modelo);
	}
	
	
	public FrameBD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setToolTipText("Datos Usuario");
		panel.setBounds(10, 11, 205, 211);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(10, 26, 66, 17);
		panel.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(79, 26, 116, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(10, 56, 66, 17);
		panel.add(lblNombre);
		
		lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(10, 84, 66, 17);
		panel.add(lblEdad);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(79, 54, 116, 20);
		panel.add(txtNombre);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(79, 84, 116, 20);
		panel.add(txtEdad);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				//	Usuario usuario = new Usuario();
					usuario.setNombre(txtNombre.getText());
					usuario.setEdad(Integer.parseInt(txtEdad.getText()));
					Metodos metodo = new Metodos();
					
					if (metodo.insertar(usuario)) {
						actualizarTabla();
						JOptionPane.showMessageDialog(null, "Se ha insertado correctamente");
					}else {
						JOptionPane.showMessageDialog(null, "Se ha producido un error");
					}
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Se ha producido un error");
				}
			}
		});
		btnGuardar.setBounds(51, 112, 100, 23);
		panel.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					usuario.setNombre(txtNombre.getText());
					usuario.setEdad(Integer.parseInt(txtEdad.getText()));
					Metodos metodo = new Metodos();
					
					if (metodo.modificar(usuario)) {
						actualizarTabla();
						JOptionPane.showMessageDialog(null, "Se ha modificado correctamente");
					}else {
						JOptionPane.showMessageDialog(null, "No se ha podido modificar");
					}
					
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "No se ha podido actualizar");
				}
			}
		});
		btnModificar.setBounds(51, 147, 100, 23);
		panel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Metodos metodo = new Metodos();
					
					if (metodo.eliminar(usuario.getId())) {
						actualizarTabla();
						JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
					}else {
						JOptionPane.showMessageDialog(null, "Error al eliminar");					}
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Error al eliminar");
				}
			
			}
		});
		btnEliminar.setBounds(51, 177, 100, 23);
		panel.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(245, 11, 295, 211);
		contentPane.add(scrollPane);
		
		tblDatos = new JTable();
		tblDatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fila = tblDatos.getSelectedRow();
				
			//	Usuario usuario = new Usuario();
				usuario = lista.get(fila);
				txtId.setText(Integer.toString(usuario.getId()));
				txtNombre.setText(usuario.getNombre());
				txtEdad.setText(Integer.toString(usuario.getEdad()));
			}
		});
		tblDatos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(tblDatos);
		actualizarTabla();
	}
}

