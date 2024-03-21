package vegetales;

public class Roble extends Vegetal {

	private int diametroTronco;

	public Roble(String nombre, int edad, 
			boolean hojaCaduca, int tipo, 
			int diametroTronco) {
		
		super(nombre, edad, hojaCaduca, tipo);
		setDiametroTronco(diametroTronco);
	}

	
	public int getDiametroTronco() {
		return diametroTronco;
	}
	public void setDiametroTronco(int diametroTronco) {
		if(diametroTronco<1) {
			this.diametroTronco = 1;
		}
		else this.diametroTronco = diametroTronco;
	}
	public void setEdad(int edad) {
		if(edad<300) {
			super.setEdad(300);
		}
		else super.setEdad(edad);
	}


	@Override
	public String toString() {
		return "Roble [(" + diametroTronco + ")]\n"
				+super.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
}
