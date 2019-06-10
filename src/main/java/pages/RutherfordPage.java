package pages;

import engine.Main;
import engine.TextElement;
import processing.event.MouseEvent;

public class RutherfordPage extends Page {
    public RutherfordPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Rutherford", 0xffffffff, 10, 10));
    }
    public void onKeyPress(Main main)
    {

    }
    public void onMouseWheel(MouseEvent event, Main main)
    {

    }
}
