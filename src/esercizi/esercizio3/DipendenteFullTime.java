package esercizi.esercizio3;

public class DipendenteFullTime extends Dipendente {

    private double stipendio;

    public DipendenteFullTime(int matricola, Dipartimento dipartimento, double stipendio) {
        super(matricola, dipartimento);
        this.stipendio = stipendio;
    }

    @Override
    public double calculateSalary() {
        return stipendio;
    }

    @Override
    public void checkIn() {
        System.out.println("inizio orario: ore 9");
    }
}
