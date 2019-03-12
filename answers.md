Part 1
======
1. The big continues to cicle in the same direction
2. The bug moves up, down, left and right
3. The bug rotates direction
4. it changes to flowers color
5. the bug rotates towards another end of the grid
6. the bug rotates around the rock
7. no
8. its color can change
9. no
10. no they move away from eachother and the flowers are not drawn when a bug is on them

Excercises 

1.

Degree || Compass Direction
	0   || N
   45   || NE
   90   || E
  135   || SE
  180   || S
   225  || SW
  270   || W
  315   || NW
  360   || N
  
2. you can move the bug to anywhere within the grid, and when it moves out of the grid the program gives you an exception error
3. you use setColor
4. the bug dissapears

Part 2
======
1. number of steps on a side of the box
2. keeps track of how many steps the bug has done on a particular side
3. so that it turns a full 90 degress
4. because the box bug class extends the bug class
5. yes because when the boxbug is created the sidelength doesnt change
6. yes, if you add a rock or something to the pathway that it needs to move around to avoid
7. when the boxbog is first made the value of steps will be 0

Excercises

1. the bugs only turn 45 degrees when they encounter something that blocks them
2. spiral bug
3. z bug
4. dancing bug
5. in order to add another box bug to the grid, create another a BoxBug object with the desired side length and then dd the new BoxBug to the word at a random or specific location 

Part 3
======
Set 3:
1. you would call getRow
2. false
3. 4,4
4. SouthEast
5. it rounds to one of the closest location variables
Set 4:
1. check each box and have counters that sum up the filled and unfilled boxes
2. run isValid and the given location
3. AbstractGrid and the BoundedGrid and UnboundedGrid classes
4. yes because it requires less typing to call [] rather than a .get()
Set 5:
1. color, direction, location
2. color is blue and its initial direction is North
3. you can't call methods with an interface
4 a. no it will give you an error
4 b. no it will give you an error
4 c. yes it can
5. you can use setDirection and the Location.RIGHT
Set 6:
1. if(!gr.isValid(next))
2. return (neighbor == null) || (neighbor instanceof Flower); 
3. isValid and get because they show that a grid spot exists and whether it is occupied
4. getAdjacentLocation because method uses a bugs current direction to find where it can go
5. getLocation, getDirection
6. the bug is deleted
7. yes because it uses the bugs current location before it moves
8. it is easier to set the color to the same as a bugs color
9. yes
10. flower.putSelfInGrid(gr, loc);
11. 4 
Group:
1a. it will only jump one ahead
1b. it wont jump
1c. it will turn 90 degrees
1d. it will only jump once
1e. treat it like any other actor
1f. no

2a. the bug class
2b. the bug class
2c. yes it would need a color and direction
2d. overides canMove()
2e. canJump(), jump()
2f. test all scenarios

