package pages;

import engine.engineElements.TextElement;

public class MillikanPage extends Page {
    public MillikanPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Millikan", 0xffffffff, 10, 10, false));
    }
}
