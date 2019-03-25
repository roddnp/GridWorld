import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class BlusterCritter extends Critter{

private int c;
 
public void processActors(ArrayList<Actor> actors) {
	int n = actors.size();
	if (n == 0){
		Color color = getColor();
		int red = (int) (color.getRed() * (1 - .5));
		int green = (int) (color.getGreen() * (1 - .5));
		int blue = (int) (color.getBlue() * (1 - .5));
		setColor(new Color(red, green, blue)); 
		return;
	}
	int r = (int) (Math.random() * n);

	Actor other = actors.get(r);
	setColor(other.getColor());
}


public void makeMove(Location loc) {
	setDirection(getLocation().getDirectionToward(loc));
	super.makeMove(loc);
}

}