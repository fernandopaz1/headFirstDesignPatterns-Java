package c1_Intro_To_Design_Patterns.simDuckApp;

/*
 * Superclase Duck: muchas veces clases que tienen un mismo comportamiento
 * se agrupan en una superclase. Esto esta bien en un principio cuando controllamos 
 * la cantidad de subclases pero si en el futuro se quiere agregar clases que hereden de Duck
 * pero que no compartan al 100% el mismo comporamiento tenemos un problema
 * Esta forma de polimorfismo no es escalable en el numero de subclases.
 */
public class Duck {

	public void swim() {
		System.out.println("Swiming");
	}

	/*
	 * Si en un futuro quiesieramos agregar un pato de madera como subclase
	 * este metodo nos trae problemas ya que ese pato no deberia hacer quack.
	 * No podemos quitar el metodo de la superclase porque arruniaria el polimorfismo 
	 * que probablemente ya esta en uso
	 */
	public void quack() {
		System.out.println("Quack");
	}
	
	public void display() {
		System.out.println("Looks like a duck");
	}
	
}
