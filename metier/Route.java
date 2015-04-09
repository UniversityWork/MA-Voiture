package metier;

/**
 * Created by droit on 09/04/15.
 * A graphical view of a road (gray square)
 */
public class Route {

    private int x;
    private int y;
    private int directionEnDegres;

    public Route(int x, int y, int dir) {
        this.x = x;
        this.y = y;
        this.directionEnDegres = dir;
    }

    public int getDirectionEnDegres() {
        return directionEnDegres;
    }

}
