package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class BohrPage extends Page {
    public BohrPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Niels Bohr", 0xffffffff, 70,40, 10));
        uiManager.addElement(new ImageElement("220px-Niels_Bohr.jpg", 990, 10, 1.2f));
        uiManager.addElement(new ImageElement("BohrModel.jpg", 200, 650));
        uiManager.addElement(new ImageElement("BohrTable.jpg", 700, 650));

        uiManager.addElement(new TextElement(""+
                "The Rutherford model was the latest model at the time, however Bohr problems with it, primarily\n" +
                "and because the Rutherford model did not explain how electrons stayed outside of the positively\n" +
                "charged nucleus. So, Bohr decided to create a new model, based on the Rutherford model, that could\n" +
                "describe an atomic model with Max Planck’s quantum theory.\n" +
                "   Bohr modeled the electrons that orbited around the nucleus of an atom. These electrons formed\n" +
                "electron shells around the nucleus, and they heavily impacted properties of the atom.\n" +
                "Electrons would jump between shells when the electron absorbs or gives off energy. Each\n" +
                "shell was determined to have a different number of maximum electrons, and they coincided\n" +
                "with the columns in the periodic table.\n" +
                "   Bohr saw that electrons in an atom should be giving off energy and getting closer to the\n" +
                "nucleus to make the atom collapse in Rutherford’s model, or even pushing an electron out of\n" +
                "position if influenced by another particle. But, by saying that the electrons follow an orbital\n" +
                "path around the nucleus, Bohr fixed the problem of Rutherford’s model being too unstable given\n" +
                "classical physics, and created one of the simplest models for the atom with a nearly complete\n" +
                "understanding of its critical features. The Bohr model of the atom is used to this day in education,\n" +
                "to great effect, and this model opened the door to even more complicated quantum understandings of\n" +
                "the atom.",
                0xffffffff, 20, 20, 100));
    }
}
