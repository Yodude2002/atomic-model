package pages;

import engine.engineElements.BackgroundColorElement;
import engine.Main;
import engine.UIManager;
import processing.event.MouseEvent;

/**
 * This abstract class specifies the methods that all Pages must have, and will have parts of Pages that all pages have.
 *
 * In addition, all Pages must have a default constructor.
 * Only the default constructor will be called.
 */
public abstract class Page {
    protected int scrollLimit;
    protected UIManager uiManager;
    public Page(int backgroundColor)
    {
        scrollLimit = 400;
        uiManager = new UIManager(this);
        uiManager.addElement(new BackgroundColorElement(backgroundColor) {
            @Override
            public void click(Main app)
            {
                app.setPage(0);
            }
        });
    }
    /**
     * This method is called by {@link Main} on every frame that this Page is open
     * @param main the {@link processing.core.PApplet} for the application
     */
    public void draw(Main main)
    {
        uiManager.draw(main);
    }

    /**
     * This method is called by {@link Main} every time this Page is clicked
     * @param main the {@link processing.core.PApplet} for the application
     */
    public void onMouseEvent(Main main)
    {
        uiManager.click(main);
    }

    /**
     * This method is called by {@link Main} every time a key is pressed and this Page is open
     * @param main the {@link processing.core.PApplet} for the application
     */
    public void onKeyPress(Main main)
    {

    }
    /**
     * This method is called by {@link Main} very time the mouse is scrolled on this page
     * @param event the {@link processing.event.MouseEvent} for this event
     * @param main the {@link processing.core.PApplet} for the application
     */
    public void onMouseWheel(MouseEvent event, Main main)
    {
        uiManager.scroll(event, main);
    }
    public int getScrollLimit()
    {
        return scrollLimit;
    }
}
