package ejercicio20_poo_abstractas;

public class Triangulo extends Forma {
	
	// --- . ---- . --- . --- CONSTRUCTOR --- . ---- . --- . --- *
	public Triangulo(String color, int base, int altura) {
		super(color);
		
		this.base = base;
		this.altura = altura;
	}
	
	// --- . ---- . --- . --- METODOS --- . ---- . --- . --- *
	@Override
	public String toString() {
		return "Es un triangulo!";
	}
	
	public double getArea() {
		return (base * altura) / 2;
	}
	
	// --- . ---- . --- . --- CONSTANTES DE CLASE --- . ---- . --- . --- *
	private int base, altura;

}
