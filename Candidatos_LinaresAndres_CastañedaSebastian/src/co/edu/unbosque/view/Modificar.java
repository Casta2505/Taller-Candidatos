package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Modificar extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel nombre,apellido,cedula,edad,cargo,infatras,infmodificar;
	private JTextField txnombre,txapellido,txcedula,txedad,txcargo;
	private JButton atras,modificar; 
	private ImageIcon icon1,icon2;
	public static final String ATRAS="ATRAS";
	public static final String MODIFICAR01="MODIFICAR01";
	
	public Modificar() {
		
		setSize(600,700);
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		nombre = new JLabel("Nombre:");
		nombre.setForeground(Color.white);
		nombre.setBounds(150,130,300,25);
		nombre.setFont(new Font("Courier New",Font.CENTER_BASELINE,30));
		
		txnombre = new JTextField();
		txnombre.setBounds(150,170,300,30);
		txnombre.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
		apellido = new JLabel("Apellido:");
		apellido.setForeground(Color.white);
		apellido.setBounds(150,210,300,25);
		apellido.setFont(new Font("Courier New",Font.CENTER_BASELINE,30));
		
		txapellido = new JTextField();
		txapellido.setBounds(150,250,300,30);
		txapellido.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
		cedula = new JLabel("Cedula de persona a modificar:");
		cedula.setForeground(Color.white);
		cedula.setBounds(70,50,500,25);
		cedula.setFont(new Font("Courier New",Font.CENTER_BASELINE,25));
		
		txcedula = new JTextField();
		txcedula.setBounds(150,90,300,30);
		txcedula.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
		edad = new JLabel("Edad:");
		edad.setForeground(Color.white);
		edad.setBounds(150,290,300,25);
		edad.setFont(new Font("Courier New",Font.CENTER_BASELINE,30));
		
		txedad = new JTextField();
		txedad.setBounds(150,330,300,30);
		txedad.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
		cargo = new JLabel("Cargo:");
		cargo.setForeground(Color.white);
		cargo.setBounds(150,370,300,25);
		cargo.setFont(new Font("Courier New",Font.CENTER_BASELINE,30));
		
		txcargo = new JTextField();
		txcargo.setBounds(150,410,300,30);
		txcargo.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
		atras = new JButton();
		atras.setActionCommand(ATRAS);
		atras.setBounds(170, 500, 70, 70);
		atras.setOpaque(false);
		atras.setContentAreaFilled(false);
		atras.setBorderPainted(false);
		icon1 = new ImageIcon("media/atras.png");
		atras.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(atras.getWidth(),  atras.getHeight(), Image.SCALE_SMOOTH)));
		
		infatras = new JLabel("ATRAS");
		infatras.setForeground(Color.white);
		infatras.setBounds(180,570,100,50);
		infatras.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		
		modificar = new JButton();
		modificar.setActionCommand(MODIFICAR01);
		modificar.setBounds(370, 500, 70, 70);
		modificar.setOpaque(false);
		modificar.setContentAreaFilled(false);
		modificar.setBorderPainted(false);
		icon2 = new ImageIcon("media/modificar.png");
		modificar.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(modificar.getWidth(),  modificar.getHeight(), Image.SCALE_SMOOTH)));
		
		infmodificar = new JLabel("MODIFICAR");
		infmodificar.setForeground(Color.white);
		infmodificar.setBounds(360,570,130,50);
		infmodificar.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		
		add(nombre);
		add(txnombre);
		
		add(apellido);
		add(txapellido);
		
		add(cedula);
		add(txcedula);
		
		add(edad);
		add(txedad);
		
		add(cargo);
		add(txcargo);
		
		add(atras);
		add(infatras);
		
		add(modificar);
		add(infmodificar);
		
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getApellido() {
		return apellido;
	}

	public void setApellido(JLabel apellido) {
		this.apellido = apellido;
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JLabel getCargo() {
		return cargo;
	}

	public void setCargo(JLabel cargo) {
		this.cargo = cargo;
	}

	public JLabel getInfatras() {
		return infatras;
	}

	public void setInfatras(JLabel infatras) {
		this.infatras = infatras;
	}

	public JLabel getInfmodificar() {
		return infmodificar;
	}

	public void setInfmodificar(JLabel infmodificar) {
		this.infmodificar = infmodificar;
	}

	public JTextField getTxnombre() {
		return txnombre;
	}

	public void setTxnombre(JTextField txnombre) {
		this.txnombre = txnombre;
	}

	public JTextField getTxapellido() {
		return txapellido;
	}

	public void setTxapellido(JTextField txapellido) {
		this.txapellido = txapellido;
	}

	public JTextField getTxcedula() {
		return txcedula;
	}

	public void setTxcedula(JTextField txcedula) {
		this.txcedula = txcedula;
	}

	public JTextField getTxedad() {
		return txedad;
	}

	public void setTxedad(JTextField txedad) {
		this.txedad = txedad;
	}

	public JTextField getTxcargo() {
		return txcargo;
	}

	public void setTxcargo(JTextField txcargo) {
		this.txcargo = txcargo;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public JButton getModificar() {
		return modificar;
	}

	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}

	public ImageIcon getIcon1() {
		return icon1;
	}

	public void setIcon1(ImageIcon icon1) {
		this.icon1 = icon1;
	}

	public ImageIcon getIcon2() {
		return icon2;
	}

	public void setIcon2(ImageIcon icon2) {
		this.icon2 = icon2;
	}
	

}
