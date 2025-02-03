package fr.sdv.geometrie.entites;

import java.io.Serializable;

public class Rectangle implements ObjetGeometrique {
    public double longueur;
    public double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return 2 * longueur + largeur;
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }
}
