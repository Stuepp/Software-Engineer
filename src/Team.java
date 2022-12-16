package src;

import java.util.ArrayList;

public class Team {
	// Parametros
	public User players;
	public int points;
	private ArrayList<Party> party = new ArrayList<Party>();
	// Construtor
	public Team(User players, int points, ArrayList<Party> party) {
		super();
		this.players = players;
		this.points = points;
		this.party = party;
	}
	// Gets and Setters
	public User getPlayers() {
		return players;
	}
	public void setPlayers(User players) {
		this.players = players;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public ArrayList<Party> getParty() {
		return party;
	}
	public void setParty(ArrayList<Party> party) {
		this.party = party;
	}
	// toString
	@Override
	public String toString() {
		return "Team [players=" + players + ", points=" + points + ", party=" + party + "]\n";
	}
}
