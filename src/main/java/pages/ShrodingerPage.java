package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class ShrodingerPage extends Page {
    public ShrodingerPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("Erwin Shrödinger", 0xffffffff, 70,40, 10));
        uiManager.addElement(new ImageElement("Shrod.jpg", 1025, 10, 0.5f, this));
        uiManager.addElement(new ImageElement("WaverPart.jpg", 300, 450, 0.4f, this));
        uiManager.addElement(new TextElement("" +
                "Shrödinger was perhaps the most influential scientist when it comes to the modern understanding of the atom.\n" +
                "He recognized that the atomic model could not be made black and white, and, like Heisenberg, he developed\n" +
                "a set of theories that accounted for the nebulous nature of the world at an atomic level.\n" +
                "   Shrödinger's work made bold claims about atomic and quantum theory, but it was all grounded in facts and\n" +
                "empirical evidence found by other scientists such as Einstein or Planck. Shrödinger's most important idea\n" +
                "was that light acts like both a wave and a particle. This concept of Wave-Particle Duality also applied to\n" +
                "electrons, and gave an explanation for previous models of the atom. Shrödinger also claimed that electrons have\n" +
                "angular momentum, or \"spin\". With all of these new ideas, Shrödinger pieced together an equation that describes\n" +
                "the wave function of a quantum-mechanical system, and in doing so, bridged the gap between Newtonian and\n" +
                "quantum physics." +
                "", 0xffffffff, 20,20,100));
    }
}
