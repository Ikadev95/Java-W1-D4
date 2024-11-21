package esercizi.esercizio2;

public class DipendentePartTime extends Dipendente {

    private double tariffaOraria;
    private int oreLavorate;

    public DipendentePartTime(int matricola, Dipartimento dipartimento, double tariffaOraria, int oreLavorate) {
        super(matricola, dipartimento);
        this.tariffaOraria = tariffaOraria;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return tariffaOraria * oreLavorate;
    }

}
