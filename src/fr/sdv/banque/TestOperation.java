package fr.sdv.banque;

import fr.sdv.banque.entites.Operation;
import fr.sdv.banque.entites.Debit;
import fr.sdv.banque.entites.Credit;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[3];
        operations[0] = new Credit("01/02/2024", 100);
        operations[1] = new Debit("05/05/2024", 200);
        operations[2] = new Credit("28/07/2024", 300);

        double total = 0;
        for (Operation op : operations) {
            System.out.println(op);
            if (op instanceof Credit) {
                total += op.getMontant();
            } else if (op instanceof Debit) {
                total -= op.getMontant();
            }
        }

        System.out.println("Montant global des opérations: " + total);
    }
}
