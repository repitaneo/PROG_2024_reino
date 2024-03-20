package minerales;

import reino.Materia;

public abstract class Mineral extends Materia {
	
	public static final int MINERAL_IGNEO = 1000;
	public static final int MINERAL_SEDIMENTARIO = 2000;
	public static final int MINERAL_METAMORFICO = 3000;
	
	private int tipo;
	private int dureza;

	
	public Mineral(String nombre, int edad, 
					int tipo, int dureza) {
		
		super(nombre, edad);
		setTipo(tipo);
		setDureza(dureza);
	}
	
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getDureza() {
		return dureza;
	}
	public void setDureza(int dureza) {
		if(dureza<1) {
			this.dureza = 1;
		}
		else if(dureza>10) {
			this.dureza = 10;
		}
		else this.dureza = dureza;
	}
	public void setEdad(int edad) {
		super.setEdad(edad);;
	}


	@Override
	public String toString() {
		return "Mineral [" + tipo + " (" + dureza + "DUR)]"
				+super.toString();
	}
	
	
	
	
	
	
	
}
