package singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler instance;
	
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public boolean isEmpty() {
		return this.empty;
	}
	
	public boolean isBoiled() {
		return this.boiled;
	}
	
	public static ChocolateBoiler getInstance() {
		synchronized (ChocolateBoiler.class) {
			if (instance == null) {
				instance = new ChocolateBoiler();
			}
			return instance;
		}
	}
	
	public void fill() {
		if (this.empty) {
			this.empty = false;
			this.boiled = false;
		}
	}
	
	public void drain() {
		if (!this.empty && this.boiled) {
			this.empty = true;
		}
	}
	
	public void boil() {
		if (!this.empty && !this.boiled) {
			this.boiled = true;
		}
	}
}
