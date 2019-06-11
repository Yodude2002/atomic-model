package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class MillikanPage extends Page {
    public MillikanPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Robert Millikan", 0xffffffff, 70,40, 10));
        uiManager.addElement(new ImageElement("Millikan.jpg", 995, 10, 0.55f, this));
        uiManager.addElement(new ImageElement("OilDrop.jpg", 300, 650, this));
        uiManager.addElement(new TextElement("" +
                "When Millikan stepped into the ring of atomic theory, he had more of a starting point to work from than\n" +
                "Thomson had; thanks to J.J. Thomson, Millikan knew about the presence of a tiny, negatively charged particle\n" +
                "called the electron that was an integral part of the atom. He also knew that there was a lot of room to expand\n" +
                "the scientific understanding of this nebulous particle.\n" +
                "   And so, Millikan designed his famous oil drop experiments, in which he set up a system to measure the\n" +
                "charge of the electron. Millikan sprayed oil droplets into a chamber where they accelerated to terminal velocity,\n" +
                "at which point their mass was calculated. Then, a charge was applied to the droplets using x-rays until the air\n" +
                "particles lost electrons, and the use of a battery could suspend the oil in mid-air. Finally, the process of data\n" +
                "collection combined with the equation:\n" +
                "                       mass X gravity = charge X electric field\n" +
                "revealed that the charge on a drop was always a multiple of 1.59 X 10^(-19) Coulombs.\n" +
                "   This revelation allowed Millikan to conclude that 1.59 X 10^(-19) C was the fundamental charge of a single\n" +
                "electron. Using this newfound number along with Thomson's charge-to-mass ratio, Millikan was finally able to calculate\n" +
                "the charge of an electron.\n" +
                "   While Millikan did not make any radical shifts from Thomson's model, he did add a layer of clarity that did not exist\n" +
                "before by finding more proof for the existence and properties of electrons. For his work, Millikan was awarded the Nobel\n" +
                "Prize for Physics in 1923." +
                "", 0xffffffff, 20,20,100));
    }
}
