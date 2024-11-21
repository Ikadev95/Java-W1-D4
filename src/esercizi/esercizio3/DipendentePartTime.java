package esercizi.esercizio3;

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

    @Override
    public void checkIn() {
        System.out.println("inizio orario: ore 8:40");
    }
}
