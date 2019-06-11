package pages;

import engine.engineElements.TextElement;

public class ConclusionPage extends Page {
    public ConclusionPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Conclusion", 0xffffffff, 10, 10));
        uiManager.addElement(new TextElement(""+
                "Overall, the model has changed to reflect a more detailed representation of the atom.\n" +
                "It started out with J.J. Thompson’s model determined that an atom was just a glob of electrons.\n" +
                "Even though his model doesn’t sound very accurate, it is still much more accurate than anything\n" +
                "that came before. Robert Milikan determined the charge that a single electron carries, and\n" +
                "ended opposition to new atomic theories. Rutherford discovered with his gold foil experiment\n" +
                "that the nucleus is compact and positively charged, while negatively charged electrons orbited\n" +
                "the nucleus. Bohr built upon that and modeled electrons moving in an orbit in electron shells that\n" +
                "impact properties of the atom. Chadwick found the existence of the neutron, and added it to Bohr’s\n" +
                "model. Schrödinger determined that electrons have spin associated with them, and bridged gaps\n" +
                "between classical physics and quantum physics.",
                0xffffffff, 20, 20, 100));
    }
}
