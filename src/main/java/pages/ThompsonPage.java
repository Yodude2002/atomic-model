package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class ThompsonPage extends Page {
    public ThompsonPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("J.J. Thompson", 0xffffffff, 10, 10, false));
        uiManager.addElement(new ImageElement("JJ_Thomson.jpg", 10, 64, 0.4f, this));
    }
}
