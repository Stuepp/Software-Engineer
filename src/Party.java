package src;

import java.util.ArrayList;

public class Party {
	// Parametros
	private ArrayList<User> players = new ArrayList<User>();
	// Gets and Setters
	public ArrayList<User> getPlayers() {
		return players;
	}
	// add
	public void addPlayers(User user) {
		this.players.add(user);
	}
	// methos
	public int receivePoints() {
		return 0;
	}
	// toString
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < players.size(); i++) {
			sb.append("Party [players=" + players.get(i).toString() + "]\n");
			
		}
		return sb.toString();
	}
}
