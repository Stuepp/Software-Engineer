package src;

import java.util.ArrayList;

public class Match {
	// Parametros
	public String map;
	private ArrayList<Team> teams = new ArrayList<Team>();
	// Construtor
	public Match(String map) {
		this.map = map;
	}
	// Gets and Setter
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public ArrayList<Team> getTeam() {
		return teams;
	}
	// add
	public void addTeam(Team team) {
		this.teams.add(team);
	}
	// to String
	@Override
	public String toString() {
		return "Match [map=" + map + "]\n";
	}
}
