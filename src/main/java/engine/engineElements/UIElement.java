package engine.engineElements;

import engine.Main;
import pages.Page;
import processing.core.PApplet;

public interface UIElement
{
    /**
     * draws onto the given papplet
     */
    void draw(Main app);
    /**
     * this element has been clicked on
     */
    void click(Main app);
    /**
     * gets the x position of this element
     */
    int getX();
    /**
     * gets the y position of this element
     */
    int getY();
    /**
     * gets the width of this element;
     */
    int getWidth();
    /**
     * gets the height of this element
     */
    int getHeight();
}