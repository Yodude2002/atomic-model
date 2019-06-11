package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class ConclusionPage extends Page {
    public ConclusionPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Conclusion", 0xffffffff, 70,40,10));
        uiManager.addElement(new ImageElement("progress.jpg", 20, 550));
        uiManager.addElement(new TextElement(""+
                "Overall, the atomic model has changed to reflect a more detailed representation of the atom.\n" +
                "It started out with J.J. Thompson’s model determined that an atom was just a glob of electrons.\n" +
                "Even though his model doesn’t sound very accurate, it is still much more accurate than anything\n" +
                "that came before. Robert Milikan determined the charge that a single electron carries, and\n" +
                "ended opposition to new atomic theories. Rutherford discovered with his gold foil experiment\n" +
                "that the nucleus is compact and positively charged, while negatively charged electrons orbited\n" +
                "the nucleus. Bohr built upon that and modeled electrons moving in an orbit in electron shells that\n" +
                "impact properties of the atom. Chadwick found the existence of the neutron, and added it to Bohr’s\n" +
                "model. Schrödinger determined that electrons have spin associated with them, and bridged gaps\n" +
                "between classical physics and quantum physics. And now, the journey is far from over. It may have\n" +
                "been a little while since the last real jump in progress, but the model is ever evolving, and the\n" +
                "model we currently know of allows us to understand quantum mechanics in our current world. So, for\n" +
                "now, the atom is a mess of probability fields and wave particle diagrams and neutrons and protons.\n" +
                "       Who knows what it will be tomorrow.",
                0xffffffff, 20, 20, 100));
    }
}
