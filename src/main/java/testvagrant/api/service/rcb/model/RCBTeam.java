package testvagrant.api.service.rcb.model;

import java.util.List;

public class RCBTeam {
	
	private String name;

	private String location;

	private List<Player> player;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return this.location;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}

	public List<Player> getPlayer() {
		return this.player;
	}

	@Override
	public String toString() {
		return "RCBTeam [name=" + name + ", location=" + location + ", player=" + player + "]";
	}
	
	
}
