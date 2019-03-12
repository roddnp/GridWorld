import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ZBug extends Bug {
	
	private int steps;
	private int sideLength;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) {
		setDirection(90); 
		steps = 0;
		sideLength = length;
	}

	
	public void act() {
		int i =0;
		int j =0;
		int k =0;
		while ( i <= sideLength){
			move();
			i++;
		}
		turn();
		turn();
		turn();
		while (j <= sideLength){
			move();
			j++;
		}
		setDirection(90); 
		while ( k <= sideLength){
			move();
			k++;
		}
	}
}
