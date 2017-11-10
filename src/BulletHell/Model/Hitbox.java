package BulletHell.Model;
/*
Hitbox should be connected to an entity on the stage. No coordinates should be necessary since all actions should be
relative to the entity's position, not the absolute position of the stage.
 */
public class Hitbox {

    private boolean[][] shape;

    public Hitbox(int x, int y){
        shape = createShape(x,y);
    }

    /*
    Creates a matrix of booleans that can be used to fill entity's size in the grid.

    TODO: hitbox shouldn't need to be regular in shape, probably hard as fuck to implement
     */
    private boolean[][] createShape(int xSize, int ySize){
        boolean[][] tmp = new boolean[xSize][ySize];
        for(int i = 0; i<xSize;i++){
            for( int j = 0; j<ySize;j++){
                tmp[i][j] = true;
            }
        }
        return tmp;
    }

}
