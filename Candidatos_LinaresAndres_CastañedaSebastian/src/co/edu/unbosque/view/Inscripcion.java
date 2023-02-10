package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Inscripcion extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel nombre,apellido,cedula,edad,cargo,infbuscar,infenviar,infmodificar,infeliminar;
	private JTextField txnombre,txapellido,txcedula,txedad,txcargo;
	private JButton enviar,buscar,modificar,eliminar; 
	private ImageIcon icon1,icon2,icon3,icon4;
	public static final String ENVIAR="ENVIAR";
	public static final String BUSCAR="BUSCAR";
	public static final String MODIFICAR="MODIFICAR";
	public static final String ELIMINAR="ELIMINAR";
	
	public Inscripcion() {
		
		setSize(600,700);
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		nombre = new JLabel("Nombre:");
		nombre.setForeground(Color.white);
		nombre.setBounds(150,50,300,25);
		nombre.setFont(new Font("Courier New",Font.CENTER_BASELINE,30));
		
		txnombre = new JTextField();
		txnombre.setBounds(150,90,300,30);
		txnombre.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
		apellido = new JLabel("Apellido:");
		apellido.setForeground(Color.white);
		apellido.setBounds(150,130,300,25);
		apellido.setFont(new Font("Courier New",Font.CENTER_BASELINE,30));
		
		txapellido = new JTextField();
		txapellido.setBounds(150,170,300,30);
		txapellido.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
		cedula = new JLabel("Cedula:");
		cedula.setForeground(Color.white);
		cedula.setBounds(150,210,300,25);
		cedula.setFont(new Font("Courier New",Font.CENTER_BASELINE,30));
		
		txcedula = new JTextField();
		txcedula.setBounds(150,250,300,30);
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
		
		buscar = new JButton();
		buscar.setActionCommand(BUSCAR);
		buscar.setBounds(100, 500, 70, 70);
		buscar.setOpaque(false);
		buscar.setContentAreaFilled(false);
		buscar.setBorderPainted(false);
		icon1 = new ImageIcon("media/buscar.png");
		buscar.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(buscar.getWidth(),  buscar.getHeight(), Image.SCALE_SMOOTH)));
		
		infbuscar = new JLabel("BUSCAR");
		infbuscar.setForeground(Color.white);
		infbuscar.setBounds(100,570,100,50);
		infbuscar.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		
		enviar = new JButton();
		enviar.setActionCommand(ENVIAR);
		enviar.setBounds(200, 500, 70, 70);
		enviar.setOpaque(false);
		enviar.setContentAreaFilled(false);
		enviar.setBorderPainted(false);
		icon2 = new ImageIcon("media/enviar.png");
		enviar.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(enviar.getWidth(),  enviar.getHeight(), Image.SCALE_SMOOTH)));
		
		infenviar = new JLabel("ENVIAR");
		infenviar.setForeground(Color.white);
		infenviar.setBounds(200,570,100,50);
		infenviar.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		
		modificar = new JButton();
		modificar.setActionCommand(MODIFICAR);
		modificar.setBounds(310, 500, 70, 70);
		modificar.setOpaque(false);
		modificar.setContentAreaFilled(false);
		modificar.setBorderPainted(false);
		icon3 = new ImageIcon("media/modificar.png");
		modificar.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(modificar.getWidth(),  modificar.getHeight(), Image.SCALE_SMOOTH)));
		
		infmodificar = new JLabel("MODIFICAR");
		infmodificar.setForeground(Color.white);
		infmodificar.setBounds(300,570,130,50);
		infmodificar.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		
		eliminar = new JButton();
		eliminar.setActionCommand(ELIMINAR);
		eliminar.setBounds(430, 500, 70, 70);
		eliminar.setOpaque(false);
		eliminar.setContentAreaFilled(false);
		eliminar.setBorderPainted(false);
		icon4 = new ImageIcon("media/borrar.png");
		eliminar.setIcon(new ImageIcon(icon4.getImage().getScaledInstance(eliminar.getWidth(),  eliminar.getHeight(), Image.SCALE_SMOOTH)));
		
		infeliminar = new JLabel("ELIMINAR");
		infeliminar.setForeground(Color.white);
		infeliminar.setBounds(425,570,130,50);
		infeliminar.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		
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
		
		add(buscar);
		add(infbuscar);
		
		add(enviar);
		add(infenviar);
		
		add(modificar);
		add(infmodificar);
		
		add(eliminar);
		add(infeliminar);
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

	public JButton getEnviar() {
		return enviar;
	}

	public void setEnviar(JButton enviar) {
		this.enviar = enviar;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
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

	public ImageIcon getIcon3() {
		return icon3;
	}

	public void setIcon3(ImageIcon icon3) {
		this.icon3 = icon3;
	}

	public JLabel getInfbuscar() {
		return infbuscar;
	}

	public void setInfbuscar(JLabel infbuscar) {
		this.infbuscar = infbuscar;
	}

	public JLabel getInfenviar() {
		return infenviar;
	}

	public void setInfenviar(JLabel infenviar) {
		this.infenviar = infenviar;
	}

	public JLabel getInfmodificar() {
		return infmodificar;
	}

	public void setInfmodificar(JLabel infmodificar) {
		this.infmodificar = infmodificar;
	}

	public JLabel getInfeliminar() {
		return infeliminar;
	}

	public void setInfeliminar(JLabel infeliminar) {
		this.infeliminar = infeliminar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public ImageIcon getIcon4() {
		return icon4;
	}

	public void setIcon4(ImageIcon icon4) {
		this.icon4 = icon4;
	}

}
