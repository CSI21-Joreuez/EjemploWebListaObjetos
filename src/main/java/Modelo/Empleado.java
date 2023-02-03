package Modelo;

public class Empleado {

	int id_empleado;
	
	String nombre;
	
	String apellidos;
	
	int nivel_acceso;
	
	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	@Override
	public String toString() {
		return "Empleado [id_empleado=" + id_empleado + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", nivel_acceso=" + nivel_acceso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getNivel_acceso() {
		return nivel_acceso;
	}

	public void setNivel_acceso(int nivel_acceso) {
		this.nivel_acceso = nivel_acceso;
	}


}
