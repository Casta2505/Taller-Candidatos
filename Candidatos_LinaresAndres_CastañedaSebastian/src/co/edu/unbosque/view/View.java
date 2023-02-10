package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Inscripcion p1;
	private Busqueda p2;
	private Modificar p3;
	private Borrador p4;
	
	public View(Controller control) {
		setSize(600,700);
		setResizable(false);
		setTitle("CANDIDATOS");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		p1 = new Inscripcion();
		p2 = new Busqueda();
		p3 = new Modificar();
		p4 = new Borrador();
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		p1.getBuscar().addActionListener(control);
		p1.getEnviar().addActionListener(control);
		p1.getModificar().addActionListener(control);
		p1.getEliminar().addActionListener(control);
		p2.getBuscar01().addActionListener(control);
		p2.getAtras().addActionListener(control);
		p2.getLista().addActionListener(control);
		p3.getAtras().addActionListener(control);
		p3.getModificar().addActionListener(control);
		p4.getAtras().addActionListener(control);
		p4.getEliminar().addActionListener(control);
		
	}
	
	public void mostrar(String dato) {
		JOptionPane.showMessageDialog(null, dato);
	}

	public Inscripcion getP1() {
		return p1;
	}

	public void setP1(Inscripcion p1) {
		this.p1 = p1;
	}

	public Busqueda getP2() {
		return p2;
	}

	public void setP2(Busqueda p2) {
		this.p2 = p2;
	}

	public Modificar getP3() {
		return p3;
	}

	public void setP3(Modificar p3) {
		this.p3 = p3;
	}

	public Borrador getP4() {
		return p4;
	}

	public void setP4(Borrador p4) {
		this.p4 = p4;
	}
	
}
