package pages;

import engine.Main;
import engine.TextElement;
import processing.event.MouseEvent;

public class BohrPage extends Page {
    public BohrPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Bohr", 0xffffffff, 10, 10));
    }
    public void onKeyPress(Main main)
    {

    }
    public void onMouseWheel(MouseEvent event, Main main)
    {

    }
}
