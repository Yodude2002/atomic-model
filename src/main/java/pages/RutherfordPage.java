package pages;

import engine.engineElements.TextElement;

public class RutherfordPage extends Page {
    public RutherfordPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Rutherford", 0xffffffff, 10, 10, false));
    }
}
