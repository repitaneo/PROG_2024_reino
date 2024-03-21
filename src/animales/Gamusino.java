package animales;

import interfaces.Mamifero;
import interfaces.SerVivo;

public class Gamusino extends Animal
	implements Mamifero, SerVivo {

	
	private boolean existe;

	
	public Gamusino(String nombre, int edad, 
				int reproduccion, int dientes, 
				boolean existe) {
		
		super(nombre, edad, reproduccion, dientes);
		this.existe = existe;
	}


	public boolean isExiste() {
		return existe;
	}
	public void setExiste(boolean existe) {
		this.existe = existe;
	}
	public void setEdad(int edad) {
		if(edad<10) {
			super.setEdad(10);
		}
		else super.setEdad(edad);
	}


	@Override
	public String toString() {
		return "Gamusino [" + existe + "]\n"
				+super.toString();
	}
	
	
	
	
	
}
