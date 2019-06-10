package pages;

import engine.Main;
import engine.TextElement;
import processing.event.MouseEvent;

public class IntroPage extends Page {
    public IntroPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Intro", 0xffffffff, 10, 10));
    }
    public void onKeyPress(Main main)
    {

    }
    public void onMouseWheel(MouseEvent event, Main main)
    {

    }
}
