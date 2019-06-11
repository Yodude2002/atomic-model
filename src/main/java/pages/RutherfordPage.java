package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class RutherfordPage extends Page {
    public RutherfordPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Ernest Rutherford", 0xffffffff, 70,40, 10));
        uiManager.addElement(new ImageElement("Ernest_Rutherford_LOC.jpg", 990, 10, 1.2f));
        uiManager.addElement(new ImageElement("Atoms-Rutherford.jpg", 900, 500, 0.5f));
        uiManager.addElement(new ImageElement("Foil.jpg", 50, 450, 0.4f));
        uiManager.addElement(new TextElement(""+
                "When Rutherford joined the game, the previous model of the atom did not know of the nucleus\n" +
                "and just had the electrons floating in a positively charged soup.\n" +
                "   Rutherford created an experiment with alpha particles and a thin gold foil. It was expected\n" +
                "that the particles would pass straight through to the other side, but instead, occasionally\n" +
                "some particles would bounce away at extreme angles. The only explanation for this was that\n" +
                "the particles were hitting something in the gold.\n" +
                "   After collecting this evidence, Rutherford determined that the atom must have its mass concentrated\n" +
                "in just part of its space, in a nucleus, and the electrons orbit the nucleus at a distance. This\n" +
                "new version of the atom was once again a revelation",
                0xffffffff, 20, 20, 100));
    }
}
