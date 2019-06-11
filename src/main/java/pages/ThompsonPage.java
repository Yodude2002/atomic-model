package pages;

import engine.engineElements.ImageElement;
import engine.engineElements.TextElement;

public class ThompsonPage extends Page {
    public ThompsonPage()
    {
        super(0xff000000);
        uiManager.addElement(new TextElement("J.J. Thompson", 0xffffffff, 70, 40, 10));
        uiManager.addElement(new ImageElement("JJ_Thomson.jpg", 1022, 10, 0.4f));
        uiManager.addElement(new ImageElement("ThomsonModel.jpg", 600, 800));
        uiManager.addElement(new TextElement("" +
                "When Thomson began his work on the atomic model, the only previous model he had to work off of\n" +
                "was the one created by John Dalton, that had been proposed as early as the time of Ancient Greece.\n" +
                "This prior model stated that the atom was a very small sphere, with no internal components, and\n" +
                "while the simplest explanation is often correct, Thomson was disinclined to believe that there were\n" +
                "not more complex factors at play.\n" +
                "   Thomson designed a cathode ray tube with two metal cylinders at the end with a gap between them,\n" +
                "wherein the cylinders were also attached to an electrometer to measure the electrical output of the ray.\n" +
                "Using magnets he attempted to bend the ray separating the ray and the negative charge the ray had. The\n" +
                "magnets did not separate them, though it did bend the ray. Previous attempts to bend cathode rays with an\n" +
                "electric field had failed, but Thompson suspected that the gas in the tube was used as a conductor so he\n" +
                "then tested his idea using an electric field of the ray in a vacuum to find if it would bend. To his delight,\n" +
                "it did! Thompson also found the mass to electric charge ratio of the particle by measuring how much the\n" +
                "electric field bent the ray. The ratio was considerably smaller than a charged hydrogen atom.\n" +
                "   Thomson’s earlier experiments with cathode rays determined that the cathode rays and the charge were\n" +
                "connected. His experiments in finding the mass to electric charge ratio of the particle determined that the\n" +
                "particle either had an immense charge compared to a hydrogen atom or was considerably smaller than a hydrogen\n" +
                "atom.\n" +
                "   Following his experiments, Thomson concluded that the most detailed model he could create would be the \"plum\n" +
                "pudding model\". Of course he did not call it this, but his model claimed that the atom was a glob of negative\n" +
                "electrons floating in a soup of positive charge, like plums in a pudding. This model was a huge leap from the\n" +
                "previous belief that the atom was indivisible, but was still far from an absolute understanding, and left much\n" +
                "room for improvement."+
                "", 0xffffffff, 20, 20, 100));
    }
}
