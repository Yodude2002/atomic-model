package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class HeisenbergPage extends Page {
    public HeisenbergPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Werner Heisenberg", 0xffffffff, 70,40, 10));
        uiManager.addElement(new ImageElement("Heisenberg.jpg", 995, 10, 1.4f, this));
        uiManager.addElement(new ImageElement("ProbFields.jpg", 300, 450, this));
        uiManager.addElement(new TextElement("" +
                "The creation of the Bohr model was a fantastic step forward for the model of the atom, Heisenberg was\n" +
                "a little *uncertain* about the rigidity of the Bohr model. Heisenberg saw the claim by the Bohr model that\n" +
                "electrons had fixed orbits around a nucleus to be not quite right. Nothing would be that perfect.\n" +
                "   And, as it turned out, he was right! Using just a little bit of theoretical quantum math, Heisenberg\n" +
                "deduced that the more accurately the position of a particle is known, the less is known about its momentum,\n" +
                "and vice versa.\n" +
                "   Thanks to Heisenberg's uncertainty principle, the accepted model of the atom was updated to incorporate\n" +
                "probability fields, giving possible locations for electrons at any given moment, rather than precise orbital\n" +
                "paths. This work would go on to build the foundation for quantum mechanics." +
                "", 0xffffffff, 20,20,100));
    }
}