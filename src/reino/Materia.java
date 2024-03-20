package reino;

public abstract class Materia {

	private String nombre;
	private int edad;
	

	
	public Materia(String nombre, int edad) {
		this.nombre = nombre;
		setEdad(edad);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Materia [" + nombre + " ("+ edad + ")]\n";
	}
	

	
	
	
}
