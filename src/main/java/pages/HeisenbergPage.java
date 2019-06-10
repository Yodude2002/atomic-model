package pages;

import engine.engineElements.TextElement;

public class HeisenbergPage extends Page {
    public HeisenbergPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Heisenberg", 0xffffffff, 10, 10));
    }
}