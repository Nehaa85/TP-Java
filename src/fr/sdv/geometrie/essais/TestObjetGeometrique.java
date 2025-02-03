package fr.sdv.geometrie.essais;

import fr.sdv.geometrie.entites.*;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objets=new ObjetGeometrique[2];
        objets[0] = new Cercle(5.0);
        objets[1] = new Rectangle(4.0, 6.0);

        for (ObjetGeometrique obj : objets) {
            System.out.println("Périmètre :" + obj.perimetre());
            System.out.println("Surface :" + obj.surface());
            System.out.println("--------------------------------");
        }
    }
}
