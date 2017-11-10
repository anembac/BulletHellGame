package BulletHell.Model;

/*
Grid to be placed in the Stage. Holds a large amount of points that in turn contain lists of what object (if any) is
on that point in the grid.

Note: currently at 4000*10000 there are 40 million points. This might be a bit much if I ever need to run through them
all for calculations. If I regularly need to run through them all the game will play at a snail's pace...

On the other hand; the higher the number of points, the better precision my hit detection will have.
 */
public class Grid {

    private GridPoint[][] gridPoints = new GridPoint[4000][10000];


    /*
    TODO:
    We need a method that places objects in the correct points. Preferably should be able to take an object of
    arbitrary size and place it in a group of points.

    For this to work we will need to know:

    * The size of the object
    * The position of the object


     */

    public void placeObjectInPoints(IGameObject obj){

    }
}
