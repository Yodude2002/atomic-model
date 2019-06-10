package pages;

import engine.engineElements.TextElement;

public class CitationPage extends Page {
    public CitationPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Works Cited", 0xffffffff, 10, 10, false));
    }
}
