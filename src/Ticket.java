package src;


public class Ticket extends Reward {
	// Parametros
	private String model;
	private String texture;
	// Construtor
	public Ticket(String name, String category, String model, String texture) {
		super(name, category);
		this.model = model;
		this.texture = texture;
	}
	// Gets and Sets
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTexture() {
		return texture;
	}
	public void setTexture(String texture) {
		this.texture = texture;
	}
	public Reward useTicket() {
		return null;
	}	
	// toString
	@Override
	public String toString() {
		return "Ticket [model=" + model + ", texture=" + texture + "]\n";
	}
}
