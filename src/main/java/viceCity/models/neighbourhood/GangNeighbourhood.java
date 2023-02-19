package viceCity.models.neighbourhood;

import viceCity.models.players.Player;

import java.util.ArrayList;
import java.util.Collection;

public class GangNeighbourhood implements Neighbourhood{

    private Player mainPlayer;
    private Collection<Player> civilPlayers;

    public GangNeighbourhood() {
        this.mainPlayer = mainPlayer;
        this.civilPlayers = new ArrayList<Player>();
    }

    @Override
    public void action(Player mainPlayer, Collection<Player> civilPlayers) {

    }
}
