package ejercicio20_poo_abstractas;

public class Uso_Forma {

	public static void main(String[] args) {
		
		Forma triangulo = new Triangulo("Rojo", 2, 3);
		System.out.println(triangulo);
		System.out.println(triangulo.getArea());
		
		// Forma forma = new Forma("Verde")
		// NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA
		
		/* EN RESUMEN. Una clase abstracta provee de una plantilla para un metodo que se desarrollara
		 * posteriormente. El objetivo es crear una interfaz comun para todas las subclases. No es posible
		 * implementar estos metodos en la clase abstracta ya que todavía no conocemos la Forma (en este caso)
		 * No obstante, al especificar que son metodos abstractos, todas las subclasees estan forzadas a usarlo
		 * Esta subclase ya le dara la funcion a ese metodo.
		 * 
		 * Un metodo abstracto no puede ser declarado FINAL, pues los metodos final no pueden ser sobreescritos
		 * Un metodo abstracto no puede ser privado, esto es porque un metodo privado no seria visible para las
		 * subclases y no podria ser sobreescrito.
		 * 
		 */

	}

}
