package vegetales;

import reino.Materia;

public abstract class Vegetal extends Materia {

	
	public static final int VEGETAL_ARBOL = 1000;
	public static final int VEGETAL_PLANTA = 2000;
	public static final int VEGETAL_ALGA = 3000;

	private boolean hojaCaduca;
	private int tipo;
	
	public Vegetal(String nombre,int edad,
					boolean hojaCaduca, int tipo) {
		super(nombre,edad);
		this.hojaCaduca = hojaCaduca;
		setTipo(tipo);
	}
	
	
	public boolean isHojaCaduca() {
		return hojaCaduca;
	}
	public void setHojaCaduca(boolean hojaCaduca) {
		this.hojaCaduca = hojaCaduca;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		//TODO seteo adecuado
		this.tipo = tipo;
	}
	public void setEdad(int edad) {
		super.setEdad(edad);
	}


	@Override
	public String toString() {
		return "Vegetal [" + hojaCaduca + "CAD (" + tipo + ")]"
				+super.toString();
	}
	
	
	
	

}
