package BulletHell.Model;

public class Bullet implements IGameObject {

    private String name = "regularBullet";
    protected int radius = 10;
    protected int eccentricity = 0;
    protected int angle = 0;
    protected int damageValue = 10;
    protected int movementSpeed = 10;



    public int getRadius() {
        return radius;
    }

    public void setRadius(int height) {
        this.radius = height;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(int eccentricity) {
        this.eccentricity = eccentricity;
    }

    public int getRawDamageValue() {
        return damageValue;
    }

    public int getCalculatedDamageValue(int level){
        return damageValue*level;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }

    public String getName(){
        return name;
    }
    
    public int[] getSize(){
        return new int[] {radius, eccentricity, angle};
    }




}
