package BulletHell.Model;

import java.util.LinkedList;

/*
A point in a grid, each point should be able to hold several gameobjects. This will make it easier to check
intersections without having to implement actual hitboxes. Each gameobject will likely be in several gridpoints as well.

As a result we can check collisions simply by comparing if two objects are in the same list in some point.
 */
public class GridPoint {

    private LinkedList<IGameObject> objectsAtPoint = new LinkedList<IGameObject>();

    public void addObject(IGameObject o){
        objectsAtPoint.addLast(o);
    }

    public LinkedList getObjectsAtPoint(){
        return objectsAtPoint;
    }

    /*
    Looks to see if two objects are at the same point. Useful for checking if a bullet hits the player/enemy.
     */
    public boolean checkIntersection(IGameObject obj1, IGameObject obj2){

        return (objectsAtPoint.contains(obj1) && objectsAtPoint.contains(obj2));
    }
}
