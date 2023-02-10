package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Busqueda extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JTextArea listado;
	private JScrollPane barra;
	private JButton buscar01,lista,atras;
	private ImageIcon icon1,icon2,icon3;
	private JTextField numcedula;
	private JLabel cedula, buscar,listar,retroceder;
	public static final String BUSCAR01="BUSCAR01";
	public static final String LISTA="LISTA";
	public static final String ATRAS="ATRAS";
	
	public Busqueda() {
		setSize(600,700);
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		cedula = new JLabel("Cedula:");
		cedula.setForeground(Color.white);
		cedula.setBounds(50,50,300,25);
		cedula.setFont(new Font("Courier New",Font.CENTER_BASELINE,30));
		
		numcedula = new JTextField();
		numcedula.setBounds(204,50,330,30);
		numcedula.setFont(new Font("Courier New",Font.CENTER_BASELINE,28));
		
		listado = new JTextArea(" ");
		barra = new JScrollPane(listado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		barra.setBounds(50,90,485,450);
		
		buscar01 = new JButton();
		buscar01.setActionCommand(BUSCAR01);
		buscar01.setBounds(250, 570, 50, 50);
		buscar01.setOpaque(false);
		buscar01.setContentAreaFilled(false);
		buscar01.setBorderPainted(false);
		icon1 = new ImageIcon("media/buscar.png");
		buscar01.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(buscar01.getWidth(),  buscar01.getHeight(), Image.SCALE_SMOOTH)));
		
		buscar = new JLabel("BUSCAR");
		buscar.setForeground(Color.white);
		buscar.setBounds(250,605,60,50);
		buscar.setFont(new Font("Courier New",Font.CENTER_BASELINE,12));
		
		lista = new JButton();
		lista.setActionCommand(LISTA);
		lista.setBounds(350, 570, 50, 50);
		lista.setOpaque(false);
		lista.setContentAreaFilled(false);
		lista.setBorderPainted(false);
		icon2 = new ImageIcon("media/lista.png");
		lista.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(lista.getWidth(),  lista.getHeight(), Image.SCALE_SMOOTH)));
		
		listar = new JLabel("LISTAR");
		listar.setForeground(Color.white);
		listar.setBounds(355,605,60,50);
		listar.setFont(new Font("Courier New",Font.CENTER_BASELINE,12));
		
		atras = new JButton();
		atras.setActionCommand(ATRAS);
		atras.setBounds(150, 570, 50, 50);
		atras.setOpaque(false);
		atras.setContentAreaFilled(false);
		atras.setBorderPainted(false);
		icon3 = new ImageIcon("media/atras.png");
		atras.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(atras.getWidth(),  atras.getHeight(), Image.SCALE_SMOOTH)));
		
		retroceder = new JLabel("ATRAS");
		retroceder.setForeground(Color.white);
		retroceder.setBounds(155,605,60,50);
		retroceder.setFont(new Font("Courier New",Font.CENTER_BASELINE,12));
		
		add(barra);
		add(buscar01);
		add(buscar);
		add(lista);
		add(listar);
		add(atras);
		add(retroceder);
		add(cedula);
		add(numcedula);
	}

	public JTextArea getListado() {
		return listado;
	}

	public void setListado(JTextArea listado) {
		this.listado = listado;
	}

	public JButton getBuscar01() {
		return buscar01;
	}

	public void setBuscar01(JButton buscar01) {
		this.buscar01 = buscar01;
	}

	public ImageIcon getIcon1() {
		return icon1;
	}

	public void setIcon1(ImageIcon icon1) {
		this.icon1 = icon1;
	}

	public JScrollPane getBarra() {
		return barra;
	}

	public void setBarra(JScrollPane barra) {
		this.barra = barra;
	}

	public JButton getLista() {
		return lista;
	}

	public void setLista(JButton lista) {
		this.lista = lista;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
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

	public JTextField getNumcedula() {
		return numcedula;
	}

	public void setNumcedula(JTextField numcedula) {
		this.numcedula = numcedula;
	}

	public JLabel getCedula() {
		return cedula;
	}

	public void setCedula(JLabel cedula) {
		this.cedula = cedula;
	}

	public JLabel getBuscar() {
		return buscar;
	}

	public void setBuscar(JLabel buscar) {
		this.buscar = buscar;
	}

	public JLabel getListar() {
		return listar;
	}

	public void setListar(JLabel listar) {
		this.listar = listar;
	}

	public JLabel getRetroceder() {
		return retroceder;
	}

	public void setRetroceder(JLabel retroceder) {
		this.retroceder = retroceder;
	}

}
