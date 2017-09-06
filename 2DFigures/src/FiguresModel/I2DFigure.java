
package FiguresModel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author migue
 */
public interface I2DFigure {
    public void Show(Graphics g, Color color);
    public boolean Select(Point p);
    public void SetPosition(Point position);
    public Point GetPosition();
}
