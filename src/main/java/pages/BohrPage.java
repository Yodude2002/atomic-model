package pages;

import engine.engineElements.TextElement;

public class BohrPage extends Page {
    public BohrPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Bohr", 0xffffffff, 70,40, 10));
        uiManager.addElement(new TextElement("" +
                "[text]" +
                "", 0xffffffff, 20,20,100));
    }
}
