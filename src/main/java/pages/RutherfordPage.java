package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class RutherfordPage extends Page {
    public RutherfordPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Rutherford", 0xffffffff, 10, 10));
        uiManager.addElement(new ImageElement("Ernest_Rutherford_LOC.jpg", 990, 10, 1f, this));
        uiManager.addElement(new TextElement(""+
                "The previous model did not know of the nucleus and thus had the electrons just floating\n" +
                "in a positively charged soup.\n" +
                "Rutherford created an experiment with alpha particles and a thin gold foil. It was expected\n" +
                "that the particles will pass straight through to the other side, but instead occasionally\n" +
                "some particles will bounce away from interacting with the gold atoms.\n" +
                "Rutherford determined that the atom must have its mass concentrated into a small space in a\n" +
                "nucleus, and the electrons orbit the nucleus at a distance.",
                0xffffffff, 20, 20, 100));
    }
}
