
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import info.gridworld.actor.*;
import java.awt.Color; 

public class Jumper extends Bug{
	
	//private int numJumps;
	
	public Jumper(){
		
	}
	
	
	
	public boolean canMove(){
		Grid<Actor> gr = getGrid();
		 if (gr == null){
			 return false;
		 }
		 Location loc = getLocation();
		 Location next1 = loc.getAdjacentLocation(getDirection());
		 Location next2 = next1.getAdjacentLocation(getDirection());
		 if (!gr.isValid(next2)){
		 	return false;
		 }
		 Actor neighbor = gr.get(next2);
		 return (neighbor == null) || (neighbor instanceof Flower);
	
	}
	
	public void turn90(){
		turn();
		turn();
	}
	
	public void jump(){
		move();
		move();
	}
	
	public void act(){
		if (canMove()){
			jump();
		}
		else {
			turn90();
		}
			
		
	}
}