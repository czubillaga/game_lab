package rooms;


import behaviors.IAttack;
import characters.Player;

import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;

    public Room() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int getPlayerCount() {
        return this.players.size();
    }
}
