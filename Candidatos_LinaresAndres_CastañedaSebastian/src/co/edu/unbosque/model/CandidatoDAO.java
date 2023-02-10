package co.edu.unbosque.model;

import java.util.ArrayList;

public class CandidatoDAO {
	
	private ArrayList<CandidatoDTO>candidato;
	
	public CandidatoDAO() {
		this.candidato= new ArrayList<>();
	}

	public void agregarCandidato(String nombre, String apellido, long cedula, int edad, String cargo) {
		CandidatoDTO a = new CandidatoDTO(nombre,apellido,cedula,edad,cargo);
		candidato.add(a);
	}
	
	public boolean deleteUser(long cedula,ArrayList<CandidatoDTO>candidato) {
		boolean a = false;
		for(int i = 0; i<candidato.size();i++) {
			if(candidato.get(i).getCedula() == cedula) {
				candidato.remove(i);
				a = true;
			}
		}
		return a;
	}
	
	public String list() {
		StringBuilder sb = new StringBuilder();
		for(CandidatoDTO e : candidato) {
			sb.append(e.toString());
		}
		return sb.toString();
	}
	
	public ArrayList<CandidatoDTO>getCandidato(){
		return candidato;
	}
	
	public void setCandidato(ArrayList<CandidatoDTO>candidato) {
		this.candidato = candidato;
	}
	
}
