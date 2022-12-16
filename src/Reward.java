package src;

public class Reward {
	// Parametros
	public String name;
	public String category;
	// Construtors
	public Reward(String name, String category) {
		this.name = name;
		this.category = category;
	}
	// Gets and  Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	// toString
	@Override
	public String toString() {
		return "Reward [name=" + name + ", category=" + category + "]\n";
	}
}
