package animales;

import reino.Materia;

public abstract class Animal extends Materia {

	public static final int ANIMAL_VIVIPARO = 1000;
	public static final int ANIMAL_OVIPARO = 2000;
	
	private int reproduccion;
	private int dientes;
	
	
	public Animal(String nombre, int edad, 
			int reproduccion, int dientes) {
		
		super(nombre, edad);
		setReproduccion(reproduccion);
		setDientes(dientes);
	}
	
	
	
	public int getReproduccion() {
		return reproduccion;
	}
	public void setReproduccion(int reproduccion) {
		this.reproduccion = reproduccion;
	}
	public int getDientes() {
		return dientes;
	}
	public void setDientes(int dientes) {
		if(dientes<0) {
			this.dientes = 0;
		}
		else this.dientes = dientes;
	}
	public void setEdad(int edad) {
		super.setEdad(edad);
	}



	@Override
	public String toString() {
		return "Animal [" + reproduccion + " (" + dientes + "D)]\n"
				+super.toString();
	}
	
	
	
	
	
}
