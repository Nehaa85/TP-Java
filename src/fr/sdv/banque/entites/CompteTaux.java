package fr.sdv.banque.entites;

public class CompteTaux extends Compte {
    private Float tauxRemuneration;

    public CompteTaux(int numeroCompte, double soldeCompte, float tauxRemuneration) {
        super(numeroCompte, soldeCompte);

        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + " Taux de rémunération: " + tauxRemuneration;
    }
}
