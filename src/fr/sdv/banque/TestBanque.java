package fr.sdv.banque;

import fr.sdv.banque.entites.Compte;
import fr.sdv.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];

        comptes[0] = new Compte(123456789, 1000.01);
        comptes[1] = new CompteTaux(987654321, 2000.50, 1.5f);

        for (Compte compte : comptes) {
            System.out.println(compte.toString());
        }
    }
}
