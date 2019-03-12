import info.gridworld.actor.Bug;

/**
 * A <code>BoxBug</code> traces out a square "box" of a given size. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class DancingBug extends Bug {
	
	private int step;
	private int[] turnList;
	private int sideLength;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
		public DancingBug(int[] turns)
		 {
			 turnList = turns;
			 step = 0;
		 }
		 
		 public void turn(int times)
		 {
		 	for(int j = 1; j <= times; j++)
			 {
		 		turn();
		 	 }
		 }

		 public void act()
		 	{
				if(step == turnList.length){
					step = 0;
				}
				
				turn (turnList[step]);
				step++;
			    super.act();
		 }
		 
		
}
