package fr.sdv.geometrie.entites;

import java.io.Serializable;

public class Cercle implements ObjetGeometrique{
    public double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre(){
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface(){
        return Math.PI * rayon * rayon;
    }

}
