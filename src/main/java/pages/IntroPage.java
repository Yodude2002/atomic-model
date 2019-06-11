package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class IntroPage extends Page {
    public IntroPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("The Start of the Journey...",0xffffffff,50,20,10));
        uiManager.addElement(new TextElement("" +
                "The idea of the atom was first invented by the Ancient Greeks. They believed that all matter was made up of very small, indivisible\n" +
                "particles, and this became the accepted model. It would remain accepted and largely unchallenged for over two thousand years.\n" +
                "However, as soon as the model was first altered in a large way by J.J. Thomson, the theory was in for a tumultuous journey\n" +
                "over the course of the next century and a half." +
                "", 0xffffffff, 18, 100));
        uiManager.addElement(new ImageElement("Pillar.png",400,300));
    }
}
