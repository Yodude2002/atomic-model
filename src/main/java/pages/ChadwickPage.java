package pages;

import engine.engineElements.TextElement;

public class ChadwickPage extends Page {
    public ChadwickPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Chadwick", 0xffffffff, 10, 10));
    }
}
