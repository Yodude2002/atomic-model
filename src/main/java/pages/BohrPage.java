package pages;

import engine.engineElements.TextElement;

public class BohrPage extends Page {
    public BohrPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Bohr", 0xffffffff, 10, 10, false));
    }
}
