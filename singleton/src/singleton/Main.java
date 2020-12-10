package singleton;

public class Main {

	public static void main(String[] args) {
		
		ChocolateBoiler chocoBoiler1 = ChocolateBoiler.getInstance();
		ChocolateBoiler chocoBoiler2 = ChocolateBoiler.getInstance();

		// chocoBoiler 1 e 2 são a mesma instância do mesmo objeto. o que acontece com um acontece com outro
		System.out.println(chocoBoiler1 == chocoBoiler2); //true
		
		System.out.println(chocoBoiler1.isEmpty()); // true
		System.out.println(chocoBoiler2.isEmpty()); // true
		
		chocoBoiler1.fill();
		
		System.out.println(chocoBoiler2.isEmpty()); // false
	}

}
