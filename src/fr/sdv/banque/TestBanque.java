package fr.sdv.banque;

import fr.sdv.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("123456789", 1000.01);

        System.out.println(compte);
    }
}
