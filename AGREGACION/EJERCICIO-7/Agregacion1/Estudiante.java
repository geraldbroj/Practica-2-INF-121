package Agregacion1;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
	private String nombre;
	private String carrera;
	private int semestre;
	public Estudiante(String nombre, String carrera, int semestre) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.semestre = semestre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public void Mostrar_info() {
		System.out.println("Nombre: "+nombre+", Carrera: "+carrera+", Semestre: "+semestre);
		
	}
}
