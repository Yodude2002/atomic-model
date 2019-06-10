package pages;

import engine.engineElements.TextElement;

public class ShrodingerPage extends Page {
    public ShrodingerPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Shrödinger", 0xffffffff, 10, 10, false));
    }
}
