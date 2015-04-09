package GUI;

import java.awt.*;

/**
 * Created by droit on 09/04/15.
 * Class IHM Route
 */
public class IHMRoute {

    public void dessinerRouteVerticale(Graphics contexteGraphique, int ypos) {
        contexteGraphique.fillRect(0, ypos, 300000, 30);
    }

    public void dessinerRouteHorizontale(Graphics contexteGraphique, int xpos) {
        contexteGraphique.fillRect(xpos, 0, 30, 3000000);
    }

}
