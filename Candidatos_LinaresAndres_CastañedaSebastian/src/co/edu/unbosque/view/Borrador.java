package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Borrador extends JPanel{

	private static final long serialVersionUID = 1L;
	private JLabel cedula,infeliminar,infatras;
	private JTextField txcedula;
	private JButton atras,eliminar; 
	private ImageIcon icon1,icon2;
	public static final String ATRAS="ATRAS";
	public static final String ELIMINAR01="ELIMINAR01";
	
	public Borrador() {
		setSize(600,700);
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		cedula = new JLabel("Cedula de la persona que se eliminar:");
		cedula.setForeground(Color.white);
		cedula.setBounds(30,210,550,25);
		cedula.setFont(new Font("Courier New",Font.CENTER_BASELINE,24));
		
		txcedula = new JTextField();
		txcedula.setBounds(150,250,300,30);
		txcedula.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
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
		
		eliminar = new JButton();
		eliminar.setActionCommand(ELIMINAR01);
		eliminar.setBounds(360, 500, 70, 70);
		eliminar.setOpaque(false);
		eliminar.setContentAreaFilled(false);
		eliminar.setBorderPainted(false);
		icon2 = new ImageIcon("media/borrar.png");
		eliminar.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(eliminar.getWidth(),  eliminar.getHeight(), Image.SCALE_SMOOTH)));
		
		infeliminar = new JLabel("ELIMINAR");
		infeliminar.setForeground(Color.white);
		infeliminar.setBounds(360,570,100,50);
		infeliminar.setFont(new Font("Courier New",Font.CENTER_BASELINE,18));
		
		add(cedula);
		add(txcedula);
		add(atras);
		add(infatras);
		add(eliminar);
		add(infeliminar);
		
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getInfeliminar() {
		return infeliminar;
	}

	public void setInfeliminar(JLabel infeliminar) {
		this.infeliminar = infeliminar;
	}

	public JLabel getInfatras() {
		return infatras;
	}

	public void setInfatras(JLabel infatras) {
		this.infatras = infatras;
	}

	public JTextField getTxcedula() {
		return txcedula;
	}

	public void setTxcedula(JTextField txcedula) {
		this.txcedula = txcedula;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
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
