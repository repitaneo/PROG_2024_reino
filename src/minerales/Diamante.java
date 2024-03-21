package minerales;

public class Diamante extends Mineral {

	private int brillo;


	public Diamante(String nombre, int edad, 
				int dureza, 
				int brillo) {
		
		super(nombre, edad, Mineral.MINERAL_METAMORFICO, dureza);
		this.brillo = brillo;
	}
	
	
	
	public int getBrillo() {
		return brillo;
	}
	public void setBrillo(int brillo) {
		this.brillo = brillo;
	}
	public void setEdad(int edad) {
		if(edad<1000000) {
			super.setEdad(1000000);
		}
		else super.setEdad(edad);
	}



	@Override
	public String toString() {
		return "Diamante [brillo=" + brillo + "]\n"
				+super.toString();
	}

	
	
}
