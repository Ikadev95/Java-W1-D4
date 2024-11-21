package esercizi.esercizio3;

public class Dirigente extends Dipendente {

    private double stipendio;
    private double bonus;

    public Dirigente(int matricola, Dipartimento dipartimento, double stipendio, double bonus) {
        super(matricola, dipartimento);
        this.stipendio = stipendio;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return stipendio + bonus;
    }

    @Override
    public void checkIn() {
        System.out.println("inizio orario: ore 10");
    }
}
