package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Facha;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View gui;
	private Facha fc;
	
	public Controller() {
		fc = new Facha();
		gui = new View(this);
		gui.setVisible(true);
		fc.getCf().leerCandidatos();
		fc.getCdao().setCandidato(fc.getCf().getDato());
		funcionar();
		
	}
	
	public void funcionar() {

		gui.getP1().setVisible(true);
		gui.getP2().setVisible(false);
		gui.getP3().setVisible(false);
		gui.getP4().setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(gui.getP1().ENVIAR)) {
			enviarCandidato();
		}else if (e.getActionCommand().equals(gui.getP1().BUSCAR)) {
			gui.getP1().setVisible(false);
			gui.getP2().setVisible(true);
			gui.getP3().setVisible(false);
			gui.getP4().setVisible(false);
		}else if(e.getActionCommand().equals(gui.getP1().MODIFICAR)) {
			gui.getP1().setVisible(false);
			gui.getP2().setVisible(false);
			gui.getP3().setVisible(true);
			gui.getP4().setVisible(false);
		}else if (e.getActionCommand().equals(gui.getP1().ELIMINAR)) {
			gui.getP1().setVisible(false);
			gui.getP2().setVisible(false);
			gui.getP3().setVisible(false);
			gui.getP4().setVisible(true);
		}
		if(e.getActionCommand().equals(gui.getP2().LISTA)) {
			limpiarP2();
			fc.getCf().leerCandidatos();
			gui.getP2().getListado().setText(fc.getCf().leerCandidatos());
		}else if(e.getActionCommand().equals(gui.getP2().ATRAS)) {
			limpiarP2();
			volverInscripcion();
		}else if (e.getActionCommand().equals(gui.getP2().BUSCAR01)) {
			buscar();
		}
		
		if(e.getActionCommand().equals(gui.getP3().MODIFICAR01)) {
			modificarUsuario();
		}else if (e.getActionCommand().equals(gui.getP3().ATRAS)) {
			volverInscripcion();
			limpiarP3();
		}
		
		if(e.getActionCommand().equals(gui.getP4().ELIMINAR01)) {
			borrarUsuario();
			limpiarP4();
		}else if (e.getActionCommand().equals(gui.getP4().ATRAS)) {
			limpiarP4();
			volverInscripcion();
		}
		
	}
	
	public void limpiarP1() {
		this.gui.getP1().getTxnombre().setText("");
		this.gui.getP1().getTxapellido().setText("");
		this.gui.getP1().getTxcedula().setText("");
		this.gui.getP1().getTxedad().setText("");
		this.gui.getP1().getTxcargo().setText("");
	}
	
	public void limpiarP2() {
		this.gui.getP2().getNumcedula().setText("");
		this.gui.getP2().getListado().setText("");
	}
	
	public void limpiarP3(){
		this.gui.getP3().getTxnombre().setText("");
		this.gui.getP3().getTxapellido().setText("");
		this.gui.getP3().getTxcedula().setText("");
		this.gui.getP3().getTxedad().setText("");
		this.gui.getP3().getTxcargo().setText("");	
	}
	
	public void limpiarP4() {
		this.gui.getP4().getTxcedula().setText("");
	}
	
	public void volverInscripcion() {
		this.gui.getP1().setVisible(true);
		this.gui.getP2().setVisible(false);
		this.gui.getP3().setVisible(false);
		this.gui.getP4().setVisible(false);
		limpiarP1();
	}

	public void enviarCandidato(){	
	
		String nombre = "";
		String apellido = "";
		long cedula = 0;
		int edad = 0;
		String cargo = "";
		
		nombre = this.gui.getP1().getTxnombre().getText();
		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = pattern.matcher(nombre);
		if(!matcher.matches()||this.gui.getP1().getTxnombre().getText().equals("Nombre")) {
			this.gui.mostrar("Ingrese un nombre valido");
			return;
		}
		
		apellido = this.gui.getP1().getTxapellido().getText();
		Pattern pattern2 = Pattern.compile("[a-zA-Z]+");
		Matcher matcher2 = pattern2.matcher(apellido);
		if(!matcher2.matches()||this.gui.getP1().getTxapellido().getText().equals("Apellido")) {
			this.gui.mostrar("Ingrese un apellido valido");
			return;
		}
		
		cargo = this.gui.getP1().getTxcargo().getText();
		if(this.gui.getP1().getTxcargo().getText().equals("Cargo")) {
			this.gui.mostrar("Ingrese un cargo valido");
			return;
		}
		
		try {
	    	cedula = Long.parseLong(this.gui.getP1().getTxcedula().getText());
	    	if(comprobarExistencia(cedula)) {
	    		this.gui.mostrar("Esta cedula ya esta registrada");
		    	return;
		    }
	    	
	    	if(cedula <= 100000) {
	    		this.gui.mostrar("Ingrese una cedula valida");
	    		return;
	    	}
		} catch (Exception e) {
			this.gui.mostrar("Ingrese una cedula valida");
			return;
		}
	    
	    try {
	    	edad = Integer.parseInt(this.gui.getP1().getTxedad().getText());
	    	if(edad >= 110 || edad <= 0) {
	    		this.gui.mostrar("Ingrese una edad valida");
	    		return;
	    	}
		} catch (Exception e) {
			this.gui.mostrar("Ingrese una edad valida");
			return;
		}
	    
	    this.fc.getCdao().agregarCandidato(nombre.toUpperCase(), apellido.toUpperCase(), cedula, edad, cargo.toUpperCase()+"\n");
	    boolean a = this.fc.getCf().escribirCandidato(this.fc.getCdao().getCandidato());
	    this.gui.mostrar("Se guardo correctamente");
	    limpiarP1();
		
	}
	
	private void buscar() {
		long cedula = 0;
		try {
			cedula = Long.parseLong(this.gui.getP2().getNumcedula().getText());
		}catch(Exception e) {
			this.gui.mostrar("Por favor ingrese una cedula valida");
			return;
		}
		for (int i = 0; i<this.fc.getCdao().getCandidato().size();i++) {
			if(this.fc.getCdao().getCandidato().get(i).getCedula() == cedula) {
				this.gui.getP2().getListado().setText("\n"+"El usuario es:"+"\n"+
				"Nombre: "+this.fc.getCdao().getCandidato().get(i).getNombre()+"\n"+
				"Apellido: "+this.fc.getCdao().getCandidato().get(i).getApellido()+"\n"+
				"Cedula: "+this.fc.getCdao().getCandidato().get(i).getCedula()+"\n"+
				"Edad: "+this.fc.getCdao().getCandidato().get(i).getEdad()+"\n"+
				"Cargo: "+this.fc.getCdao().getCandidato().get(i).getCargo()+"\n");
				return;
			}
		}
		this.gui.mostrar("Ingrese un numero de cedula valido");
	}
	
	
	public void borrarUsuario() {
		long cedula = 0;
		try {
			cedula = Long.parseLong(this.gui.getP4().getTxcedula().getText());
		}catch(Exception e) {
			this.gui.mostrar("Por favor ingrese una cedula valida");
			return;
		}
		
		if(comprobarExistencia(cedula)==false) {
			this.gui.mostrar("Este usuario no se encuentra registrado");
			return;
		}else {
			this.fc.getCdao().deleteUser(cedula, this.fc.getCdao().getCandidato());
			boolean a = this.fc.getCf().escribirCandidato(this.fc.getCdao().getCandidato());
			if(a) {
				this.gui.mostrar("El usuario fue borrado correctamente");
			}else {
				this.gui.mostrar("El usuario NO se borro correctamente");
			}
		}
	}
	
	private void modificarUsuario() {
		long cedula=0;
		try {
			cedula = Long.parseLong(this.gui.getP3().getTxcedula().getText());
		}catch(Exception e) {
			this.gui.mostrar("Por favor ingrese una cedula valida");
			return;
		}
		
		if(comprobarExistencia(cedula)==false) {
			this.gui.mostrar("Ingrese un numero de cedula valido");
		}else {
			for(int i = 0; i<this.fc.getCdao().getCandidato().size(); i++) {
				if(this.fc.getCdao().getCandidato().get(i).getCedula() == cedula) {
					this.fc.getCdao().deleteUser(cedula, this.fc.getCdao().getCandidato());
					boolean a = this.fc.getCf().escribirCandidato(this.fc.getCdao().getCandidato());
				}
			}
			
			String nombre = "";
			String apellido = "";
			int edad = 0;
			String cargo = "";
			
			nombre = this.gui.getP3().getTxnombre().getText();
			Pattern pattern = Pattern.compile("[a-zA-Z]+");
			Matcher matcher = pattern.matcher(nombre);
			if(!matcher.matches()||this.gui.getP1().getTxnombre().getText().equals("Nombre")) {
				this.gui.mostrar("Ingrese un nombre valido");
				return;
			}
			
			apellido = this.gui.getP3().getTxapellido().getText();
			Pattern pattern2 = Pattern.compile("[a-zA-Z]+");
			Matcher matcher2 = pattern2.matcher(apellido);
			if(!matcher2.matches()||this.gui.getP1().getTxapellido().getText().equals("Apellido")) {
				this.gui.mostrar("Ingrese un apellido valido");
				return;
			}
			
			cargo = this.gui.getP3().getTxcargo().getText();
			Pattern pattern3 = Pattern.compile("[a-zA-Z]+");
			Matcher matcher3 = pattern3.matcher(cargo);
			if(!matcher3.matches()||this.gui.getP1().getTxcargo().getText().equals("Cargo")) {
				this.gui.mostrar("Ingrese un cargo valido");
				return;
			}
		    
		    try {
		    	edad = Integer.parseInt(this.gui.getP3().getTxedad().getText());
		    	if(edad >= 110 || edad <= 0) {
		    		this.gui.mostrar("Ingrese una edad valida");
		    		return;
		    	}
			} catch (Exception e) {
				this.gui.mostrar("Ingrese una edad valida");
				return;
			}
		    
		    this.fc.getCdao().agregarCandidato(nombre.toUpperCase(), apellido.toUpperCase(), cedula, edad, cargo.toUpperCase()+"\n");
		    boolean a = this.fc.getCf().escribirCandidato(this.fc.getCdao().getCandidato());
		    this.gui.mostrar("Se modifico correctamente");
		    limpiarP3();
		}
	}
	
	public boolean comprobarExistencia(long cedula) {
		boolean aux = false;
		for (int i = 0; i < this.fc.getCdao().getCandidato().size();i++) {
			if (this.fc.getCdao().getCandidato().get(i).getCedula()==cedula) {
				aux = true;
			}else {
				aux = false;
			}
		}
		
		return aux;
	}
}
