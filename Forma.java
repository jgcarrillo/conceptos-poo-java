package ejercicio20_poo_abstractas;

abstract class Forma {
	
	public Forma(String color) {
		this.color = color;
	}
	
	/* Para evitarnos el problema con el ejercicio 19 al invocar a un metod perteneciente a la instancia Monstruo
	 * atacar() el cual todavia no estaba definido, usamos las clases abstractas, en las cuales SOLO definimos 
	 * el metodo que queremos que implementen las subclases, no lo desarrollamos. Tanto la clase como los métodos
	 * deberan ser abstractos
	 * 
	 * UNA CLASE ABSTRACTA NO PUEDE SER INSTANCIADA. Para usar una clase abstracta tienes que 
	 * derivar a una subclase desde la clase abstracta, sobreescribi el metodo abstracto y
	 * darle una funcionalidad
	 * 
	 * Es decir, se podra hacer --> Forma triangulo = new Triangulo()
	 */
	
	// --- . ---- . --- . --- METODOS --- . ---- . --- . --- *
	public abstract double getArea();
	
	@Override
	public String toString() {
		return "forma y color " + color;
	}
	
	// --- . ---- . --- . --- CONSTANTES DE CLASE --- . ---- . --- . --- *
	private String color;

}
