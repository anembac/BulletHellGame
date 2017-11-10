package BulletHell.Model;


public class Character implements IGameObject {

    private String name = "Character";
    private int lives;
    private int level;
    private Bullet bulletType;
    private double movementSpeed;
    private int radius = 10;
    private int eccentricity = 0;
    private int angle = 0;

/*
TODO: Should probably have like an abstract hitbox (same goes for bullets) instead of individual size params
 */

    public void shoot(){

    }

    public String getName(){
        return name;
    }

    public int[] getSize(){
        return new int[] {radius, eccentricity, angle};
    }
}
