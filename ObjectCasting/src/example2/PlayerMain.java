package example2;

import java.util.HashSet;
import java.util.Set;

public class PlayerMain {

	public static void main(String[] args) {
		Set<Player> players = new HashSet<>();
		players.add(new Player(100, "Jack"));
		players.add(new Player(200, "Jackie"));
		players.add(new Player(100, "Jack"));
		players.add(new Player(100, "Jack"));
		players.add(new Player(100, "Jack"));
		players.add(new Player(100, "Jack"));
		players.add(new Player(100, "Jack"));

		System.out.println("Printing all the players");
		for(Player p:players) {
			System.out.println(p);
		}
		
		
	}

}
