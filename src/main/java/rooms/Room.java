package rooms;


import behaviors.IContent;
import characters.Player;

import java.util.ArrayList;

public class Room {

    private ArrayList<Player> players;
    private ArrayList<IContent> contents;

    public Room() {
        this.players = new ArrayList<>();
        this.contents = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public void addContent(IContent content) {
        this.contents.add(content);
    }

    public ArrayList getContents() {
        return this.contents;
    }
}
