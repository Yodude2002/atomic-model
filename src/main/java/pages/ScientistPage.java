package pages;

import engine.BackgroundColorElement;
import engine.Main;
import engine.TextElement;
import engine.UIManager;
import processing.event.MouseEvent;

public abstract class ScientistPage extends Page
{
    protected UIManager uiManager;
    public ScientistPage(String name, int textColor, int backgroundColor)
    {
        super(backgroundColor);
        uiManager.addElement(new TextElement(name, textColor, 10, 10));
    }
    @Override
    public void onKeyPress(Main main) {

    }

    @Override
    public void onMouseWheel(MouseEvent event, Main main) {

    }
}