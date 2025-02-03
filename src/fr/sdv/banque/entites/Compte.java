package fr.sdv.banque.entites;

public class Compte {
    private int numeroCompte;
    private double soldeCompte;

    public Compte(int numeroCompte, double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte : " + numeroCompte + " Solde : " + soldeCompte;
    }
}

