package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class BohrPage extends Page {
    public BohrPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Niels Bohr", 0xffffffff, 70,40, 10));
        uiManager.addElement(new ImageElement("220px-Niels_Bohr.jpg", 990, 10, 1.2f, this));
        uiManager.addElement(new TextElement(""+
                "The Rutherford model was the latest model at the time, however Bohr problems with it, and\n" +
                "decided to create a new model, based on the Rutherford model, that could describe an atomic\n" +
                "model with Max Planck’s quantum theory.\n" +
                "   Bohr modeled the electrons that orbited around the nucleus of an atom. These electrons formed\n" +
                "electron shells around the nucleus, and they heavily impacted properties of the atom.\n" +
                "Electrons would jump between shells when the electron absorbs or gives off energy. Each\n" +
                "shell was determined to have a different number of maximum electrons, and they coincided\n" +
                "with the columns in the periodic table.\n" +
                "   Bohr saw that electrons in an atom should be giving off energy and getting closer to the\n" +
                "nucleus to make the atom collapse in Rutherford’s model, or even pushing an electron out of\n" +
                "position if influenced by another particle." +
                "By saying that the electrons follow an orbital path around the nucleus, Bohr fixed the problem\n" +
                "of Rutherford’s model being too unstable given classical physics.",
                0xffffffff, 20, 20, 100));
    }
}
