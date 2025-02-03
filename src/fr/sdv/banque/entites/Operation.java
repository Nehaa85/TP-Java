package fr.sdv.banque.entites;

public abstract class Operation {
    private String date;
    private Double montant;

    public Operation(String date, Double montant) {
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public abstract String afficherType();

    @Override
    public String toString() {
        return "Date: " + date + ", Montant: " + montant+ ", Type: " + afficherType();
    }
}
