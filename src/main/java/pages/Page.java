package pages;

import engine.Main;
import processing.event.MouseEvent;

/**
 * This interface specifies the methods that all Pages must have.
 *
 * In addition, all Pages must have a default constructor.
 * Only the default constructor will be called.
 */
public interface Page {

    /**
     * This method is called by {@link Main} on every frame that this Page is open
     * @param main the {@link processing.core.PApplet} for the application
     */
    void draw(Main main);

    /**
     * This method is called by {@link Main} every time this Page is clicked
     * @param main the {@link processing.core.PApplet} for the application
     */
    void onMouseEvent(Main main);

    /**
     * This method is called by {@link Main} every time a key is pressed and this Page is open
     * @param main the {@link processing.core.PApplet} for the application
     */
    void onKeyPress(Main main);

    /**
     * This method is called by {@link Main} very time the mouse is scrolled on this page
     * @param event the {@link processing.event.MouseEvent} for this event
     * @param main the {@link processing.core.PApplet} for the application
     */
    void onMouseWheel(MouseEvent event, Main main);
}
