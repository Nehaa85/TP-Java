package fr.sdv.banque.entites;

public class Compte {
    private String numeroCompte;
    private Double soldeCompte;

    public Compte(String numeroCompte, Double soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte : " + numeroCompte + " Solde : " + soldeCompte;
    }
}
