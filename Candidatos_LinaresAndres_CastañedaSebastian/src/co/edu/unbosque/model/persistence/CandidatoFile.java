package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.CandidatoDTO;

public class CandidatoFile {

	private String ruta = "data/registro.out";
	private File f;
	private FileOutputStream fos;
	private ObjectOutputStream oos;
	private FileInputStream fis;
	private ObjectInputStream ois;
	private String mj;
	ArrayList<CandidatoDTO>dato;
	
	public CandidatoFile() {
		dato = new ArrayList<>();
		f = new File(ruta);
	}
	
	public boolean escribirCandidato(ArrayList<CandidatoDTO>candidato) {
		boolean a = true;
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			for (int i = 0; i<candidato.size();i++) {
				oos.writeObject(candidato);
			}
			oos.close();
		}catch (FileNotFoundException e) {
			a = false;
		}catch (Exception e) {
			a = false;
		}
		return a;
	}
	
	public String leerCandidatos() {
		mj = "";
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			dato = (ArrayList<CandidatoDTO>)ois.readObject();
			for (int i = 0; i<dato.size();i++) {
				mj += "\n"+"Nombre: "+dato.get(i).getNombre()+"\n";
				mj += "Apellido: "+dato.get(i).getApellido()+"\n";
				mj += "Cedula: "+dato.get(i).getCedula()+"\n";
				mj += "Edad: "+dato.get(i).getEdad()+"\n";
				mj += "Cargo: "+dato.get(i).getCargo();
			}
			ois.close();
		} catch (Exception e) {
			escribirCandidato(dato);
		}
		return mj;
	}
	
	public String leerCandidatoEspe() {
		mj = "";
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			dato = (ArrayList<CandidatoDTO>)ois.readObject();
		
			ois.close();
		}catch(Exception e ) {
			escribirCandidato(dato);
		}
		return mj;
	}

	public ArrayList<CandidatoDTO>getDato(){
		return dato;
	}
	
	public void setDato(ArrayList<CandidatoDTO>dato) {
		this.dato = dato;
	}
	
}
