abstract class Forma {
	
	public Forma(String color) {
		this.color = color;
	}
	
	// --- . ---- . --- . --- METODOS --- . ---- . --- . --- *
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "forma y color " + color;
	}
	
	// --- . ---- . --- . --- CONSTANTES DE CLASE --- . ---- . --- . --- *
	private String color;

}
